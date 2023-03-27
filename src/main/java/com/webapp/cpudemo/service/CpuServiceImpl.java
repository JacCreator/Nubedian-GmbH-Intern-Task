package com.webapp.cpudemo.service;

import com.webapp.cpudemo.model.Cpu;
import com.webapp.cpudemo.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CpuServiceImpl implements CpuService {
    @Autowired
    private CpuRepository cpuRepository;

    @Override
    public Cpu saveCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    @Override
    public List<Cpu> getAllCpus() {
        return cpuRepository.findAll();
    }

    @Override
    public Cpu getCpu(Integer id) {
        Optional<Cpu> cpu = cpuRepository.findById(id);
        if(cpu.isPresent()) {
            return cpu.get();
        }
        throw new RuntimeException("Cpu is not found for the given id: " + id);
    }

    @Override
    public Cpu updateCpu(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

}
