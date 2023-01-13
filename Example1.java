package Exercise14;
import java.awt.*;
import java.io.File;
//how to open a file in java. There are following ways to open a file in java
//Java desktop class, Java FileInputStream class, Java BufferedReader class, Java FileReader class
//Java Scanner class, Java nio package
//Below is an example of desktop class
public class Example1 {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\input.txt");
            if(!Desktop.isDesktopSupported()){
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
