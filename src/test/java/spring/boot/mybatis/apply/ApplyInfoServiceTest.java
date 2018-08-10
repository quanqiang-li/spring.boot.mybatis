package spring.boot.mybatis.apply;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplyInfoServiceTest {

	@Autowired
	private ApplyInfoService service;
	
	@Test
	public void test(){
		List<ApplyInfo> all = service.getAll();
		System.out.println("查询结果:"+all);
	}
}
