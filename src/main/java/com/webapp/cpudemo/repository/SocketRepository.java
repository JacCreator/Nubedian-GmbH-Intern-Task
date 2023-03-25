package com.webapp.cpudemo.repository;

import com.webapp.cpudemo.model.Socket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocketRepository extends JpaRepository<Socket, Integer> { }
