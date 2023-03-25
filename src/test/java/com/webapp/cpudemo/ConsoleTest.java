package com.webapp.cpudemo;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.model.Socket;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ConsoleTest {


    public static void main(String[] args) {
        // add one-to-many relationship
        /*Cpu cpu1 = new Cpu();
        Cpu cpu2 = new Cpu();

        Socket socket1 = new Socket();
        Socket socket2 = new Socket();
        Set<Cpu> cpuSet = new HashSet<>();
        cpuSet.add(cpu1);
        cpuSet.add(cpu2);
        socket1.setCpus(cpuSet);
        System.out.println(socket1);
        System.out.println(socket2);*/


        // perform some basic stuff
        /*Cpu cpu = new Cpu("AMD", "Ryzen 5 5600", new BigDecimal("3.4"),
                new BigDecimal("4.4"), 6, 12,
                new BigDecimal("65.00"), new BigDecimal("709.00"));
        System.out.println(cpu);*/


    }
}
