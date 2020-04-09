package br.com.sagittarius.FoodList.repository;

import br.com.sagittarius.FoodList.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository<T> implements IRepository<Client> {


    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client getById(long _id) {
        return null;
    }

    @Override
    public Client getByName(long _id) {
        return null;
    }

    @Override
    public Client delete(long _id) {
        return null;
    }

    @Override
    public Client update(Client _entity) {
        return null;
    }

    @Override
    public Client add(Client _entity) {
        return null;
    }

}
