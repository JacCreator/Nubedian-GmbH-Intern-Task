package com.webapp.cpudemo.repository;

import com.webapp.cpudemo.model.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuRepository extends JpaRepository<Cpu, Integer> {

}
