package com.sda.javapoz11.hellospring.hellospring.service;

import java.util.Random;

public class SmallNumbersGenerator implements RandomGenerator{
    @Override
    public Integer randomInt() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
