package com.tistory.katfun.mapleanalysis.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MapleApiController(
    private val mapleApiService: MapleApiService
) {

    @GetMapping("/cube")
    fun cubeResultApi(@RequestParam count: Int, @RequestParam date: String?, @RequestParam cursor: String?): String? {
        return mapleApiService.cubeResultApi(count, date, cursor)
    }
}