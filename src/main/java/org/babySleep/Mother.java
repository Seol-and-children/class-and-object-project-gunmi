package org.babySleep;

public class Mother {
    Baby baby = new Baby();
    public void readBook() {
        baby.read();
    }

    public void goToSleep() {
        baby.bed();
    }

    public void eatmilk() {
        baby.milk();
    }

    public void washBaby() {
        baby.wash();
    }
}
