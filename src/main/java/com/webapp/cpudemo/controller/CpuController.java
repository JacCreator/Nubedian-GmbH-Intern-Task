package com.webapp.cpudemo.controller;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cpu")
public class CpuController {
    @Autowired
    private CpuService cpuService;

    @PostMapping("/add")
    public String add(@RequestBody Cpu cpu) {
        cpuService.saveCpu(cpu);
        return "New cpu is added";
    } //TODO later

    @GetMapping("/get-all")
    public List<Cpu> getAllCpus() {
        return cpuService.getAllCpus();
    }
}
