package com.tacos.taco_cloud.Domains;
import lombok.*;

@Data
public class Ingredients {
    final String name;
    final int id;
    final Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
    }
}
