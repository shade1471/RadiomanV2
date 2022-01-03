package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();

    @Test
    void shouldSetNumberStationOverRange() {

        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationLessRange() {

        radio.setCurrentNumber(-10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStation() {

        radio.setCurrentNumber(5);

        int expected = 5;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberStation() {

        radio.setNextNumberStation();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberStationIfCurrentNumberIs9() {

        radio.setCurrentNumber(9);

        radio.setNextNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberStationIfCurrentNumberIs0() {

        radio.setCurrentNumber(0);

        radio.setPrevNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberStation() {

        radio.setCurrentNumber(3);

        radio.setPrevNumberStation();
        int expected = 2;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {

        radio.setIncreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {

        radio.setCurrentVolume(4);

        radio.setDecreaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeLessRange() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void shouldSetVolumeOverRange() {

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    void shouldIncreaseVolumeMoreMax() {

        radio.setCurrentVolume(10);
        radio.setIncreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeLessMin() {

        radio.setDecreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}