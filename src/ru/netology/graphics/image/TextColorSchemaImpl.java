package ru.netology.graphics.image;

import java.util.*;

public class TextColorSchemaImpl implements TextColorSchema {

    @Override
    public char convert(int color) {
//Если вы программируете на винде, то рекомендуем другой список из более стандартных символов,
// иначе может отрисовываться криво: '#', '$', '@', '%', '*', '+', '-', '''.
// В зависимости от переданного значения интенсивности белого,
// должен выбираться соответствующий символ.
        //Map<Integer, String> data = new HashMap<>(); //ключ - глубина цвета, значения - символы
       // видимо, чтобы уложиться в 1 строку нужно в констркт Traamap передавать коллекцию ключей

        TreeMap<Integer, Character > data = new TreeMap<>();
        for (int i = 0; i < 31 ; i++) data.put(i, '#');
        for (int i = 31; i < 61; i++) data.put(i, '$');
        for (int i = 61; i < 91; i++) data.put(i, '@');
        for (int i = 91; i < 121; i++) data.put(i, '%');
        for (int i = 121; i < 151; i++) data.put(i, '+');
        for (int i = 151; i < 181; i++) data.put(i, '*');
        for (int i = 181; i < 211; i++) data.put(i, '-');
        for (int i = 211; i < 300; i++) data.put(i, '.');
        return data.get(color);
    }
    //В итоге у вас должен быть класс, реализующий этот интерфейс.
    // Если объекту конвертера сеттером не передали иную реализацию этого интерфейса,
    // он должен использовать этот ваш класс как реализацию по умолчанию.
}