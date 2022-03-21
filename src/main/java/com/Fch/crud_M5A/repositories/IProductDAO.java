package com.Fch.crud_M5A.repositories;

import com.Fch.crud_M5A.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO,String > {
}
