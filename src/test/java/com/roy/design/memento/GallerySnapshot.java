package com.roy.design.memento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GallerySnapshot {
    private final List<Photo> photos = new ArrayList<>();
    private final LocalDate createdAt;

    public GallerySnapshot(List<Photo> photos, LocalDate localDate) {
        this.photos.addAll(photos);
        this.createdAt = localDate;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

}
