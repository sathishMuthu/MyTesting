package com.testing.selenium.testcase;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class Test {

    @org.testng.annotations.Test
    public void extractMathSymbolsFromPdf() {
        File file = new File("/Users/sathish/AI_Agent_Workspace/agents/exercise/books/Class_10_Mathematics_notes.pdf");
        StringBuilder extractedText = new StringBuilder();

        try (PDDocument document = Loader.loadPDF(file)) {
            if (!document.isEncrypted()) {
                PDFTextStripper stripper = new PDFTextStripper();

                // Force UTF-8 encoding explicitly for Unicode math characters
                stripper.setSortByPosition(true);
                stripper.setStartPage(1);
                stripper.setEndPage(document.getNumberOfPages());

                String rawText = stripper.getText(document);
                extractedText.append(rawText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(extractedText.toString());
        //return extractedText.toString();
    }
}