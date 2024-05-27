package domain.race;

import domain.car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    private int round;
    private int currRound = 0;
    private List<Car> carList;

    public Race(List<Car> carList, int round) {
        this.carList = carList;
        this.round = round;
    }

    public boolean isFinished() {
        return currRound == round;
    }

    public void game() {
        for (Car car : carList) {
            car.move();
        }
        currRound++;
    }
}