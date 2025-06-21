package com.photoopp.controller;

import com.photoopp.dto.ParticipacaoPorDiaDTO;
import com.photoopp.model.Photo;
import com.photoopp.service.PhotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/photos")
@CrossOrigin(origins = "*")
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @PostMapping
    public Photo save(@RequestBody Photo photo) {
        return photoService.save(photo);
    }

    @GetMapping
    public List<Photo> findAll() {
        return photoService.findAll();
    }

    // ✅ NOVO ENDPOINT
    @GetMapping("/participacoes-por-dia")
    public List<ParticipacaoPorDiaDTO> getParticipacoesPorDia() {
        return photoService.contarParticipacoesPorDia();
    }
}
