package com.guruguruzom.redis2.repository;

import org.springframework.data.repository.CrudRepository;

import com.guruguruzom.redis2.domain.UserVo;

public interface RedisRepository extends CrudRepository<UserVo, String> {

}
