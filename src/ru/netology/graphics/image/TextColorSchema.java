package ru.netology.graphics.image;

//Мы написали интерфейс конвертера так,
// чтобы сам он не подбирал каждому цвету определённый символ,
// но чтобы им занимался другой объект следующего интерфейса

public interface TextColorSchema {
    char convert(int color);
}
