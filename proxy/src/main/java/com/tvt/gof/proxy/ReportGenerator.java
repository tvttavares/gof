package com.tvt.gof.proxy;

public interface ReportGenerator {

    void displayReportTemplate(String reportFormat, int reportEntries);

    void generateComplexReport(String reportFormat, int reportEntries);

    void generateSensitiveReport();
}