package com.guruguruzom.redis2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.guruguruzom.redis2.domain.UserVo;
import com.guruguruzom.redis2.repository.RedisRepository;

@SpringBootTest
class Redis2ApplicationTests {

	@Autowired
	private RedisRepository redisRepository;
	
	@Test
	void contextLoads() {
		UserVo userVo = new UserVo("guruguruzom", "¾ö¿ëÁø");
		
		System.out.println(redisRepository.count());
		redisRepository.save(userVo);
		
		
		
		redisRepository.findById("guruguruzom");
		
		System.out.println(redisRepository.count());
		
		redisRepository.deleteById("guruguruzom");
	}

}
