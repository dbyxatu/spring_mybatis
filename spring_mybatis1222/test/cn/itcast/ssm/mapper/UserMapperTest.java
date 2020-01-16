package cn.itcast.ssm.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.po.User;

/**
 * 
 * @ClassName: UserMapperTest  
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0   
 * @author dongby1
 * @date 2020/01/16 09:50:46
 */
public class UserMapperTest {

	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	
	/**
	 * 
	* @Function: testFindUserById
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: dongby1
	* @date: 2020年1月16日 上午9:51:02 
	*
	 */
	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}

}
