package Exercise14;

import java.io.File;
import java.io.FileInputStream;

//how to open a file in java. There are following ways to open a file in java
//Java desktop class, Java FileInputStream class, Java BufferedReader class, Java FileReader class
//Java Scanner class, Java nio package
//Below is an example of Java FileInputStream class
public class Example2 {

    public static void main(String[] args) {

        try{
            File file = new File("C:\\input.txt");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("File Content: ");
            int r = 0;
            while((r= fis.read())!=-1){
                System.out.print((char)r); //prints the content of the file
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
