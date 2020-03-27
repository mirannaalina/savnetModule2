package session6;

import java.io.FileInputStream;
import java.io.IOException;

public class Example {

    public static void main(String args[]) //throws IOException
    {
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("B:/myfile.txt");
            int k;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
            fis.close();
        }catch (IOException e){
            System.out.println("s");
    }
    }
}
