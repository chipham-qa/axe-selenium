package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
    public static void writeViolationsToExcel(JSONArray violations) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("AXE Violations");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Violation ID");
            headerRow.createCell(1).setCellValue("Impact");
            headerRow.createCell(2).setCellValue("Description");
            headerRow.createCell(3).setCellValue("Help URL");

            // Fill data
            for (int i = 0; i < violations.length(); i++) {
                JSONObject violation = violations.getJSONObject(i);
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(violation.getString("id"));
                row.createCell(1).setCellValue(violation.getString("impact"));
                row.createCell(2).setCellValue(violation.getString("description"));
                row.createCell(3).setCellValue(violation.getString("helpUrl"));
            }

            // Write to Excel file
            try (FileOutputStream fileOut = new FileOutputStream("output/AXE_Violations_Report.xlsx")) {
                workbook.write(fileOut);
            }
            System.out.println("AXE violations report written to AXE_Violations_Report.xlsx");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
