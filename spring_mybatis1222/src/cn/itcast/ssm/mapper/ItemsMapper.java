package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @ClassName: ItemsMapper
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author dongby1
 * @date 2020/01/16 09:56:18
 */
public interface ItemsMapper {
	int countByExample(ItemsExample example);

	int deleteByExample(ItemsExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Items record);

	int insertSelective(Items record);

	List<Items> selectByExampleWithBLOBs(ItemsExample example);

	List<Items> selectByExample(ItemsExample example);

	Items selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

	int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

	int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

	int updateByPrimaryKeySelective(Items record);

	int updateByPrimaryKeyWithBLOBs(Items record);

	
	/**
	 * 
	* @Function: updateByPrimaryKey
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: dongby1
	* @date: 2020年1月16日 上午10:36:45 
	*
	 */
	int updateByPrimaryKey(Items record);
}