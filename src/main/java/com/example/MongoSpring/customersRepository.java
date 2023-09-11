package com.example.MongoSpring;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customersRepository extends MongoRepository<customers, String> {
}
