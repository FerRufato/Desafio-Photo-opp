package com.photoopp.service;

import com.photoopp.model.LogParticipacao;
import com.photoopp.repository.LogParticipacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogParticipacaoService {

    private final LogParticipacaoRepository logParticipacaoRepository;

    public LogParticipacaoService(LogParticipacaoRepository logParticipacaoRepository) {
        this.logParticipacaoRepository = logParticipacaoRepository;
    }

    public LogParticipacao save(LogParticipacao logParticipacao) {
        return logParticipacaoRepository.save(logParticipacao);
    }

    public List<LogParticipacao> findAll() {
        return logParticipacaoRepository.findAll();
    }
}
