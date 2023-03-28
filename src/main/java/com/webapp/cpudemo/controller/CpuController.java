package com.webapp.cpudemo.controller;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cpu")
@CrossOrigin(origins="http://localhost:3000")
public class CpuController {
    @Autowired
    private CpuService cpuService;

    @PostMapping(value="/add", consumes={"application/json"})
    public String add(@RequestBody Cpu cpu) {
        cpuService.saveCpu(cpu);
        return "New cpu is added";
    }

    @GetMapping("/get-all")
    public List<Cpu> getAllCpus() {
        return cpuService.getAllCpus();
    }

    @GetMapping("/get/{id}")
    public Cpu getCpu(@PathVariable Integer id) {
        return cpuService.getCpu(id);
    }

    @PutMapping("/update/{id}")
    public Cpu updateCpu(@RequestBody Cpu cpu, @PathVariable Integer id) {
        cpu.setId(id);
        return cpuService.updateCpu(cpu);
    }
}
