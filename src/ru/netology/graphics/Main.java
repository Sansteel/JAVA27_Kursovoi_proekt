package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextColorSchemaImpl;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут
        TextColorSchema schema = new TextColorSchemaImpl(); //тут задаем кто реализует интерфейс перевода в символы
        // вкл -откл ограничения
//        converter.setMaxWidth(200);
//        converter.setMaxHeight(1000);
//      converter.setMaxRatio(2);
        converter.setTextColorSchema(schema);

        // объект вашего класса конвертера

        //После того, как вы реализуете ваши классы, откройте класс Main и заполните
        // переменную для конвертера объектом вашего класса, чтобы он был передан серверу.
        // Теперь, после старта метода main будет запущен сервер на строке server.start().
        // Сервер будет писать о происходящем в консоль. Если ему удалось успешно стартовать,
        // то страница приложения будет доступна по локальному для вашего компьютера адресу http://localhost:8888/ .

        //converter.setMaxRatio(2);  // выставляет максимально допустимое соотрношение сторон картинки
        GServer server = new GServer(converter); // Создаём объект сервера


        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);

        //Для конвертации достаточно вставить прямую ссылку на картинку форму и нажать Convert.
        // Если конвертация будет успешной, то перед вами будет изображение,
        // выполненное текстовой графикой (его сервер получит от вашего конвертера).
        // Если конвертер не сможет сконвертировать, то в консоли будет стек-трейс исключения,
        // однако сервер при этом не упадёт, а продолжит свою работу
        // (на веб-странице же будет сообщение о том, что конвертация не удалась).
    }
}