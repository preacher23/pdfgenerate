package com.pdfgenerate.demo.service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
@Service
public class Pdfgeneratorservice1 {
    public void generatePdf(Reservation reservation,String filepath) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filepath));
        document.open();

        PdfPTable headerTable = generateTableHeader();
        document.add(headerTable);
        Reservation reservation1 = new Reservation();

        PdfPTable dataTable = generatepdfTable(reservation);
        document.add(dataTable);

        document.close();
    }

    private PdfPTable generatepdfTable(Reservation reservation) {
        PdfPTable dataTable = new PdfPTable(3);
        dataTable.setWidthPercentage(50);

        dataTable.addCell(createCell(reservation.getDepartureCity()));
        dataTable.addCell(createCell(reservation.getFlightNumber()));
        dataTable.addCell(createCell(reservation.getArrivalCity()));
        return dataTable;

    }
    private PdfPCell createCell(String content) {
        PdfPCell cell = new PdfPCell(new Phrase(content));
        return cell;
    }


    private static PdfPTable generateTableHeader() throws DocumentException {
        PdfPTable headerTable = new PdfPTable(3);
        headerTable.setWidthPercentage(50);

        PdfPCell cityCell = new PdfPCell(new Phrase("City"));
        PdfPCell arrivalCell = new PdfPCell(new Phrase("Arrival"));
        PdfPCell flightNumberCell = new PdfPCell(new Phrase("Flight Number"));

        headerTable.addCell(cityCell);
        headerTable.addCell(arrivalCell);
        headerTable.addCell(flightNumberCell);

        return headerTable;
    }

}
