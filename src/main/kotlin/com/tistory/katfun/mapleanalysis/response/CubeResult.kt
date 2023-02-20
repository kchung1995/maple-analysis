package com.tistory.katfun.mapleanalysis.response

import com.tistory.katfun.mapleanalysis.repository.dto.CubeResultOptionDto
import org.slf4j.LoggerFactory

data class CubeResult(
    val firstResult: ResultUnit,
    val secondResult: ResultUnit,
    val thirdResult: ResultUnit,
    val type: CubeType
) {
    companion object {
        fun of(cubeResult: List<CubeResultOptionDto>, type: CubeType): CubeResult {
            require(cubeResult.size == 3)
            with(cubeResult) {
                return CubeResult(
                    firstResult = ResultUnit(this[0].value, Grade.convert(this[0].grade)),
                    secondResult = ResultUnit(this[1].value, Grade.convert(this[1].grade)),
                    thirdResult = ResultUnit(this[2].value, Grade.convert(this[2].grade)),
                    type = type
                )
            }
        }
    }
}

data class ResultUnit(
    val value: String,
    val Grade: Grade
)

enum class CubeType {
    NORMAL,
    ADDITIONAL;

    fun convert(list: List<CubeResultOptionDto>): CubeType {
        return when (list.size) {
            3 -> NORMAL
            else -> ADDITIONAL
        }
    }
}

enum class Grade {
    RARE,
    EPIC,
    UNIQUE,
    LEGENDARY,
    UNDEFINED;

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)

        fun convert(grade: String): Grade {
            return when (grade) {
                "레어" -> RARE
                "에픽" -> EPIC
                "유니크" -> UNIQUE
                "레전더리" -> LEGENDARY
                else -> {
                    log.warn("Undefined grade: $grade")
                    UNDEFINED
                }
            }
        }
    }
}
