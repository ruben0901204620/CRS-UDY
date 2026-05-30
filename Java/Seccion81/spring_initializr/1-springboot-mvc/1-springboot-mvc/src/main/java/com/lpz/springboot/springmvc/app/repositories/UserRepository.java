package com.lpz.springboot.springmvc.app.repositories;

import com.lpz.springboot.springmvc.app.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {

}
