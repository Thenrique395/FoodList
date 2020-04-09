package br.com.sagittarius.FoodList.repository;

import br.com.sagittarius.FoodList.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class ProductRepository implements IRepository<Product>{

    @Override
    public List<Product> getAll() {
        return this.getAll();
    }

    @Override
    public Product getById(long _id) {
        return this.findById(_id).get();
    }

    @Override
    public Product getByName(long _id) {
        return null;
    }

    @Override
    public void delete(long _id) {
        this.deleteById(_id);
    }

    @Override
    public Product update(Product _entity) {
        return this.update(_entity);
    }

    @Override
    public Product add(Product _entity) {
        return this.save(_entity);
    }

}
