package com.tistory.katfun.mapleanalysis.webclient

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {

    @Bean
    fun maplestoryOpenApiClient(): WebClient = WebClient.builder()
        .baseUrl("https://public.api.nexon.com/openapi/maplestory")
        .build()
}