package com.tid71d.prac1.restControllers;

import com.tid71d.prac1.models.Client;
import com.tid71d.prac1.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    private final ClientService clientService;

    public ClientRestController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable("id") Integer id){
        try {
            return clientService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/all")
    public List<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    @PutMapping("/update/{id}")
    public Client update(@PathVariable("id") Integer id,Client client){
        try {
            return clientService.update(id,client);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
