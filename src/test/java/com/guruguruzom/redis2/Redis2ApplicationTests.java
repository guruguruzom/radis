package com.guruguruzom.redis2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.guruguruzom.redis2.domain.UserVo;
import com.guruguruzom.redis2.repository.RedisRepository;

import redis.clients.jedis.JedisPoolConfig;


@SpringBootTest
class Redis2ApplicationTests {

	@Autowired
	private RedisRepository redisRepository;

	@Test
	void contextLoads() {
		UserVo userVo = new UserVo("guruguruzom", "엄용진");

		System.out.println(redisRepository.count());
		redisRepository.save(userVo);

		redisRepository.findById("guruguruzom");

		System.out.println(redisRepository.count());

		redisRepository.deleteById("guruguruzom");
	}

	@Test
	void jedisTest() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		//JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		/*JedisPool pool = new JedisPool(jedisPoolConfig, "localhost", 6379, 1000, "jeongpro");//Jedis풀 생성(JedisPoolConfig, host, port, timeout, password)
		Jedis jedis = pool.getResource();//thread, db pool처럼 필요할 때마다 getResource()로 받아서 쓰고 다 쓰면 close로 닫아야 한다.
//		데이터 입력        
		jedis.set("jeong", "pro");
		//데이터 출력
		System.out.println(jedis.get("jeong"));
		//pro
//데이터 삭제
		jedis.del("jeong");
		System.out.println(jedis.get("jeong"));//null
		try {
			jedis.set("key", "value");
			//데이터 만료시간 지정
			jedis.expire("key", 5);//5초 동안만 "key"를 key로 갖는 데이터 유지
			Thread.sleep(4000);//쓰레드를 4초간 재우고
			System.out.println(jedis.get("key"));//value
			Thread.sleep(2000);//1초했더니 운좋으면 살아있어서 2초로 지정
			System.out.println(jedis.get("key"));//null
		} catch (Exception e) {            
			e.printStackTrace();        
		}                 Lists 형태 입출력 
		jedis.lpush("/home/jdk", "firstTask");
		jedis.lpush("/home/jdk", "secondTask");
		System.out.println(jedis.rpop("/home/jdk"));//firstTask
		System.out.println(jedis.rpop("/home/jdk"));//secondTask
		 Sets 형태 입출력 
		jedis.sadd("nicknames", "jeongpro");
		jedis.sadd("nicknames", "jdk");
		jedis.sadd("nicknames", "jeongpro");
		Set<String> nickname = jedis.smembers("nicknames");
		Iterator iter = nickname.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}                
		 Hashes 형태 입출력 
		jedis.hset("user", "name", "jeongpro");
		jedis.hset("user", "job", "software engineer");
		jedis.hset("user", "hobby", "coding");
		System.out.println(jedis.hget("user","name"));//jeongpro
		Map<String, String> fields = jedis.hgetAll("user");
		System.out.println(fields.get("job"));//software engineer
			 Sorted Sets 형태 입출력 
		
		if(jedis != null) {
			jedis.close();
		}
		pool.close();*/
	}

}
