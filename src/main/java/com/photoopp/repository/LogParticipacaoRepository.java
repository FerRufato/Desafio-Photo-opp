package com.photoopp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.photoopp.model.LogParticipacao;

import java.util.Collection;
import java.util.List;

public interface LogParticipacaoRepository extends JpaRepository<LogParticipacao, Long> {

    @Query(value = "SELECT CAST(lp.data_hora AS DATE) AS dia, COUNT(*) AS total FROM log_participacao lp GROUP BY CAST(lp.data_hora AS DATE) ORDER BY dia DESC", nativeQuery = true)
    List<Object[]> contarPorDia();



}


