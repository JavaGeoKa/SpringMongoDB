package dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.DataObject;

public interface MongoRepoDB extends MongoRepository<DataObject, Integer> {

}
