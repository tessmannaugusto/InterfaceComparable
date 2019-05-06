package Application;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();
            while (name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list){
                System.out.println(s);
            }

        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
}
