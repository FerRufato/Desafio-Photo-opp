package com.photoopp.dto;

import java.time.LocalDate;

public class ParticipacaoPorDiaDTO {
    private LocalDate dia;
    private int total;

    public ParticipacaoPorDiaDTO(LocalDate dia, int total) {
        this.dia = dia;
        this.total = total;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
