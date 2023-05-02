import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {//вторую задачу пришлю позже
        System.out.println("Hello world!");
        StringBuilder builder = new StringBuilder();
        String[] addressFolder = {"C:\\Users\\B\\Desktop\\Games1", "C:\\Users\\B\\Desktop\\Games1\\src",
                "C:\\Users\\B\\Desktop\\Games1\\res", "C:\\Users\\B\\Desktop\\Games1\\savegames",
                "C:\\Users\\B\\Desktop\\Games1\\temp", "C:\\Users\\B\\Desktop\\Games1\\src\\main",
                "C:\\Users\\B\\Desktop\\Games1\\src\\test", "C:\\Users\\B\\Desktop\\Games1\\res\\drawables",
                "C:\\Users\\B\\Desktop\\Games1\\res\\vectors", "C:\\Users\\B\\Desktop\\Games1\\res\\icons",
        };

        String[] addressFile = {"C:\\Users\\B\\Desktop\\Games1\\src\\main\\Main.java",
                "C:\\Users\\B\\Desktop\\Games1\\src\\main\\Utils.java",
                "C:\\Users\\B\\Desktop\\Games1\\temp\\temp.txt."
        };
        for (int i=0;i<addressFolder.length;i++){
            CreateFolder.createFolder(addressFolder[i]);
        }
          for (int j=0;j<addressFile.length;j++){
              CreateFolder.createFale(addressFile[j]);
          }
        builder.append(
                "Hello world!\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1 успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\src успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\res успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\savegames успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\temp успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\src\\main успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\src\\test успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\res\\drawables успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\res\\vectors успешно создана.\n" +
                        "Папка C:\\Users\\B\\Desktop\\Games1\\res\\icons успешно создана.\n" +
                        "Файл C:\\Users\\B\\Desktop\\Games1\\src\\main\\Main.java успешно создан.\n" +
                        "Файл C:\\Users\\B\\Desktop\\Games1\\src\\main\\Utils.java успешно создан.\n" +
                        "Файл C:\\Users\\B\\Desktop\\Games1\\temp\\temp.txt. успешно создан.");
        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }

    }
}
