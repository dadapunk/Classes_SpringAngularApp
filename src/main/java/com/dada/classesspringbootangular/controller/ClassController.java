package com.dada.classesspringbootangular.controller;

import com.dada.classesspringbootangular.repositories.ClassRepository;
import com.dada.classesspringbootangular.models.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

        @Autowired
        private ClassRepository classRepository;

        @GetMapping("/")
        public List<Class> getAllClasses() {
            return classRepository.findAll();
        }

        @PostMapping("new/")
        public Class addClass(@RequestBody Class newClass) {
            return classRepository.save(newClass);
        }
    }


