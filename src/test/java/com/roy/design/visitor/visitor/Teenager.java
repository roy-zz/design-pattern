package com.roy.design.visitor.visitor;

import com.roy.design.visitor.store.Bar;
import com.roy.design.visitor.store.Cafe;

public class Teenager extends Human {
    @Override
    public void visit(Bar bar) {
        logger.info("Teenager는 Bar에 방문 불가");
    }

    @Override
    public void visit(Cafe cafe) {
        if (isVisitable(cafe)) {
            logger.info("Teenager가 Cafe에 방문. 총 좌석: {}, 사용 중인 좌석: {}, 남은 좌석: {}",
                    cafe.getTotalSeat(), cafe.getUsedSeat(), cafe.getTotalSeat() - cafe.getUsedSeat());
            cafe.addVisitor();
        } else {
            logger.info("Teenanger가 Cafe에 방문 불가 (좌석 부족). 총 좌석: {}, 사용 중인 좌석: {}, 남은 좌석: {}",
                    cafe.getTotalSeat(), cafe.getUsedSeat(), cafe.getTotalSeat() - cafe.getUsedSeat());
        }
    }

}
