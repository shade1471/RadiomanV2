package ru.netology;

public class Radio {
    private int numberOfStations = 10;
    private int maxVolume = 100;

    private int currentNumber;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {

    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber > numberOfStations - 1) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;

    }

    public void setNextNumberStation() {
        if (currentNumber < numberOfStations - 1) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void setPrevNumberStation() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = numberOfStations - 1;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
