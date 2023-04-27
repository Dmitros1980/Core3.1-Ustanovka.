import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        File myDiretori = new File("C:\\Users\\B\\Desktop\\Games1\\src");
        if (myDiretori.mkdir())
            System.out.println("Папка src успешно создана.");
        else
            System.out.println("Папка src не создана.");

        File myDiretori_a = new File("C:\\Users\\B\\Desktop\\Games1\\src\\main");
        if (myDiretori_a.mkdir())
            System.out.println("Папка main успешно создана.");
        else
            System.out.println("Папка main не создана.");

        File myfile1_a = new File("C:\\Users\\B\\Desktop\\Games1\\src\\main", "Main.java");
        try {
            if (myfile1_a.createNewFile())
                System.out.println("Файл Main.java успешно создан.");
            else
                System.out.println("Файл Main.java не создан.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File myfile1_b = new File("C:\\Users\\B\\Desktop\\Games1\\src\\main", "Utils.java");

        try {
            if (myfile1_b.createNewFile())
                System.out.println("Файл Utils.java успешно создан.");
            else
                System.out.println("Файл Utils.java не создан.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        File myDiretori_b = new File("C:\\Users\\B\\Desktop\\Games1\\src\\test");
        if (myDiretori_b.mkdir())
            System.out.println("Папка test успешно создана.");
        else
            System.out.println("Папка test не создана.");


        File myDiretori1 = new File("C:\\Users\\B\\Desktop\\Games1\\res");
        if (myDiretori1.mkdir())
            System.out.println("Папка res успешно создана.");
        else
            System.out.println("Папка res не создана.");

        File myDiretori1_a = new File("C:\\Users\\B\\Desktop\\Games1\\res\\drawables");
        if (myDiretori1_a.mkdir())
            System.out.println("Папка drawables  успешно создана.");
        else
            System.out.println("Папка drawables не создана.");

        File myDiretori1_b = new File("C:\\Users\\B\\Desktop\\Games1\\res\\vectors");
        if (myDiretori_b.mkdir())
            System.out.println("Папка vectors успешно создана.");
        else
            System.out.println("Папка vectors не создана.");

        File myDiretori1_c = new File("C:\\Users\\B\\Desktop\\Games1\\res\\icons");
        if (myDiretori1_c.mkdir())
            System.out.println("Папка icons успешно создана.");
        else
            System.out.println("Папка icons не создана.");

        File myDiretori2 = new File("C:\\Users\\B\\Desktop\\Games1\\savegames");
        if (myDiretori2.mkdir())
            System.out.println("Папка savegames успешно создана.");
        else
            System.out.println("Папка savegames не создана.");

        File myDiretori3 = new File("C:\\Users\\B\\Desktop\\Games1\\temp");
        if (myDiretori3.mkdir())
            System.out.println("Папка temp успешно создана.");
        else
            System.out.println("Папка temp не создана.");

        File myfile3_a = new File("C:\\Users\\B\\Desktop\\Games1\\temp", " temp.txt");

        try {
            if (myfile3_a.createNewFile())
                System.out.println("Файл  temp.txt успешно создан.");
            else
                System.out.println("Файл  temp.txt не создан.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Hello world!\n");

        builder.append(
                "Папка src успешно создана.\n" +
                        "Папка main успешно создана.\n" +
                        "Файл Main.java успешно создан.\n" +
                        "Файл Utils.java успешно создан.\n" +
                        "Папка test успешно создана.\n" +
                        "Папка res успешно создана.\n" +
                        "Папка drawables  успешно создана.\n" +
                        "Папка vectors не создана.\n" +
                        "Папка icons успешно создана.\n" +
                        "Папка savegames успешно создана.\n" +
                        "Папка temp успешно создана.\n" +
                        "Файл  temp.txt успешно создан.\n ");
        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }

    }
}
//    В данной задаче Вы потренируетесь работать с файлами и каталогами в файловой системе,
//        используя язык Java и класс File, и смоделируете процесс установки игры на жесткий
//        диск комьютера.
//
//        Предварительно вручную создайте папку Games в удобном для Вас месте. Имейте ввиду,
//        что у папки Games должны быть права на запись и чтение. Например, в операционной
//        системе macOS можно
//        создать папку по следующему пути /Users/admin/Games. В ОС Windows можете создать
//        папку на одном из доступных жестких дисков, например D://Games.
//
//        Установку программы необходимо производить из Java кода с использованием класса
//        File. Процесс будет состоять из следующих этапов:
//
//        В папке Games создайте несколько директорий: src, res, savegames, temp.
//        В каталоге src создайте две директории: main, test.
//        В подкаталоге main создайте два файла: Main.java, Utils.java.
//        В каталог res создайте три директории: drawables, vectors, icons.
//        В директории temp создайте файл temp.txt.
//        Файл temp.txt будет использован для записиси в него информации об успешноном или
//        неуспешном создании файлов и директорий.
//
//        Реализация
//        Для работы с файлом или директорией необходимо создать для них свой экземпляр
//        класса File, передав в конструктор адрес к файлу или директории. Создать директорию
//        можно с помощью метода mkdir(), который возвращает true или false в зависимости от
//        того, была ли директория создана успешно.
//
//        Для создания файла можно использовать метод createNewFile(), который так же возвращает
//        boolean. Обратите внимание, что этот метод пробрасывает IOException. Необходимо
//        обернуть его в блок try-catch.
//
//        Для сохранения лога используйте экземпляр класса StringBuilder. Добавляйте в него
//        всю информацию о создании файлов и каталогов. Далее возьмите из него текст и запишите
//        его в файл temp.txt с помощью класса FileWriter.
//
//        В результате выполнения программы, на жестком диске комьютера в папке Games должны
//        появиться вышеуказанные файлы и директории. Файл temp.txt должен содержать информацию
//        о том, что все файлы были созданы успешно.
