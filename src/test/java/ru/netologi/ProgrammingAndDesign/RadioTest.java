package ru.netologi.ProgrammingAndDesign;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


 public class RadioTest{
     @Test
     public void  currentStationTest(){
         Radio radio = new Radio();
         radio.setCurrentStation(6);
         int actual = radio.getCurrentStation();
         int expected = 6;
         Assertions.assertEquals(expected, actual);


     }
     @Test
     public void lessThanZeroValuesStationTest() {
         Radio radio = new Radio();
         radio.setCurrentStation(-1);
         int actual = radio.getCurrentStation();
         int expected = 0;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void aboveMaxValuesStationTest () {
         Radio radio = new Radio();
         radio.setCurrentStation(14);
         int actual = radio.getCurrentStation();
         int expected = 0;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void switchingToZeroStationTest() {
         Radio radio = new Radio();
         radio.setCurrentStation(5);
         radio.setCurrentStation(0);
         int actual = radio.getCurrentStation();
         int expected = 0;
         Assertions.assertEquals(expected, actual);

     }
     @Test
     public void nextCurrentStationTest(){
         Radio radio = new Radio();
         radio.setCurrentStation(9);
         radio.next();
         int actual = radio.getCurrentStation();
         int expected = 0;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void nextStationTest(){
         Radio radio = new Radio();
         radio.setCurrentStation(5);
         radio.next();
         int actual = radio.getCurrentStation();
         int expected = 6;
         Assertions.assertEquals(expected,actual);
     }
     @Test
     public void prevCurrentStationTest(){
         Radio radio = new Radio();
         radio.setCurrentStation(0);
         radio.prev();
         int actual = radio.getCurrentStation();
         int expected = 9;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void prevStationTest(){
         Radio radio = new Radio();
         radio.setCurrentStation(7);
         radio.prev();
         int actual = radio.getCurrentStation();
         int expected = 6;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void currentVolumeTest(){
         Radio radio = new Radio();
         radio.setCurrentVolume(50);
         int actual = radio.getCurrentVolume();
         int expected = 50;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void aboveMaxVolumeTest() {
         Radio radio = new Radio();
         radio.setCurrentVolume(110);
         int actual = radio.getCurrentVolume();
         int expected = 0;
         Assertions.assertEquals(expected,actual);
     }
     @Test
     public void belowMinVolumeTest() {
         Radio radio = new Radio();
         radio.setCurrentVolume(-10);
         int actual = radio.getCurrentVolume();
         int expected = 0;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void increaseVolumeTest() {
         Radio radio = new Radio();
         radio.setCurrentVolume(45);
         radio.increaseVolume();
         int actual = radio.getCurrentVolume();
         int expected = 46;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void aboveMaxIncreaseVolumeTest() {
         Radio radio = new Radio();
         radio.setCurrentVolume(100);
         radio.increaseVolume();
         int actual = radio.getCurrentVolume();
         int expected = 100;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void maxIncreaseVolumeTest() {
         Radio radio = new Radio();
         radio.setCurrentVolume(99);
         radio.increaseVolume();
         int actual = radio.getCurrentVolume();
         int expected = 100;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void minReductionVolumeTest(){
         Radio radio = new Radio();
         radio.setCurrentVolume(0);
         radio.reductionVolume();
         int actual = radio.getCurrentVolume();
         int expected = 0;
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void  reductionVolumeTest(){
         Radio radio = new Radio();
         radio.setCurrentVolume(85);
         radio.reductionVolume();
         int actual = radio.getCurrentVolume();
         int expected = 84;
         Assertions.assertEquals(expected, actual);
     }

}

