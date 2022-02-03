package com.roy.design.memento;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.Month;

public class User {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void mementoPatternPractice() {
        ICloud iCloud = new ICloud();
        Gallery gallery = new Gallery();

        gallery.addPhoto(new Photo("속초에서 찍은 사진", LocalDate.of(2020, Month.JANUARY, 1)));
        gallery.addPhoto(new Photo("개발하다가 찍은 사진", LocalDate.of(2020, Month.FEBRUARY, 1)));
        logger.info("### 첫번째 스냅샷 생성 및 클라우드 업로드");
        GallerySnapshot snapshot1 = new GallerySnapshot(gallery.getPhotos(), LocalDate.of(2020, Month.MARCH, 1));
        iCloud.uploadSnapshot(snapshot1);

        gallery.addPhoto(new Photo("여자친구랑 찍은 사진", LocalDate.of(2021, Month.JANUARY, 1)));
        gallery.addPhoto(new Photo("맛있는 고기 사진", LocalDate.of(2021, Month.FEBRUARY, 1)));
        GallerySnapshot snapshot2 = new GallerySnapshot(gallery.getPhotos(), LocalDate.of(2021, Month.MARCH, 1));
        logger.info("### 두번째 스냅샷 생성 및 클라우드 업로드");
        iCloud.uploadSnapshot(snapshot2);

        logger.info("### 고장전 갤러리 상태 출력");
        gallery.getPhotos().forEach(Photo::printPhotoInfo);
        logger.info("### 휴대폰 고장");
        gallery.broken();
        logger.info("### 고장 후 휴대폰 상태 출력");
        gallery.getPhotos().forEach(Photo::printPhotoInfo);
        logger.info("### 롤백을 위한 ICloud 백업 목록 출력");
        iCloud.printDownloadableSnapshot();

        logger.info("### 다운로드를 위해 최신 스냅샷 다운로드");
        GallerySnapshot latestSnapshot = iCloud.downloadSnapshot(1);
        logger.info("### 고장난 휴대폰 갤러리 최신 스냅샷으로 교체");
        gallery.rollbackGallery(latestSnapshot);
        logger.info("### 스냅샷으로 교체 후 갤러리 상태 출력");
        gallery.getPhotos().forEach(Photo::printPhotoInfo);
        logger.info("### 복구 완료");
    }

}
