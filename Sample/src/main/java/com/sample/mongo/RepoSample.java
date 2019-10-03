package com.sample.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoSample extends MongoRepository<User, String> {

}
