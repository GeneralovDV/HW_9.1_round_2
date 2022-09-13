package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // установить звук середины диапазона
    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    // установить макимальный звук
    @Test
    public void shouldSetVolumeMax() {
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// не устанавливать звук выше максимального
    @Test
    public void shouldntSetVolumeOverMax() {
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук макс-1
    @Test
    public void shouldSetVolumeBeforeMax() {
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин-1
    @Test
    public void shouldSetVolumeBeforeMin() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин
    @Test
    public void shouldSetVolumeMin() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldSetVolumeOverMin() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук на максимальное значение
    @Test
    public void shouldSetVolumePlusOneToMax() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук на макс-1
    @Test
    public void shouldSetVolumePlusOneBeforeMax() {
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // не устанавливать звук выше макс
    @Test
    public void shouldntSetVolumePlusOneOverMax() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldSetVolumeMinPlusOne() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин
    @Test
    public void shouldSetVolumeToMin() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldntSetVolumeLessMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить станцию середины диапазона
    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить макс. станцию
    @Test
    public void shouldSetMaxStation() {
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию макс-1
    @Test
    public void shouldSetStationMaxMinusOne() {
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию макс+1
    @Test
    public void shouldntSetStationOverMax() {
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию мин
    @Test
    public void shouldSetMinStation() {
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию мин+1
    @Test
    public void shouldSetStationMinPlusOne() {
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // не устанавливать станцию меньше мин.
    @Test
    public void shouldntSetStationMinMinusOne() {
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить макс занчение
    @Test
    public void shouldSetStationPlusOneToMax() {
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс занчение
    @Test
    public void shouldntSetStationMaxPlusOne() {
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс-1
    @Test
    public void shouldSetStationBeforeMaxMinusOne() {
        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин+1 занчение
    @Test
    public void shouldSetStationMinPlus() {
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин-1 занчение
    @Test
    public void shouldSetStationMinMinusOne() {
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин занчение
    @Test
    public void shouldSetStationMin() {
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин-1 занчение
    @Test
    public void shouldSetStationMinMinus() {
        radio.setCurrentStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс-1 занчение
    @Test
    public void shouldSetStationMaxMinus() {
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
