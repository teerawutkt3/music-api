package com.example.demo.common.repositories;

import com.example.demo.common.constants.ProjectConstant;
import com.example.demo.common.entities.BaseEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface CommonJpaCrudRepository<T extends BaseEntity, ID extends Serializable> extends CrudRepository<T, ID> {

    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    @Query("select e from #{#entityName} e where e.isDeleted = '" + ProjectConstant.Flag.N + "'")
    List<T> findAll();

    /**
     * Returns the number of entities available.
     *
     * @return the number of entities
     */
   /* @Query("select count(1) from #{#entityName} e where e.isDeleted = '" + ProjectConstant.Flag.N + "'")
    long count();*/
    @Modifying
    @Query(value = "update  #{#entityName} e set e.isDeleted = 'Y' where e.id= ?1 ")
    void delete(long id);
}