package com.photoopp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class LogParticipacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    private String fotoUrl;

    public LogParticipacao() {
    }

    public LogParticipacao(LocalDateTime dataHora, String fotoUrl) {
        this.dataHora = dataHora;
        this.fotoUrl = fotoUrl;
    }

    public String getFotoUrl() {
        return "";
    }

    public void setDataHora(LocalDateTime now) {

    }
}
