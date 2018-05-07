package com.daiict.poc.repository;

import org.springframework.data.repository.CrudRepository;

import com.daiict.poc.dao.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
