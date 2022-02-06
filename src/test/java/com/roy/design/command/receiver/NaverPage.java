package com.roy.design.command.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaverPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(NaverPage.class);

    public void moveToWebtoonPage() {
        LOGGER.info("### 캡슐화된 웹툰 페이지로 이동하는 기능");
        LOGGER.info("[웹툰] 즐겨찾기 목록 호출");
        LOGGER.info("[웹툰] 최근 본 작품 호출");
        LOGGER.info("[웹툰] 페이지로 이동");
        LOGGER.info("###############################");
    }

    public void moveToNewsPage() {
        LOGGER.info("### 캡슐화된 뉴스 페이지로 이동하는 기능");
        LOGGER.info("[뉴스] 즐겨찾는 언론사 호출");
        LOGGER.info("[뉴스] 지금 뜨는 뉴스 호출");
        LOGGER.info("[뉴스] 페이지로 이동");
        LOGGER.info("###############################");
    }

    public void moveToMailCommand() {
        LOGGER.info("### 캡슐화된 메일 페이지로 이동하는 기능");
        LOGGER.info("[메일] 스팸 메일 목록 호출");
        LOGGER.info("[메일] 확인하지 않는 목록 호출");
        LOGGER.info("[메일] 페이지로 이동");
        LOGGER.info("###############################");
    }

    public void moveToShoppingCommand() {
        LOGGER.info("### 캡슐화된 쇼핑 페이지로 이동하는 기능");
        LOGGER.info("[쇼핑] 최근 본 상품 목록 조회");
        LOGGER.info("[쇼핑] 배송 중인 상품 목록 조회");
        LOGGER.info("[쇼핑] 페이지로 이동");
        LOGGER.info("###############################");
    }

}
