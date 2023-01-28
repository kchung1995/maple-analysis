package com.tistory.katfun.mapleanalysis.repository.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class CubeHistoryDto(
    val id: String,
    val characterName: String,
    val createDate: String,
    val cubeType: String,
    val itemUpgradeResult: String,
    val miracleTimeFlag: String,
    val itemEquipPart: String,
    val itemLevel: Int,
    val targetItem: String,
    val potentialOptionGrade: String,
    val additionalPotentialOptionGrade: String,
    val beforePotentialOptions: List<CubeResultOptionDto> = emptyList(),
    val beforeAdditionalPotentialOptions: List<CubeResultOptionDto> = emptyList(),
    val afterPotentialOptions: List<CubeResultOptionDto> = emptyList(),
    val afterAdditionalPotentialOptions: List<CubeResultOptionDto> = emptyList()
){
    companion object {

    }
}