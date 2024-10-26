package com.salma.demo.repository;

import com.salma.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,Long>{
}
