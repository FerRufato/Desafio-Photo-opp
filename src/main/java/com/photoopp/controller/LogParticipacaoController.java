package com.photoopp.controller;

import com.photoopp.service.LogParticipacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participacoes")
public class LogParticipacaoController {

    private final LogParticipacaoService logParticipacaoService;

    public LogParticipacaoController(LogParticipacaoService logParticipacaoService) {
        this.logParticipacaoService = logParticipacaoService;
    }

    @GetMapping("/por-dia")
    public List<Object[]> contarParticipacoesPorDia() {
        return logParticipacaoService.contarParticipacoesPorDia();
    }
}
