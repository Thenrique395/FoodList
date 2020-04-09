package br.com.sagittarius.FoodList.repository;

import br.com.sagittarius.FoodList.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements IRepository<Product>{


    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(long _id) {
        return null;
    }

    @Override
    public Product getByName(long _id) {
        return null;
    }

    @Override
    public Product delete(long _id) {
        return null;
    }

    @Override
    public Product update(Product _entity) {
        return null;
    }

    @Override
    public Product add(Product _entity) {
        return null;
    }
}
