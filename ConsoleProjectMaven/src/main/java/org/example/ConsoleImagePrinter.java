package org.example;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ConsoleImagePrinter {
    public static void main(String[] args) {
        new ConsoleImagePrinter();
    }
    public ConsoleImagePrinter(){
        try {
            BufferedImage image = ImageIO.read(new File("/home/keerthanas/IdeaProjects/ConsoleProjectMaven/src/main/java/org/example/img.png"));
            printImage(image);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\033[0;107m                                                                                                    \033[0m");
        System.out.println("\033[0;107m                                                                                                    \033[0m");
        System.out.println("\033[0;107m                                                                                                    \033[0m");
    }
    private static void printImage(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int consoleWidth = 50;
        int consoleHeight = 30;
        int scaleX = (width / consoleWidth);
        int scaleY = (height / consoleHeight);
        for (int y = 0; y < consoleHeight; y++) {
            for (int x = 0; x < consoleWidth; x++) {
                int pixel = image.getRGB(x * scaleX, y * scaleY);
                String asciiChar = getAsciiChar(pixel);
                System.out.print(asciiChar);
            }
            System.out.println();
        }
    }
    private static String getAsciiChar(int pixel) {
        String[] asciiChars = {"\033[40m"+"  "+"\033[0m", "\033[0;107m"+"  "+"\033[0m" };
        int grayValue = (int) (0.21 * ((pixel >> 16) & 0xFF) + 0.72 * ((pixel >> 8) & 0xFF) + 0.07 * (pixel & 0xFF));
        int threshold = 120;
        return (grayValue < threshold) ? asciiChars[0] : asciiChars[1];
    }



}

