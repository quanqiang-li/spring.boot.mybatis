package spring.boot.mybatis.apply;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Test
	//@Transactional //分别执行带和不带@Transactional的效果,体验事务的机制
	public void testUpdate(){
		ApplyInfo applyInfo = new ApplyInfo();
		applyInfo.setBankId("12345");
		service.addApply(applyInfo);
		System.out.println("插入数据的主键:"+applyInfo.getId());
		applyInfo.setBankId("123456");//超长要抛异常的 Error updating database.  Cause: com.mysql.jdbc.MysqlDataTruncation: Data truncation: Data too long for column 'bank_id' at row 1
		service.updateApply(applyInfo);
	}
}
