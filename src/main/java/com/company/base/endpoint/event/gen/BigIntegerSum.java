package com.company.base.endpoint.event.gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigIntegerSum {
    @GetMapping("big-sum/{a}/{b}")
    public BigInteger getBigsum (@PathVariable BigInteger a, @PathVariable BigInteger b){
        return a.add(b);
    }
}
