package com.Crudly.Crudly.service;

import com.Crudly.Crudly.model.Studient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudientServiceImpl implements StudientService{
    @Override
    public List<Studient> ListAllStudients() {
        return List.of();
    }
}
