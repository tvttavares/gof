package com.tvt.gof.adapter.csvAdapter;

import com.tvt.gof.adapter.adaptee.CsvFormattable;
import com.tvt.gof.adapter.source.TextFormattable;

public class CsvAdapterImpl implements TextFormattable {

    CsvFormattable csvFormatter;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }
}