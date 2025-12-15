package com.yxy;

import java.nio.charset.Charset;

public class EncodingTest {
    public static void main(String[] args) {
        // System.out.println("系统默认编码: " + System.getProperty("file.encoding"));
        // System.out.println("控制台编码: " + System.getProperty("console.encoding"));
        // System.out.println("sun.jnu.encoding=" + System.getProperty("sun.jnu.encoding"));
        // System.out.println("默认字符集: " + Charset.defaultCharset());
        // System.out.println("-----------------------");
        // System.out.println("System Locale: " + java.util.Locale.getDefault());
        // System.out.println("OS Name: " + System.getProperty("os.name"));
        // System.out.println("OS Version: " + System.getProperty("os.version"));
        // System.out.println("测试中文显示: 你好，世界！");
        // System.out.println("测试特殊字符: ★☆→←↑↓");
        System.out.println("========== 编码信息 ==========");
        System.out.println("file.encoding: " + System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding: " + System.getProperty("sun.jnu.encoding"));
        System.out.println("Default Charset: " + Charset.defaultCharset());
        System.out.println("Console Charset: " + (System.console()));
        System.out.println("\n========== 测试输出 ==========");
        System.out.println("ASCII: Hello World");
        System.out.println("中文: 你好世界");
        System.out.println("特殊符号: 🚀⭐🎉");
        System.out.println("Emoji: 😀👍🔥");
        System.out.println("混合: Hello 中文 🚀 test");

        System.out.println("\n========== 字节测试 ==========");
        String test = "中文ABC🚀";
        System.out.println("字符串: " + test);
        System.out.println("长度（字符）: " + test.length());
        System.out.println("长度（字节-UTF8）: " + test.getBytes(Charset.forName("UTF-8")).length);
        System.out.println("长度（字节-GBK）: " + test.getBytes(Charset.forName("GBK")).length);

        // 十六进制显示
        byte[] utf8Bytes = test.getBytes(Charset.forName("UTF-8"));
        System.out.print("UTF-8 字节: ");
        for (byte b : utf8Bytes) {
            System.out.printf("%02X ", b & 0xFF);
        }
        System.out.println();
    }
}

