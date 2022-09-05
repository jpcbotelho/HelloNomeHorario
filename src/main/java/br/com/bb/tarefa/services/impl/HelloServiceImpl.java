package br.com.bb.tarefa.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import br.com.bb.tarefa.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hora() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_TIME).substring(0, 5);
    }
}
