package com.webapp.cpudemo.service;

import com.webapp.cpudemo.model.Socket;
import com.webapp.cpudemo.repository.SocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocketServiceImpl implements SocketService {

    @Autowired
    private SocketRepository socketRepository;
    @Override
    public List<Socket> getAllSockets() {
        return socketRepository.findAll();
    }
}
