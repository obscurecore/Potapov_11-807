package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
        TextAnalyzer analyzer = new JacardTextAnalayzer();
        TextAnalyzer cosAnalyzer = new CosMethod();
        //Scanner scFile = new Scanner(new File("C:\\inform\\myhomework\\home15\\src\\ru\\kpfu\\itis\\textsimilarity\\files\\Text.txt"));
        File file1 = new File("C:\\inform\\myhomework\\home15\\src\\ru\\kpfu\\itis\\textsimilarity\\files\\Text1.txt");
        File file2 = new File("C:\\inform\\myhomework\\home15\\src\\ru\\kpfu\\itis\\textsimilarity\\files\\Text2.txt");
        //ArrayList<String> file = new ArrayList<>();
        double coef = analyzer.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
        double cosCoef = cosAnalyzer.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
    {
        System.out.println("Жакард через файл "+coef);
        System.out.println("Косинус через файл "+cosCoef);
    }
}
