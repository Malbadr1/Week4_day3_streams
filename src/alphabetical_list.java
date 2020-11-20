import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class alphabetical_list {


    public static void main(String args[])  {

       sortWords("g://data.txt");

    }

    public static ArrayList sortWords(String nameOfFile){
        ArrayList<String> sort1=new ArrayList<>();
        try {
            File file=new File("g://data.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                String output= scanner.next();
                sort1.add(output);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("before sort : ");

        for (String i:sort1) {
            System.out.print(i + " , ");
        }


        Collections.sort(sort1);
            System.out.println("after sort");

            for (String i:sort1) {
                System.out.print(i+" , ");

        }
            return sort1;
    }

}

