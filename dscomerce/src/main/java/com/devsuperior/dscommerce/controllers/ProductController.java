package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")    
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return dto;
    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @PostMapping
    public ProductDTO insert(@RequestBody ProductDTO dto) {
        
        dto = service.insert(dto);
        
        return dto;
    }
    
    @PutMapping(value = "{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
