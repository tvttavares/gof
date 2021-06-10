package com.tvt.gof.adapter.adaptee;

public class CsvFormatter implements CsvFormattable {

    @Override
    public String formatCsvText(String text) {
        String formattedText = text.replace(".", ",");
        return formattedText;
    }
}