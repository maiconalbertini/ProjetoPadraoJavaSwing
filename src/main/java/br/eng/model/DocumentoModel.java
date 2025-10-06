package br.eng.model;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocumentoModel {

    private static final Logger logger = Logger.getLogger(DocumentoModel.class.getName());

    public void gerarPDF(String caminhoArquivo) {
        try (PdfWriter writer = new PdfWriter(caminhoArquivo);
             PdfDocument pdf = new PdfDocument(writer);
             Document document = new Document(pdf)) {

            document.add(new Paragraph("Olá, este é um PDF de exemplo!"));
            document.add(new Paragraph("Gerado pelo projeto base Swing MVC."));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ocorreu um erro", e);
        }
    }
}
