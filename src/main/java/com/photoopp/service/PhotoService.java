package com.photoopp.service;

import com.photoopp.model.Photo;
import com.photoopp.repository.PhotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
