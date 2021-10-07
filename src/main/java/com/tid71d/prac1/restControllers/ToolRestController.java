package com.tid71d.prac1.restControllers;

import com.tid71d.prac1.models.Client;
import com.tid71d.prac1.models.Tool;
import com.tid71d.prac1.services.ToolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tools")
public class ToolRestController {
    private final ToolService toolService;

    public ToolRestController(ToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping("/{id}")
    public Tool findById(@PathVariable("id") Integer id){
        try {
            return toolService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/all")
    public List<Tool> findAll(){
        return toolService.findAll();
    }

    @PostMapping("/save")
    public Tool save(@RequestBody Tool tool){
        return toolService.save(tool);
    }

    @PutMapping("/update/{id}")
    public Tool update(@PathVariable("id") Integer id,Tool tool){
        try {
            return toolService.update(id,tool);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
