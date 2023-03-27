package com.webapp.cpudemo.service;

import com.webapp.cpudemo.model.Cpu;

import java.util.List;
import java.util.Optional;

public interface CpuService {
    public Cpu saveCpu(Cpu cpu);
    public List<Cpu> getAllCpus();
    public Cpu getCpu(Integer id);
    public Cpu updateCpu(Cpu cpu);
}
