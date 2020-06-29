package com.newer.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String>{
	//默认实现：CRUD 分页 排序
	
	//按业务需求自定义
	
	//基于方法名的约定
	Staff findByName(String name);
	
	//基于注解的自定义数据操作
	@Query(value = "{'name':?0}",fields = "{'_id':0}")
	Staff a(String name);
}
