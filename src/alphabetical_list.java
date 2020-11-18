import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class alphabetical_list {


    public static void main(String args[])  {

       sortWords("g://data");

    }

    public static ArrayList sortWords(String nameOfFile){
        ArrayList<String> sort=new ArrayList<>();
        try {
            File file=new File("g://data");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                String output= scanner.next();
                sort.add(output);
            }
            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("before sort : ");

        for (String i:sort) {
            System.out.println(i + " ");
        }

        Collections.sort(sort);
            System.out.println("after sort");

            for (String i:sort) {
                System.out.println(i+" ");

        }
            return sort;
    }

}

