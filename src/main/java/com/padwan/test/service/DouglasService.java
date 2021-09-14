package com.padwan.test.service;

import org.springframework.stereotype.Service;

import com.padwan.test.enums.StatusEnum;

import java.util.ArrayList;
import java.util.List;

@Service
public class DouglasService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Boa didatica");
        skills.add("Aprende fácil");
        skills.add("Bonito");
        skills.add("Sonhador");
        skills.add("Engracado");
        skills.add("Gosta de Programar");
        skills.add(StatusEnum.JEDI+"");
        return skills;
    }

}
