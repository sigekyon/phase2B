package com.example.sample.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
	public long adjustment(int number){
        return number*5;
    }
}
