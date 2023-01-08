package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Report Students");

        Object[][] data = {
                {"Student", 1L, 2L, 3L, 4L, 5L},
                {"Cuciuc Denis", "a", 9L, 9L, 9L, 9L},
                {"Ptasenco ELena", 9L, 9L, 9L, 9L, 9L},
                {"Ptasenco ELena", 9L, 9L, 9L, 9L, 9L},
                {"Ptasenco ELena", 9L, 9L, 9L, 9L, 9L}
        };

        // using for loop

        int rows = data.length;
        int cells = data[0].length;

        for (int i = 0; i < rows; i++) {

            // create row to create inside row all cells (cols)
            Row row = sheet.createRow(i);

            for (int j = 0; j < cells; j++) {
                Cell cell = row.createCell(j);

                Object value = data[i][j];

                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Long) {
                    cell.setCellValue((Long) value);
                }
            }
        }
        new File("C:\\Users\\devel\\OneDrive\\Documents\\reports\\username").mkdir();
        String filePath = "C:\\Users\\devel\\OneDrive\\Documents\\reports\\username\\students.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);

        outputStream.close();
        System.out.println("students.xlx is written succesfully...");
    }
}
