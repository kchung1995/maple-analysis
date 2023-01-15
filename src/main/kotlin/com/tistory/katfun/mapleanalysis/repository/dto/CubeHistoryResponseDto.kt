package com.tistory.katfun.mapleanalysis.repository.dto

data class CubeHistoryResponseDto(
    val count: Int,
    val cubeHistories: Array<CubeHistoryResponseDto>,
    val nextCursor: String,
) {
    companion object {

    }
}
