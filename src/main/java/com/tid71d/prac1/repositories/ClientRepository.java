package com.tid71d.prac1.repositories;

import com.tid71d.prac1.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
