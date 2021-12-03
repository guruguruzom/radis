package com.guruguruzom.redis2.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;

@Getter
@RedisHash
public class UserVo {

	@Id
	private String id;
	private String name;
	private Date createAt;
	
	public UserVo(String id,String name) {
		this.id = id;
		this.name = name;
		this.createAt = new Date();
	}
}
