package org.example.Hw31;

public class MainHw31 {

//Реалізувати через паттерн Observer
//Задача 1:

//Реализуйте систему оповещения для погодной станции.
//Погодная станция отслеживает температуру и уведомляет своих подписчиков
//(например, дисплеи или мобильные приложения) об изменениях температуры.

//Создайте интерфейс Observer с методом update(int temperature).    +

//Создайте класс WeatherStation, который будет иметь методы для добавления,
//удаления и уведомления наблюдателей, а также метод для обновления температуры.    +

//Создайте класс DisplayPhone, который реализует интерфейс Observer
//и выводит обновленную температуру на консоль.     +

//Создайте класс DisplayTv, который реализует интерфейс Observer
// и выводит обновленную температуру на консоль.    +

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObserver(new ObserverHuman("Sara", "Tv"));
        weatherStation.addObserver(new ObserverHuman("Yui", "Phone"));
        weatherStation.addObserver(new ObserverHuman("Mikaela", "Tv"));
        weatherStation.addObserver(new ObserverHuman("Amity", "Phone"));
        System.out.println(weatherStation + "\n");

        weatherStation.notifyObserver(7);

        weatherStation.removeObserver(new ObserverHuman("Yui", "Phone"));
        System.out.println(weatherStation);

    }

}
