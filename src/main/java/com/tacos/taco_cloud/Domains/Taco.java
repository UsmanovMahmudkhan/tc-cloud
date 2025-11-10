package com.tacos.taco_cloud.Domains;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    final String name;
    private List<Ingredients>ingredients;
}
