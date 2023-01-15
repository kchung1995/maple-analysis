package com.tistory.katfun.mapleanalysis.domain

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Users (
    var token: String,
    var createdAt: LocalDateTime = LocalDateTime.now(),
    var editedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long
)