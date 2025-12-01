package com.yxy;

import com.yxy.service.BookService;
import com.yxy.service.impl.BookServiceImpl;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();


        /*
        try {
            // Windows 系统使用 tasklist.exe
            Process process = Runtime.getRuntime().exec("tasklist.exe");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // 输出每个进程的信息
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}