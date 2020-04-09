package br.com.sagittarius.FoodList.repository;

import br.com.sagittarius.FoodList.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepository<T>  extends CrudRepository<Product,Long> {

    List<T> getAll();

    T getById(long _id);

    T getByName(long _id);

    void delete(long _id);

    T update(T _entity);

    T add(T _entity);




}
