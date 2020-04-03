package session8;

import java.io.*;

public class CopyFileCharacters {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\A737860\\savnetModule2\\src\\session8\\test.txt");
            out = new FileWriter("C:\\Users\\A737860\\savnetModule2\\src\\session8\\testfinal.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
