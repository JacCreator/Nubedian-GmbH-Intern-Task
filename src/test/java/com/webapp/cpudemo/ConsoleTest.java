package com.webapp.cpudemo;

import com.webapp.cpudemo.model.Cpu;

import java.math.BigDecimal;

public class ConsoleTest {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("AMD", "Ryzen 5 5600", new BigDecimal("3.4"),
                new BigDecimal("4.4"), 6, 12,
                new BigDecimal("65.00"), new BigDecimal("709.00"), 1);
        System.out.println(cpu);
    }
}
