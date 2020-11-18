import java.io.*;
import java.util.Scanner;

public class Product {
    private int id;
    private String nameOfProduct;
    private double price;
    private  int quantity;
    private String description;

    public Product(int id, String nameOfProduct, double price, int quantity, String description) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id :" + id +
                "| '" + nameOfProduct + '\'' +
                "|  " + price +
                "|  " + quantity +
                "|  " + description ;
    }
}
class TestProduct{
    public static void main(String[] args) {
        Product[] product=new Product[3];
        product[0]=new Product(123,"milk",1.54,12,"healthy");
        product[1]=new Product(456,"meat",7.34,6,"fresh");
        product[2]=new Product(789,"egg",2.94,20,"Bio");
        for (Product i:product) {
            System.out.println(i);
        }
        try {
        File file=new File("g://bill.txt");

            if (file.createNewFile()){
                System.out.println("done");
            }else{  System.out.println("it's already created");
        }
           FileWriter fileWriter =new FileWriter(file);

            fileWriter.write(String.valueOf(product[0])+"\n");
            fileWriter.write(String.valueOf(product[1])+"\n");
            fileWriter.write(String.valueOf(product[2])+"\n");
            fileWriter.close();
//A6
            System.out.println("\n"+"read bill with Scan FileReader ");
            FileReader fr = new FileReader("g://bill.txt");
            int i;
            while ((i=fr.read()) != -1)
                System.out.print((char) i);

        System.out.println("\n"+"read bill with BufferedReader");
             BufferedReader buf=new BufferedReader(new FileReader("g://bill.txt"));
             String data;
             while ((data=buf.readLine())!=null){
                 System.out.println(data);
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
