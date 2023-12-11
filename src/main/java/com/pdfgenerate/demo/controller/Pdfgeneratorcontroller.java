package com.pdfgenerate.demo.controller;

import com.itextpdf.text.DocumentException;
//import com.pdfgenerate.demo.service.Pdfgeneratorservice;
import com.pdfgenerate.demo.service.Pdfgeneratorservice1;
import com.pdfgenerate.demo.service.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class Pdfgeneratorcontroller {
    @Autowired
    Pdfgeneratorservice1 pdfgeneratorservice;
    @PostMapping("/generate")
    public ResponseEntity<String> generatePdf(@RequestBody Reservation reservation) {
        try {
            String filepath = "C:/Users/gokki/Downloads/reservation.pdf";
            pdfgeneratorservice.generatePdf(reservation,filepath);
            return new ResponseEntity<>("PDF generated successfully", HttpStatus.OK);
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error generating PDF", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
