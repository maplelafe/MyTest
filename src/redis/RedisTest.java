package redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Redis֧�������������ͣ�string���ַ�������hash����ϣ����list���б���set�����ϣ���zset(sorted set�����򼯺�)��
		Jedis j = new Jedis("127.0.0.1");
		System.out.println(j.ping()+"���ӳɹ���");
		//�б�,�Ƚ����
//		j.lpush("list", "1!");
//		j.lpush("list", "2!");
//		j.lpush("list", "3!");
		List<String> list = j.lrange("list", 0, 5);
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//����,˳�����
//		j.sadd("set", "1","2","3");
//		
		Set<String> set = j.smembers("set");		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//HashMap
//		HashMap m = new HashMap();
//		m.put("id","1");
//		m.put("name", "aly");
//		j.hmset("myhash", m);
//		
//		Map<?, ?> hm = j.hgetAll("myhash");
//		System.out.println(hm.get("name"));
//		for(Map.Entry<?, ?> entry : hm.entrySet()) {
//			System.out.println(entry.getKey()+","+entry.getValue());
//		}
//	

}

}
