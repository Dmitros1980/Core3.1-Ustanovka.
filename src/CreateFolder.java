import javax.swing.plaf.metal.MetalIconFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CreateFolder {
    public String pathFolder;
    public String pathFale;

    public static void createFolder(String pathFolder) {
        File myDiretori = new File(pathFolder);
        if (myDiretori.mkdir())
            System.out.println("Папка " + pathFolder + " успешно создана.");
        else
            System.out.println("Папка " + pathFolder + " не создана.");
    }


    public static void createFale(String pathFale) {
        File myfile = new File(pathFale);

        try {
            if (myfile.createNewFile())
                System.out.println("Файл " + pathFale + " успешно создан.");
            else
                System.out.println("Файл " + pathFale + " не создан.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
