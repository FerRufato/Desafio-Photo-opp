package com.photoopp.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(columnDefinition = "CLOB")
    private String imageUrl;

    private String createdAt;

    public String getImageUrl() {
        return "";
    }

    public Instant getCreatedAt() {
        return null;
    }

    public void setCreatedAt(LocalDateTime now) {
    }
}
