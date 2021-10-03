package cn.jiangwenwen.repository;

import cn.jiangwenwen.entity.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {

    People findById(long id);


}
