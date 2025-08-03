package com.learn.string;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
    public static void main(String[] args)throws IOException {
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("Hello");
        caw.write(" world");
        String msg = caw.toString();
        System.out.println(msg);
    }
}
