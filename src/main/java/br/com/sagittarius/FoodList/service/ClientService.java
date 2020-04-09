package br.com.sagittarius.FoodList.service;

import br.com.sagittarius.FoodList.model.Client;
import br.com.sagittarius.FoodList.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IService<Client>{

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository _clientRepository) {
        this.clientRepository = _clientRepository;
    }

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
