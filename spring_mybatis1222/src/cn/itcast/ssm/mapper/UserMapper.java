package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.po.UserCustom;
import cn.itcast.ssm.po.UserQueryVo;

/**
 * 
 * @ClassName: UserMapper
 * @Description: mapper接口，相当 于dao接口，用户管理
 *
 * @version: v1.0.0
 * @author dongby1
 * @date 2020/01/16 09:55:58
 */
public interface UserMapper {

	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
