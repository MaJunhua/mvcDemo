package com.example.mvc;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ItemController {
    @RequestMapping(value = "product/{id}", method = RequestMethod.GET, consumes = )
    public Product GetProduct(@PathVariable int id) {
        Product product = new Product();
        product.setId(id);
        product.setName("helloworld");
        return product;
    }
}
