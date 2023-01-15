package com.tistory.katfun.mapleanalysis.api

import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class MapleApiService(
    private val cubeResultApiClient: WebClient,
) {

    val yondoreuToken: String =
        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJYLUFwcC1SYXRlLUxpbWl0IjoiNTAwOjEwIiwiYWNjb3VudF9pZCI6IjE4Mjg3OTEyMjkiLCJhdXRoX2lkIjoiMiIsImV4cCI6MTY4NzA4OTExMywiaWF0IjoxNjcxNTM3MTEzLCJuYmYiOjE2NzE1MzcxMTMsInNlcnZpY2VfaWQiOiI0MzAwMTEzOTciLCJ0b2tlbl90eXBlIjoiQWNjZXNzVG9rZW4ifQ.wWfsCejFLIOTpKknlZpMgg9ie_JHpNvEq5xEOwSWIt4"
    val url: String = "/v1/cube-use-results"

    fun cubeResultApi(count: Int, date: String?, cursor: String?): String? {
        val response: String? = cubeResultApiClient
            .get()
            .uri {
                it.path(url)
                    .queryParam("count", count)
                    .queryParam("date", date)
                    .queryParam("cursor", "")
                    .build()
            }
            .accept(MediaType.APPLICATION_JSON)
            .header("authorization", yondoreuToken)
            .retrieve()
            .bodyToMono(String::class.java).log()
            .block()

        return response
    }
}