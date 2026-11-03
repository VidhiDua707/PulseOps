package com.pulseops.controller;

import com.pulseops.model.Api;
import com.pulseops.repository.ApiRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/apis")
public class ApiController {
    private final ApiRepository apiRepository;
    public ApiController(ApiRepository apiRepository){
        this.apiRepository=apiRepository;
    }

    @PostMapping
    public Api addApi(@RequestBody Api api){
        return apiRepository.save(api);
    }

    @GetMapping
    public List<Api> getAllApi(){
        return apiRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteApi(@PathVariable Long id){
        apiRepository.deleteById(id);
    }

}
