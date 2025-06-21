package com.photoopp.service;

import com.photoopp.repository.LogParticipacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogParticipacaoService {

    private final LogParticipacaoRepository logParticipacaoRepository;

    public LogParticipacaoService(LogParticipacaoRepository logParticipacaoRepository) {
        this.logParticipacaoRepository = logParticipacaoRepository;
    }

    public List<Object[]> contarParticipacoesPorDia() {
        return logParticipacaoRepository.contarParticipacoesPorDia();
    }
}
