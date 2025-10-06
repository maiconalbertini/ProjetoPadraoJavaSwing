package br.eng.view;

import br.eng.controller.MainController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final MainController controller;

    public MainFrame() {
        this.controller = new MainController();
        configurarJanela();
        inicializarComponentes();
    }

    private void configurarJanela() {
        setTitle("Projeto Base Swing MVC");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        JButton botaoPDF = new JButton("Gerar PDF de Exemplo");
        botaoPDF.addActionListener(e -> controller.gerarPDF());

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(botaoPDF, BorderLayout.CENTER);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}