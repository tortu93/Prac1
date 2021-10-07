package com.tid71d.prac1.services;

import com.tid71d.prac1.models.Client;
import com.tid71d.prac1.repositories.ClientRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.lang.ref.Cleaner;
import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client findById(Integer id) throws Exception {
        Client foundClient=clientRepository.findById(id).get();
        if(foundClient != null){
            return foundClient;
        }else{
            throw new Exception("client not found");
        }
    }

    public List<Client> findAll(){
        return clientRepository.findAll(Sort.by("clientId"));
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Client update(Integer id, Client client) throws Exception {
        Client foundClient=clientRepository.findById(id).get();
        if(foundClient != null){
            return clientRepository.save(client);
        }else{
            throw new Exception("Client not found");
        }
    }

    public void deleteById(Integer id) throws Exception {
        Client foundClient=clientRepository.findById(id).get();
        if(foundClient != null){
            clientRepository.delete(foundClient);
        }else{
            throw new Exception("Not found");
        }
    }
}
