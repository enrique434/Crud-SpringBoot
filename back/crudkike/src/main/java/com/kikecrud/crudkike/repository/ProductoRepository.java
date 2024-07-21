package com.kikecrud.crudkike.repository;

import com.kikecrud.crudkike.model.ProductoModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,Integer> {

}
