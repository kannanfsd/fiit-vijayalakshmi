package com.learn.string;

public class StringTextBlock {
    public static void main(String[] args) {
        String textBlock1 ="<html>\n" +
                "<head>\n" +
                "<title>Text Block</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hello world</h1></body>\n" +
                "</html>\n";
        System.out.println(textBlock1);

        String textBlock2 = """
                <html>
                    <head>
                    <title>Text Block</title>
                </head>
                <body>
                    <h1>Hello world with trible quote.</h1>
                </body>
                </html>
                """;
        System.out.println(textBlock2);
    }
}
