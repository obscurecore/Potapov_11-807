package ru.kpfu.itis.textsimilarity;

public interface TextAnalyzer {
    double analyze(TextProvider text1, TextProvider text2);
}
