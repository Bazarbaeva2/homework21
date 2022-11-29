import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileWriter fileWriter=new FileWriter("outputText.txt")){
            fileWriter.write("\nA a");
            fileWriter.write("\nB b");
            fileWriter.write("\nC c");
            fileWriter.write("\n....");
            fileWriter.write("\n....");
            fileWriter.write("\nZ z");
            fileWriter.write("\n0");
            fileWriter.write("\n1");
            fileWriter.write("\n2");
            fileWriter.write("\n...");
            fileWriter.write("\n9");
            //fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fileReader=new FileReader("inputText .txt");
            Scanner scanner=new Scanner(fileReader);
            scanner.nextLine();
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}