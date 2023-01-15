package com.tistory.katfun.mapleanalysis.repository

import com.tistory.katfun.mapleanalysis.domain.Users
import org.springframework.data.repository.CrudRepository

interface UsersRepository : CrudRepository <Users, Long> {

}