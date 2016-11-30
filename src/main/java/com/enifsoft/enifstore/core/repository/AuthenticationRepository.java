package com.enifsoft.enifstore.core.repository;

import com.enifsoft.enifstore.core.entity.AuthenticationEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationRepository extends CrudRepository<AuthenticationEntity, Long> {
    AuthenticationEntity findByLogin(String login);
}
