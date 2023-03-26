package com.webapp.cpudemo.service;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CpuServiceImpl implements CpuService {
    @Autowired
    private CpuRepository cpuRepository;

    @Override
    public Cpu saveCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    } //TODO later

    @Override
    public List<Cpu> getAllCpus() {
        return cpuRepository.findAll();
    }
}
