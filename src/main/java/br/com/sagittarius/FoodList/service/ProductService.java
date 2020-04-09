package br.com.sagittarius.FoodList.service;

import br.com.sagittarius.FoodList.model.Product;
import br.com.sagittarius.FoodList.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IService<Product> {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository _productRepository) {
        this.productRepository = _productRepository;
    }

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
