package com.example.test1228.service;


import com.example.test1228.dto.req.ExampleReqDTO;
import com.example.test1228.dto.res.ExampleResDTO;
import com.example.test1228.entity.Example;
import com.example.test1228.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExampleService {

    @Autowired
    ExampleRepository repo;

    public ExampleResDTO merge(ExampleReqDTO req){
        Example example = req.toEntity();
        example = repo.save(example);
        //save > PK를 가지고 들어왔는데 PK가 없으면 넣고, 있으면 업데이트
        return new ExampleResDTO(example.getName());
    }

    public List<ExampleResDTO> selectAll(){

        List<Example> result = repo.findAll();

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        //for문보다 stream을 사용해보도록 하자
        return resList;
    }

    public ExampleResDTO selectOne(ExampleReqDTO req){

        Example example = repo.findById(req.getId()).orElse(null);

        return new ExampleResDTO(example.getName());
    }

    public void deleteOne(ExampleReqDTO req){
        repo.deleteById(req.getId());
    }

    public void deleteAll(){
        repo.deleteAll();
    }

    public List<ExampleResDTO> selectByName(ExampleReqDTO req){
        List<Example> result = repo.findByName(req.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> selectByNameStartingWith(ExampleReqDTO req){
        List<Example> result = repo.findByNameStartingWith(req.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }
    public List<ExampleResDTO> selectByPrice(ExampleReqDTO req){
        List<Example> result = repo.findByPriceLessThan(req.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }
    public List<ExampleResDTO> findByNameAndPrice(ExampleReqDTO req){
        List<Example> result = repo.findByNameAndPrice(req.getName(), req.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }
//findByNameAndPrice
}
