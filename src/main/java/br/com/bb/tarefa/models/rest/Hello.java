package br.com.bb.tarefa.models.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Hello{

        Logger logger = LoggerFactory.getLogger(HelloNomeHorario.class);

        @RequestMapping(path = "/hello",
                method = RequestMethod.GET)
        public ResponseEntity<String> hello() {
            logger.warn("TESTE LOG WARNING");
            return ResponseEntity.status(HttpStatus.OK).body("Hello!");
        }
    }

