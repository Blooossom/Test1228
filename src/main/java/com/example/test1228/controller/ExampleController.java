package com.example.test1228.controller;

import com.example.test1228.dto.req.ExampleReqDTO;
import com.example.test1228.dto.res.ExampleResDTO;
import com.example.test1228.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    ExampleService service;

    @GetMapping("/insert")
    public ExampleResDTO mergeExample(){
        ExampleReqDTO req = new ExampleReqDTO(4L,"Meal", 22000);
        return service.merge(req);
    }

    @GetMapping("/selectAll")
    public List<ExampleResDTO> selectAll(){
        return service.selectAll();
    }

    @GetMapping("/selectOne")
    public ExampleResDTO selectOne(){
        return service.selectOne(new ExampleReqDTO(3L, "Drink", 15200));
    }

    @GetMapping("deleteOne")
    public void deleteOne(){
        service.deleteOne(new ExampleReqDTO(3L, "Drink", 15200));
    }

    @GetMapping("/deleteAll")
    public void deleteAll(){
        service.deleteAll();
    }

    @GetMapping("/findByName")
    public List<ExampleResDTO> selectByName(){
        ExampleReqDTO req = new ExampleReqDTO(1L, "Bread", 3000);
        return service.selectByName(req);
    }
    @GetMapping("/findByNameStartingWith")
    public List<ExampleResDTO> selectByNameStartingWith(){
        ExampleReqDTO req = new ExampleReqDTO(1L, "Drink", 3000);
        return service.selectByNameStartingWith(req);
    }


    @GetMapping("/findByPrice")
    public List<ExampleResDTO> selectByPrice(){
        ExampleReqDTO req = new ExampleReqDTO(1L, "Drink", 3000);
        return service.selectByPrice(req);
    }

    @GetMapping("/findByNameAndPrice")
    public List<ExampleResDTO> findByNameAndPrice(){
        ExampleReqDTO req = new ExampleReqDTO(1L, "Drink", 3000);
        return service.findByNameAndPrice(req);
    }
}
