package com.tid71d.prac1.services;

import com.tid71d.prac1.models.Tool;
import com.tid71d.prac1.repositories.ToolRespository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {
    private final ToolRespository toolRespository;

    public ToolService(ToolRespository toolRespository) {
        this.toolRespository = toolRespository;
    }

    public Tool findById(Integer id) throws Exception {
        Tool foundTool=toolRespository.findById(id).get();
        if (foundTool != null){
            return foundTool;
        }else{
            throw new Exception("Tool not found");
        }
    }

    public List<Tool> findAll(){
        return toolRespository.findAll(Sort.by("toolId"));
    }

    public Tool save(Tool tool){
        return toolRespository.save(tool);
    }

    public Tool update(Integer id, Tool tool) throws Exception {
        Tool foundTool=toolRespository.findById(id).get();
        if(foundTool != null){
            return toolRespository.save(tool);
        }else{
            throw new Exception("Tool not found");
        }
    }

    public void deleteById(Integer id) throws Exception {
        Tool foundTool=toolRespository.findById(id).get();
        if(foundTool != null){
            toolRespository.delete(foundTool);
        }else{
            throw new Exception("Not found");
        }
    }
}
