package com.tistory.katfun.mapleanalysis.repository.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class CubeHistoryResponseDto(
    val count: Int,
    val cubeHistories: List<CubeHistoryDto>,
    val nextCursor: String?,
) {
    companion object {

    }
}
