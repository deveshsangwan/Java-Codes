import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class bytes{
    public static void main(String[] args)  throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("256bytes.txt"));
        char[] bytes = new char[256];
        for(int i = 0; i < 256; i++){
            bytes[i] = (char)i;
        }
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]+" ");
          }
          out.flush();  
          out.close();  
    }
}