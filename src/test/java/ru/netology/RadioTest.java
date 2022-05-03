package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private Radio radio = new Radio();

    @Test
    void shouldSetNumberStationOverRangeWithDefault() {

        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationOverRangeWithManualSetting() {
        Radio radio = new Radio(15);

        radio.setCurrentNumber(15);

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
    void shouldNextNumberStationWithManualSetting() {
        Radio radio = new Radio(15);

        radio.setCurrentNumber(10);
        radio.setNextNumberStation();
        int expected = 11;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberStationIfCurrentNumberIsMaxWithDefault() {

        radio.setCurrentNumber(9);

        radio.setNextNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberStationIfCurrentNumberIsMaxWithManualSetting() {
        Radio radio = new Radio(15);

        radio.setCurrentNumber(14);

        radio.setNextNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberStationIfCurrentNumberIsMinWithDefault() {

        radio.setCurrentNumber(0);

        radio.setPrevNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberStationIfCurrentNumberIsMinWithManualSetting() {
        Radio radio = new Radio(15);

        radio.setCurrentNumber(0);

        radio.setPrevNumberStation();
        int expected = 14;
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

        radio.setCurrentVolume(50);

        radio.setDecreaseVolume();
        int expected = 49;
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

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    void shouldIncreaseVolumeMoreMax() {

        radio.setCurrentVolume(100);
        radio.setIncreaseVolume();
        int expected = 100;
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