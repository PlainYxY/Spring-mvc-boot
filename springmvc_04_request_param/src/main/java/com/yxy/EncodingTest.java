package com.yxy;

public class EncodingTest {
    public static void main(String[] args) {
        System.out.println("系统默认编码: " + System.getProperty("file.encoding"));
        System.out.println("控制台编码: " + System.getProperty("console.encoding"));
        System.out.println("测试中文显示: 你好，世界！");
        System.out.println("测试特殊字符: ★☆→←↑↓");
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding=" + System.getProperty("sun.jnu.encoding"));
        System.out.println("Default Charset=" + java.nio.charset.Charset.defaultCharset());
    }
}

