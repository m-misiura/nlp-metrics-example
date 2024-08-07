package com.example;

import org.kie.trustyai.metrics.language.rouge.ROUGE;
import org.kie.trustyai.metrics.language.rouge.ROUGE.RougeTypes;

public class MetricsExample {
    public static void main(String[] args) {
        RougeTypes type = RougeTypes.ROUGE1;
        ROUGE rouge = new ROUGE(type);

        String hypothesis = "The cat is on the mat.";
        String reference = "The cat is on the mat.";

        double score = rouge.calculate(reference, hypothesis); // Use calculate instead of compute
        System.out.println("ROUGE-1 score: " + score);
    }
}
