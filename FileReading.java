//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.*;
public class FileReading {
    public static void main(String args[])throws Exception{
        File file = new File("C:\\Users\\DDEEPIKA\\Music\\test.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
    }
}
