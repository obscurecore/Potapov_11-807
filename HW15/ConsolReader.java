package ru.kpfu.itis.textsimilarity;

import java.util.List;
import java.util.Scanner;

public class ConsolReader {
    TextAnalyzer analyzer = new JacardTextAnalayzer();
    TextAnalyzer cosAnalyzer = new CosMethod();
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("Первый текст");
    }

    String consolWord1 = sc.nextLine();

    {
        System.out.println("Второй текст");
    }

    String consolWord2 = sc.nextLine();
    double coef = analyzer.analyze(new SimpleTextProvider(consolWord1), new SimpleTextProvider(consolWord2));
    double cosCoef = cosAnalyzer.analyze(new SimpleTextProvider(consolWord1), new SimpleTextProvider(consolWord2));
    {
        System.out.println("Коэффициент схожести по Джакарду: " + coef);
        System.out.println("Косинусова мера: "+cosCoef);
    }
}
