package ru.netology.javaqa.task10.services;

public class Radio {
    private int currentStation; // номер текущей радиостанции
    private int volume;  // горомкость

    public int getCurrentStation() {

        return currentStation;
    }

    public int getVolume() {

        return volume;
    }

    public void setCurrentStation(int newCurrentStation) {  // установка радистанции
        if(newCurrentStation < 0)
            currentStation = 0;
        else
            currentStation = newCurrentStation % 10;
    }

    // Метод для перехода к следующей станции
    public void next() {
        currentStation = (currentStation + 1) % 10;

    }

    // Метод для перехода к предыдущей станции
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    // Метод для увеличения громкости
    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    // Метод для уменьшения громкости
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

}



