package com.roy.design.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ICloud {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final List<GallerySnapshot> snapshots = new ArrayList<>();

    public void uploadSnapshot(GallerySnapshot gallerySnapshot) {
        snapshots.add(gallerySnapshot);
    }

    public GallerySnapshot downloadSnapshot(int index) {
        return snapshots.get(index);
    }

    public void printDownloadableSnapshot() {
        snapshots.forEach(i -> {
            logger.info("[스냅샷 정보] 저장된 사진의 수: {}, 스냅샷 생성일시: {}",
                    i.getPhotos().size(), i.getCreatedAt());
        });
    }

}
