import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestWork3 {
    public static void main(String[] args) {
//A1
       File file=new File("g://myFile.txt");
        try {
            boolean b=file.createNewFile();
           if (b==true){
               System.out.println("done");
           }else {
               System.out.println("it's already created");
           }

            //A2


            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("Hello World");
            fileWriter.close();

            //A3

            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                String s=scanner.next();
                System.out.print(s+" ");
            }

            //Advance

           /* String[] word = {"egg"};
            int wordCount = 0;

            while(scanner.hasNextLine()) {
                String text = scanner.nextLine();
                for (String i:word) {
                    if (i.equals("egg")) {
                        wordCount++;
                    }
                }
            }
            System.out.println("\n"+"count of eggs word is = " + wordCount);
*/
            //A4
            removeFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }

    public  static  boolean removeFile() {
        File file = new File("g://myFile.txt");
        if (file.delete()) {
            System.out.println("\n" + "File deleted");
        } else {
            System.out.println("\n" + "File was not deleted");
        }
        return true;

    }

}











