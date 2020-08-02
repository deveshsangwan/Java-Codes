package com.devesh;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader f = new FileReader("D:\\1.txt");
        BufferedReader br = new BufferedReader(f);
        int count = 0;
        String str;
        while((str = br.readLine()) != null){
            String[] wordList = str.split("\\s");
            count += wordList.length;
        }
        System.out.println(count);

    }
}
