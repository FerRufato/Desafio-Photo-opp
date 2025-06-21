package com.photoopp.repository;

import com.photoopp.model.LogParticipacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LogParticipacaoRepository extends JpaRepository<LogParticipacao, Long> {

    @Query("SELECT CAST(lp.dataHora AS date), COUNT(lp) FROM LogParticipacao lp GROUP BY CAST(lp.dataHora AS date)")
    List<Object[]> contarParticipacoesPorDia();
}
