package com.roy.design.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gallery {
    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void broken() {
        photos = Collections.emptyList();
    }

    public void rollbackGallery(GallerySnapshot gallerySnapshot) {
        this.photos = gallerySnapshot.getPhotos();
    }

}
