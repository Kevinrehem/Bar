package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {
        // Configurações básicas do JFrame
        setTitle("Restaurante - Menu Principal");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setResizable(false);

        // Painel principal com BorderLayout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(new Color(240, 240, 240));

        // Título (no topo)
        JLabel titulo = new JLabel("HOUSE OF BEER", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(70, 70, 70));
        panel.add(titulo, BorderLayout.NORTH);

        // Painel de botões (no centro)
        JPanel botoesPanel = new JPanel(new GridLayout(4, 2, 15, 15));
        botoesPanel.setBackground(new Color(240, 240, 240));

        // Cria os botões
        String[] botoes = {
                "Novo Pedido", "Cadastrar Novo Produto",
                "Fechar Conta", "Consultar Cardápio",
                "Consultar Mesa", "Gerenciar Estoque",
                "SAIR"
        };

        for (String textoBotao : botoes) {
            JButton botao = criarBotao(textoBotao);
            botoesPanel.add(botao);
        }

        panel.add(botoesPanel, BorderLayout.CENTER);

        add(panel);
    }

    // Método para criar botões estilizados
    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("Arial", Font.PLAIN, 14));
        botao.setBackground(new Color(52, 152, 219));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Adiciona um efeito hover simples
        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao.setBackground(new Color(41, 128, 185));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao.setBackground(new Color(52, 152, 219));
            }
        });

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(botao.getText().equals("Cadastrar Novo Produto")){
                    CadastroProdutoForm cadastroProdutoForm = new CadastroProdutoForm();
                    cadastroProdutoForm.setVisible(true);
                }
            }
        });

        // Ação do botão SAIR
        if (texto.equals("SAIR")) {
            botao.setBackground(new Color(231, 76, 60));
            botao.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    botao.setBackground(new Color(192, 57, 43));
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    botao.setBackground(new Color(231, 76, 60));
                }
            });
            botao.addActionListener(e -> System.exit(0));
        }

        return botao;
    }


}
