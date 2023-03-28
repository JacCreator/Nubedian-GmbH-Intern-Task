package com.webapp.cpudemo.controller;


import com.webapp.cpudemo.model.Socket;
import com.webapp.cpudemo.service.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/socket")
@CrossOrigin(origins="http://localhost:3000")
public class SocketController {
    @Autowired
    private SocketService socketService;

    @GetMapping("/get-all")
    public List<Socket> getAllCpus() {
        return socketService.getAllSockets();
    }
}
