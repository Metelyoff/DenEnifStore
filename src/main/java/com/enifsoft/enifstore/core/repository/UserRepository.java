package com.enifsoft.enifstore.core.repository;

import com.enifsoft.enifstore.core.entity.AbstractEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AbstractEntity, Long> {

}
