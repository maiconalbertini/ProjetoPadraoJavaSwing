package br.eng.controller;


import br.eng.model.DocumentoModel;

public class MainController {

    private final DocumentoModel model;

    public MainController() {
        this.model = new DocumentoModel();
    }

    public void gerarPDF() {
        model.gerarPDF("saida.pdf");
        System.out.println("PDF gerado em: saida.pdf");
    }
}
