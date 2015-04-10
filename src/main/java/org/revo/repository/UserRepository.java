package org.revo.repository;

import org.revo.domain.UserEntity;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface UserRepository extends GraphRepository<UserEntity> {

    public UserEntity findOne(Long id);

    public UserEntity findByUsername(String username);

    public UserEntity findByUsernameAndPassword(String username, String password);

}
