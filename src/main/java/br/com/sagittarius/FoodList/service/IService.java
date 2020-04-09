package br.com.sagittarius.FoodList.service;

import java.util.List;

public interface IService<T> {

    List<T> getAll();

    T getById(long _id);

    T getByName(long _id);

    T delete(long _id);

    T update(T _entity);

    T add(T _entity);
}
