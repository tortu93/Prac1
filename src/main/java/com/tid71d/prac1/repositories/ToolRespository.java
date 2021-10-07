package com.tid71d.prac1.repositories;

import com.tid71d.prac1.models.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRespository extends JpaRepository<Tool,Integer> {
}
