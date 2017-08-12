package org.jietou.provider.mapper;

import java.util.List;
import java.util.Map;

import org.jietou.api.m.BwUser;

public interface BwUserMapper {
	
	int deleteByPrimaryKey(Integer ROW_ID);

	int insert(BwUser record);

	int insertSelective(BwUser record);

	BwUser selectByPrimaryKey(Integer ROW_ID);

	int updateByPrimaryKeySelective(BwUser record);

	int updateByPrimaryKey(BwUser record);

	BwUser selectByUser(BwUser bwUser);

	int addUser(BwUser bwUser);

	List<BwUser> getALLUsers(Map<Object, Object> map);

	Integer getALLUserscount(Map<Object, Object> map);
}