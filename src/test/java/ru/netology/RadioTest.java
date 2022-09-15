package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 9;
    int expected;
    int actual;


    // установить звук середины диапазона
    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(50);
        expected = 50;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    // установить макимальный звук
    @Test
    public void shouldSetVolumeMax() {
        radio.setCurrentVolume(maxVolume);
        expected = maxVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// не устанавливать звук выше максимального
    @Test
    public void shouldntSetVolumeOverMax() {
        radio.setCurrentVolume(101);
        expected = radio.currentVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук макс-1
    @Test
    public void shouldSetVolumeBeforeMax() {
        radio.setCurrentVolume(maxVolume - 1);
        expected = maxVolume - 1;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин-1
    @Test
    public void shouldSetVolumeBeforeMin() {
        radio.setCurrentVolume(minVolume - 1);
        expected = minVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин
    @Test
    public void shouldSetVolumeMin() {
        radio.setCurrentVolume(minVolume);
        expected = minVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldSetVolumeOverMin() {
        radio.setCurrentVolume(minVolume + 1);
        expected = minVolume + 1;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук на максимальное значение
    @Test
    public void shouldSetVolumePlusOneToMax() {
        radio.setCurrentVolume(maxVolume - 1);
        radio.increaseVolume();
        expected = maxVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
// установить звук на макс-1
    @Test
    public void shouldSetVolumePlusOneBeforeMax() {
        radio.setCurrentVolume(maxVolume - 2);
        radio.increaseVolume();
        expected = maxVolume - 1;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // не устанавливать звук выше макс
    @Test
    public void shouldntSetVolumePlusOneOverMax() {
        radio.setCurrentVolume(maxVolume);
        radio.increaseVolume();
        expected = maxVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldSetVolumeMinPlusOne() {
        radio.setCurrentVolume(minVolume);
        radio.increaseVolume();
        expected = minVolume + 1;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин
    @Test
    public void shouldSetVolumeToMin() {
        radio.setCurrentVolume(minVolume + 1);
        radio.decreaseVolume();
        expected = minVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить звук мин+1
    @Test
    public void shouldntSetVolumeLessMin() {
        radio.setCurrentVolume(minVolume);
        radio.decreaseVolume();
        expected = minVolume;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    // установить станцию середины диапазона
    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(maxStation / 2);
        expected = maxStation / 2;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить макс. станцию
    @Test
    public void shouldSetMaxStation() {
        radio.setCurrentStation(maxStation);
        expected = maxStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию макс-1
    @Test
    public void shouldSetStationMaxMinusOne() {
        radio.setCurrentStation(maxStation - 1);
        expected = maxStation - 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию макс+1
    @Test
    public void shouldntSetStationOverMax() {
        radio.setCurrentStation(maxStation + 1);
        expected = minStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию мин
    @Test
    public void shouldSetMinStation() {
        radio.setCurrentStation(minStation);
        expected = minStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить станцию мин+1
    @Test
    public void shouldSetStationMinPlusOne() {
        radio.setCurrentStation(minStation + 1);
        expected = minStation + 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // не устанавливать станцию меньше мин.
    @Test
    public void shouldntSetStationMinMinusOne() {
        radio.setCurrentStation(minStation - 1);
        expected = minStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    // установить макс занчение
    @Test
    public void shouldSetStationPlusOneToMax() {
        radio.setCurrentStation(maxStation - 1);
        radio.next();
        expected = maxStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс занчение
    @Test
    public void shouldntSetStationMaxPlusOne() {
        radio.setCurrentStation(maxStation);
        radio.next();
        expected = minStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс-1
    @Test
    public void shouldSetStationBeforeMaxMinusOne() {
        radio.setCurrentStation(maxStation - 2);
        radio.next();
        expected = maxStation - 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин+1 занчение
    @Test
    public void shouldSetStationMinPlus() {
        radio.setCurrentStation(minStation);
        radio.next();
        expected = minStation + 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин-1 занчение
    @Test
    public void shouldSetStationMinMinusOne() {
        radio.setCurrentStation(minStation);
        radio.prev();
        expected = maxStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин занчение
    @Test
    public void shouldSetStationMin() {
        radio.setCurrentStation(minStation + 1);
        radio.prev();
        expected = minStation;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить мин-1 занчение
    @Test
    public void shouldSetStationMinMinus() {
        radio.setCurrentStation(minStation + 2);
        radio.prev();
        expected = minStation + 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    // установить макс-1 занчение
    @Test
    public void shouldSetStationMaxMinus() {
        radio.setCurrentStation(maxStation);
        radio.prev();
        expected = maxStation - 1;
        actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
