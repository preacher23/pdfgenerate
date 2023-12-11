package com.pdfgenerate.demo.service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//@Service
//public class Pdfgeneratorservice{
//     public void generatePdf(Reservation reservation,String filepath) throws FileNotFoundException, DocumentException {
//         Document document=new Document();
//
//         PdfWriter.getInstance(document,new FileOutputStream(filepath));
//
//         document.open();
//
//         document.add(generatepdftable(reservation));
//
//         document.close();
//     }
//
//
//
////    private PdfPTable generatepdftable(Reservation reservation) {
////        PdfPTable pdfPTable = new PdfPTable(2);
////        PdfPCell cell;
////
////        cell=new PdfPCell(new Phrase("flight iterinary"));
////        cell.setColspan(2);
////        pdfPTable.addCell(cell);
////
////        pdfPTable.addCell("arrival city");
////        pdfPTable.addCell(reservation.getArrivalCity());
////
////        pdfPTable.addCell("flightnumber");
////        pdfPTable.addCell(reservation.getFlightNumber());
////
////        pdfPTable.addCell("departurecity");
////
////        pdfPTable.addCell(reservation.getDepartureCity());
////        return pdfPTable;
////    }
//}
