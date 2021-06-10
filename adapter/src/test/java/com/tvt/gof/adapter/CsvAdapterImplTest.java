package com.tvt.gof.adapter;

import com.tvt.gof.adapter.adaptee.CsvFormattable;
import com.tvt.gof.adapter.adaptee.CsvFormatter;
import com.tvt.gof.adapter.csvAdapter.CsvAdapterImpl;
import com.tvt.gof.adapter.source.NewLineFormatter;
import com.tvt.gof.adapter.source.TextFormattable;
import org.junit.jupiter.api.Test;

public class CsvAdapterImplTest {

    @Test
    public void testFormatText() throws Exception {
        String testString = " Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);

        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter = new CsvAdapterImpl(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);

        System.out.println(resultCsvString);
    }
}