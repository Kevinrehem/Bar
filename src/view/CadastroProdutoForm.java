package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CadastroProdutoForm extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardsPanel;

    public CadastroProdutoForm() {
        setTitle("Cadastro de Produto");
        setSize(600, 500); // Aumentei a altura para melhor visualização
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Painel principal com BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(new Color(240, 240, 240));

        // Título
        JLabel titulo = new JLabel("Cadastro de Produto", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(70, 70, 70));
        mainPanel.add(titulo, BorderLayout.NORTH);

        // Painel de seleção de tipo
        JPanel tipoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        tipoPanel.setBackground(new Color(240, 240, 240));

        JLabel tipoLabel = new JLabel("Tipo de Produto:");
        tipoLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        String[] tiposProduto = {
                "Adicionais", "Cerveja", "Destilado", "Drink",
                "Hamburguer", "Peca", "Porcao", "Refrigerante",
                "Suco", "Temaki"
        };

        JComboBox<String> tipoComboBox = new JComboBox<>(tiposProduto);
        tipoComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        tipoComboBox.setBackground(Color.WHITE);
        tipoComboBox.setPreferredSize(new Dimension(200, 30));

        tipoPanel.add(tipoLabel);
        tipoPanel.add(tipoComboBox);

        mainPanel.add(tipoPanel, BorderLayout.NORTH);

        // Painel de cards para os formulários (CENTRO do BorderLayout)
        cardLayout = new CardLayout();
        cardsPanel = new JPanel(cardLayout);
        cardsPanel.setBackground(new Color(240, 240, 240));

        // Adiciona todos os formulários
        addFormulario("Adicionais", criarFormularioAdicionais());
        addFormulario("Cerveja", criarFormularioCerveja());
        addFormulario("Destilado", criarFormularioDestilado());
        addFormulario("Drink", criarFormularioDrink());
        addFormulario("Hamburguer", criarFormularioHamburguer());
        addFormulario("Peca", criarFormularioPeca());
        addFormulario("Porcao", criarFormularioPorcao());
        addFormulario("Refrigerante", criarFormularioRefrigerante());
        addFormulario("Suco", criarFormularioSuco());
        addFormulario("Temaki", criarFormularioTemaki());

        // Adiciona scroll pane para os formulários
        JScrollPane scrollPane = new JScrollPane(cardsPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Painel de botões (SUL do BorderLayout)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBackground(new Color(240, 240, 240));

        JButton salvarButton = criarBotao("Salvar", new Color(46, 204, 113));
        JButton cancelarButton = criarBotao("Cancelar", new Color(231, 76, 60));

        buttonPanel.add(salvarButton);
        buttonPanel.add(cancelarButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Listener para o ComboBox
        tipoComboBox.addActionListener(e -> {
            String selected = (String) tipoComboBox.getSelectedItem();
            cardLayout.show(cardsPanel, selected);
        });

        add(mainPanel);
    }

    private JButton criarBotao(String texto, Color cor) {
        JButton botao = new JButton(texto);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setBackground(cor);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));

        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao.setBackground(cor.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao.setBackground(cor);
            }
        });

        return botao;
    }

    private void addFormulario(String nome, JPanel formulario) {
        cardsPanel.add(formulario, nome);
    }

    // Métodos para criar cada formulário
    private JPanel criarFormularioAdicionais() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        return panel;
    }

    private JPanel criarFormularioCerveja() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Tamanho (ml):", "0");
        adicionarCampo(panel, "Grau Alcoólico:", "0.0");
        adicionarCampo(panel, "Tipo:", "");
        return panel;
    }

    private JPanel criarFormularioDestilado() {
        String[] tipos = {"Vodka", "Cachaça", "Whisky", "Rum", "Cognac",
                "Gin", "Tequila", "Absinto", "Jaggermeister"};
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Tipo:", tipos);
        return panel;
    }

    private JPanel criarFormularioDrink() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Tamanho (ml):", "0");
        adicionarCampo(panel, "Grau Alcoólico:", "0.0");
        adicionarAreaTexto(panel, "Ingredientes (um por linha):");
        return panel;
    }

    private JPanel criarFormularioHamburguer() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Combo (adicional):", "0.00");
        adicionarAreaTexto(panel, "Ingredientes:");
        return panel;
    }

    private JPanel criarFormularioPeca() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarAreaTexto(panel, "Ingredientes:");
        return panel;
    }

    private JPanel criarFormularioPorcao() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Molho:", "");
        adicionarAreaTexto(panel, "Ingredientes:");
        return panel;
    }

    private JPanel criarFormularioRefrigerante() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Tamanho (ml):", "0");
        return panel;
    }

    private JPanel criarFormularioSuco() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Tamanho (ml):", "0");
        adicionarCampo(panel, "Sabor:", "");
        adicionarCheckbox(panel, "Com açúcar:");
        return panel;
    }

    private JPanel criarFormularioTemaki() {
        JPanel panel = criarPanelFormulario();
        adicionarCampo(panel, "Nome:", "");
        adicionarCampo(panel, "Preço:", "0.00");
        adicionarCampo(panel, "Estoque:", "0");
        adicionarCampo(panel, "Combo (adicional):", "0.00");
        adicionarAreaTexto(panel, "Ingredientes:");
        return panel;
    }

    private JPanel criarPanelFormulario() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.setBackground(new Color(240, 240, 240));
        return panel;
    }

    private void adicionarCampo(JPanel panel, String label, String placeholder) {
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        rowPanel.setBackground(new Color(240, 240, 240));
        rowPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel.setPreferredSize(new Dimension(150, 25));

        JTextField textField = new JTextField(placeholder);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setPreferredSize(new Dimension(200, 28));

        rowPanel.add(jLabel);
        rowPanel.add(textField);
        panel.add(rowPanel);
    }

    private void adicionarCampo(JPanel panel, String label, String[] opcoes) {
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        rowPanel.setBackground(new Color(240, 240, 240));
        rowPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel.setPreferredSize(new Dimension(150, 25));

        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        comboBox.setPreferredSize(new Dimension(200, 28));

        rowPanel.add(jLabel);
        rowPanel.add(comboBox);
        panel.add(rowPanel);
    }

    private void adicionarAreaTexto(JPanel panel, String label) {
        JPanel rowPanel = new JPanel(new BorderLayout(5, 5));
        rowPanel.setBackground(new Color(240, 240, 240));
        rowPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JTextArea textArea = new JTextArea(3, 20);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        rowPanel.add(jLabel, BorderLayout.NORTH);
        rowPanel.add(scrollPane, BorderLayout.CENTER);
        panel.add(rowPanel);
    }

    private void adicionarCheckbox(JPanel panel, String label) {
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        rowPanel.setBackground(new Color(240, 240, 240));
        rowPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel jLabel = new JLabel(label);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        jLabel.setPreferredSize(new Dimension(150, 25));

        JCheckBox checkBox = new JCheckBox();
        checkBox.setBackground(new Color(240, 240, 240));

        rowPanel.add(jLabel);
        rowPanel.add(checkBox);
        panel.add(rowPanel);
    }

}