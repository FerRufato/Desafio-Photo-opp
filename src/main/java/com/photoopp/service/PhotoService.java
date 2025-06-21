package com.photoopp.service;

import com.photoopp.dto.ParticipacaoPorDiaDTO;
import com.photoopp.model.Photo;
import com.photoopp.repository.PhotoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public Photo save(Photo photo) {
        return photoRepository.save(photo);
    }

    public List<Photo> findAll() {
        return photoRepository.findAll();
    }

    // Método para contar participações por dia
    public List<ParticipacaoPorDiaDTO> contarParticipacoesPorDia() {
        List<Photo> allPhotos = photoRepository.findAll();

        Map<LocalDate, Long> contagemPorDia = allPhotos.stream()
                .filter(p -> p.getCreatedAt() != null)  // Só conta fotos com createdAt preenchido
                .collect(Collectors.groupingBy(
                        p -> p.getCreatedAt()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate(),
                        Collectors.counting()
                ));

        return contagemPorDia.entrySet().stream()
                .map(e -> new ParticipacaoPorDiaDTO(e.getKey(), e.getValue().intValue()))
                .sorted((a, b) -> b.getDia().compareTo(a.getDia()))  // Ordena do mais recente para o mais antigo
                .collect(Collectors.toList());
    }
}