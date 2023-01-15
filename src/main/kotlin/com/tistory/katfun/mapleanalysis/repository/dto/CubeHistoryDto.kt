package com.tistory.katfun.mapleanalysis.repository.dto

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
    val BeforePotentialOptions: Array<CubeResultOptionDto>,
    val BeforeAdditionalPotentialOptions: Array<CubeResultOptionDto>,
    val AfterPotentialOptions: Array<CubeResultOptionDto>,
    val AfterAdditionalPotentialOptions: Array<CubeResultOptionDto>
){
    companion object {

    }
}