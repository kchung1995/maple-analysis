package com.tistory.katfun.mapleanalysis.api

import com.tistory.katfun.mapleanalysis.repository.dto.CubeHistoryResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MapleApiController(
    private val mapleApiService: MapleApiService
) {

    @GetMapping("/cube")
    fun cubeResultApi(
        @RequestParam count: Int,
        @RequestParam date: String?,
        @RequestParam cursor: String?
    ): CubeHistoryResponseDto? {
        return mapleApiService.cubeResultApi(count, date, cursor)
            .block()
    }
}