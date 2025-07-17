package raicesDePolinomios_Graficadora;

public class PoliCalcView extends javax.swing.JFrame {
    public PoliCalcView() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelGraficar = new javax.swing.JPanel();
        buttonGraficar = new javax.swing.JButton();
        panelGrafico = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        scrollPaneCalculadora = new javax.swing.JScrollPane();
        panelCalculadora = new javax.swing.JPanel();
        panelPolinomio = new javax.swing.JPanel();
        labelPolinomios = new javax.swing.JLabel();
        buttonAgregarTerminos = new javax.swing.JButton();
        buttonQuitarTerminos = new javax.swing.JButton();
        panelTerminos = new javax.swing.JPanel();
        panelDivision = new javax.swing.JPanel();
        comboMetodo = new javax.swing.JComboBox<>();
        labelMetodo = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        textA = new javax.swing.JTextField();
        textB = new javax.swing.JTextField();
        labelB = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        textC = new javax.swing.JTextField();
        labelCociente = new javax.swing.JLabel();
        textCociente = new javax.swing.JTextField();
        labelResto = new javax.swing.JLabel();
        textResto = new javax.swing.JTextField();
        buttonDividir = new javax.swing.JButton();
        panelRaizAprox = new javax.swing.JPanel();
        labelEpsilon = new javax.swing.JLabel();
        textEpsilon = new javax.swing.JTextField();
        labelValorInicial = new javax.swing.JLabel();
        textValorInicial = new javax.swing.JTextField();
        buttonCalcular = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        textResultado = new javax.swing.JTextField();
        panelRaicesBairstow = new javax.swing.JPanel();
        labelEpsilonBairstow = new javax.swing.JLabel();
        labelR = new javax.swing.JLabel();
        textEpsilonBairstow = new javax.swing.JTextField();
        textR = new javax.swing.JTextField();
        labelS = new javax.swing.JLabel();
        textS = new javax.swing.JTextField();
        textMaxIter = new javax.swing.JTextField();
        labelMaxIter = new javax.swing.JLabel();
        labelReales = new javax.swing.JLabel();
        textReales = new javax.swing.JTextField();
        labelImaginarias = new javax.swing.JLabel();
        textImag = new javax.swing.JTextField();
        buttonRaicesBairstow = new javax.swing.JButton();
        panelCotas = new javax.swing.JPanel();
        labelMetodoCotas = new javax.swing.JLabel();
        comboMetodoCotas = new javax.swing.JComboBox<>();
        labelValorInicialCotas = new javax.swing.JLabel();
        textValorInicialCotas = new javax.swing.JTextField();
        checkRefinar = new javax.swing.JCheckBox();
        labelCotaInfNeg = new javax.swing.JLabel();
        textCotaInfNeg = new javax.swing.JTextField();
        textCotaSupNeg = new javax.swing.JTextField();
        labelCotaSupNeg = new javax.swing.JLabel();
        labelCotaInfPos = new javax.swing.JLabel();
        textCotaInfPos = new javax.swing.JTextField();
        labelCotaSupPos = new javax.swing.JLabel();
        textCotaSupPos = new javax.swing.JTextField();
        buttonCotas = new javax.swing.JButton();
        panelRaices = new javax.swing.JPanel();
        labelEnteras = new javax.swing.JLabel();
        textEnteras = new javax.swing.JTextField();
        labelRacionales = new javax.swing.JLabel();
        textRacionales = new javax.swing.JTextField();
        buttonRaices = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1125, 732));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(1200, 720));

        panelGraficar.setPreferredSize(new java.awt.Dimension(600, 680));

        buttonGraficar.setText("Graficar");

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGraficarLayout = new javax.swing.GroupLayout(panelGraficar);
        panelGraficar.setLayout(panelGraficarLayout);
        panelGraficarLayout.setHorizontalGroup(
            panelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGraficarLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(buttonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        panelGraficarLayout.setVerticalGroup(
            panelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonGraficar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        /*javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGraficarLayout = new javax.swing.GroupLayout(panelGraficar);
        panelGraficar.setLayout(panelGraficarLayout);
        panelGraficarLayout.setHorizontalGroup(
            panelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGraficarLayout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(buttonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        panelGraficarLayout.setVerticalGroup(
            panelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficarLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(buttonGraficar)
                .addGap(47, 47, 47)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );*/

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setText("Calculadora de Polinomios");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPaneCalculadora.setPreferredSize(new java.awt.Dimension(476, 680));
        
        panelCalculadora.setPreferredSize(new java.awt.Dimension(460, 1072));

        labelPolinomios.setText("Términos:");

        buttonAgregarTerminos.setText("Agregar");

        buttonQuitarTerminos.setText("Quitar");

        javax.swing.GroupLayout panelTerminosLayout = new javax.swing.GroupLayout(panelTerminos);
        panelTerminos.setLayout(panelTerminosLayout);
        panelTerminosLayout.setHorizontalGroup(
            panelTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTerminosLayout.setVerticalGroup(
            panelTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPolinomioLayout = new javax.swing.GroupLayout(panelPolinomio);
        panelPolinomio.setLayout(panelPolinomioLayout);
        panelPolinomioLayout.setHorizontalGroup(
            panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTerminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPolinomioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPolinomios)
                .addGap(62, 62, 62)
                .addComponent(buttonAgregarTerminos)
                .addGap(63, 63, 63)
                .addComponent(buttonQuitarTerminos)
                .addGap(62, 62, 62))
        );
        panelPolinomioLayout.setVerticalGroup(
            panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPolinomios)
                    .addComponent(buttonAgregarTerminos)
                    .addComponent(buttonQuitarTerminos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Horner simple (x +a)", "Horner simple (ax + b)", "Horner Doble (x^2 + ax + b)", "Horner Doble (ax^2 + bx + c)" }));

        labelMetodo.setText("Seleccionar:");

        labelA.setText("a:");

        labelB.setText("b:");

        labelC.setText("c:");

        labelCociente.setText("Cociente:");

        labelResto.setText("Resto:");

        buttonDividir.setText("Dividir");

        javax.swing.GroupLayout panelDivisionLayout = new javax.swing.GroupLayout(panelDivision);
        panelDivision.setLayout(panelDivisionLayout);
        panelDivisionLayout.setHorizontalGroup(
            panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDivisionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addComponent(labelMetodo)
                            .addGap(18, 18, 18)
                            .addComponent(comboMetodo, 0, 1, Short.MAX_VALUE))
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addComponent(labelA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(labelB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCociente)
                                .addComponent(labelResto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textResto)
                                .addComponent(textCociente))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDivisionLayout.createSequentialGroup()
                        .addComponent(buttonDividir)
                        .addGap(85, 85, 85)))
                .addGap(96, 96, 96))
        );
        panelDivisionLayout.setVerticalGroup(
            panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDivisionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA)
                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB)
                    .addComponent(textB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelC)
                    .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCociente)
                    .addComponent(textCociente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelResto)
                    .addComponent(textResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDividir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        labelEpsilon.setText("Epsilon");

        labelValorInicial.setText("Valor Inicial");

        buttonCalcular.setText("Calcular");

        labelResultado.setText("Resultado:");

        javax.swing.GroupLayout panelRaizAproxLayout = new javax.swing.GroupLayout(panelRaizAprox);
        panelRaizAprox.setLayout(panelRaizAproxLayout);
        panelRaizAproxLayout.setHorizontalGroup(
            panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaizAproxLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addComponent(labelResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textResultado))
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEpsilon)
                            .addComponent(textEpsilon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelValorInicial))
                        .addGap(18, 18, 18)
                        .addComponent(buttonCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRaizAproxLayout.setVerticalGroup(
            panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaizAproxLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEpsilon)
                    .addComponent(labelValorInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEpsilon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResultado)
                    .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        labelEpsilonBairstow.setText("Epsilon:");

        labelR.setText("r:");

        labelS.setText("s:");

        labelMaxIter.setText("Máx. Iter:");

        labelReales.setText("Reales: ");

        labelImaginarias.setText("Imaginarias");

        buttonRaicesBairstow.setText("Det. Raices");

        javax.swing.GroupLayout panelRaicesBairstowLayout = new javax.swing.GroupLayout(panelRaicesBairstow);
        panelRaicesBairstow.setLayout(panelRaicesBairstowLayout);
        panelRaicesBairstowLayout.setHorizontalGroup(
            panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                .addComponent(labelImaginarias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textImag))
                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEpsilonBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEpsilonBairstow)
                                    .addComponent(labelReales))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textReales, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(labelR)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(labelS))
                                            .addComponent(textS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(labelMaxIter))
                                            .addComponent(textMaxIter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(buttonRaicesBairstow)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRaicesBairstowLayout.setVerticalGroup(
            panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addComponent(labelMaxIter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMaxIter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addComponent(labelS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEpsilonBairstow)
                            .addComponent(labelR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEpsilonBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelReales)
                    .addComponent(textReales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImaginarias)
                    .addComponent(textImag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRaicesBairstow)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        labelMetodoCotas.setText("Método:");

        comboMetodoCotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Newton", "Laguerre", "Lagrange" }));

        labelValorInicialCotas.setText("Val. Inicial:");

        checkRefinar.setText("Refinar");

        labelCotaInfNeg.setText("Inf. Negativa:");

        labelCotaSupNeg.setText("Sup. Negativa:");

        labelCotaInfPos.setText("Inf. Positiva:");

        labelCotaSupPos.setText("Sup. Positiva:");

        buttonCotas.setText("Cotas");

        javax.swing.GroupLayout panelCotasLayout = new javax.swing.GroupLayout(panelCotas);
        panelCotas.setLayout(panelCotasLayout);
        panelCotasLayout.setHorizontalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCotasLayout.createSequentialGroup()
                                    .addComponent(labelCotaInfNeg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(labelCotaSupNeg))
                                .addGroup(panelCotasLayout.createSequentialGroup()
                                    .addComponent(labelMetodoCotas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboMetodoCotas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelValorInicialCotas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textValorInicialCotas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkRefinar)))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaInfPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCotaSupPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))))
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(buttonCotas)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelCotasLayout.setVerticalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetodoCotas)
                    .addComponent(comboMetodoCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorInicialCotas)
                    .addComponent(textValorInicialCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRefinar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCotaInfNeg)
                    .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCotaSupNeg)
                    .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCotaInfPos)
                    .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCotaSupPos)
                    .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCotas)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        labelEnteras.setText("Enteras:");

        labelRacionales.setText("Racionales:");

        buttonRaices.setText("Det. Raices");

        javax.swing.GroupLayout panelRaicesLayout = new javax.swing.GroupLayout(panelRaices);
        panelRaices.setLayout(panelRaicesLayout);
        panelRaicesLayout.setHorizontalGroup(
            panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaicesLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRaicesLayout.createSequentialGroup()
                        .addComponent(labelEnteras)
                        .addGap(30, 30, 30)
                        .addComponent(textEnteras, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRaicesLayout.createSequentialGroup()
                        .addComponent(labelRacionales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRaices)
                            .addComponent(textRacionales))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRaicesLayout.setVerticalGroup(
            panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaicesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnteras)
                    .addComponent(textEnteras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRacionales)
                    .addComponent(textRacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRaices)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCalculadoraLayout = new javax.swing.GroupLayout(panelCalculadora);
        panelCalculadora.setLayout(panelCalculadoraLayout);
        panelCalculadoraLayout.setHorizontalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculadoraLayout.createSequentialGroup()
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRaicesBairstow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRaices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPolinomio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRaizAprox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCalculadoraLayout.setVerticalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addComponent(panelPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaizAprox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaicesBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        scrollPaneCalculadora.setViewportView(panelCalculadora);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(scrollPaneCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                                                              

  //Botones
    public javax.swing.JButton getButtonAgregar() { return buttonAgregarTerminos; }
    public javax.swing.JButton getButtonQuitar() { return buttonQuitarTerminos; }
    public javax.swing.JButton getButtonDivir() { return buttonDividir; }
    public javax.swing.JButton getButtonCalcularNewton() { return buttonCalcular; }
    public javax.swing.JButton getButtonDetRaices() { return buttonRaices; }
    public javax.swing.JButton getButtonCotas() { return buttonCotas; }
    public javax.swing.JButton getButtonRaicesBairstow() { return buttonRaicesBairstow; }
    public javax.swing.JButton getButtonGraficar() { return buttonGraficar; }
    

    //Paneles
    public javax.swing.JPanel getPanelPrincipal() { return panelPrincipal; }
    public javax.swing.JPanel getPanelPolinomio() { return panelPolinomio; }
    public javax.swing.JPanel getPanelTerminos(){ return this.panelTerminos; }
    public javax.swing.JPanel getPanelDivision(){ return this.panelDivision; }
    public javax.swing.JPanel getPanelNewton(){ return this.panelRaizAprox; }
    public javax.swing.JPanel getPanelRaices(){ return this.panelRaices; }
    public javax.swing.JPanel getPanelCotas(){ return this.panelCotas; }
    public javax.swing.JPanel getPanelRaicesBairstow(){ return this.panelRaicesBairstow; }
    public javax.swing.JPanel getPanelCalculadora(){ return this.panelCalculadora; }
    public javax.swing.JPanel getPanelGraficar(){ return this.panelGraficar; }
    public javax.swing.JPanel getPanelGrafico(){ return this.panelGrafico; }
    
    //TextField
    public javax.swing.JTextField getTextA(){ return textA; }
    public javax.swing.JTextField getTextB(){ return textB; }
    public javax.swing.JTextField getTextC(){ return textC; }
    public javax.swing.JTextField getTextCociente(){ return textCociente; }
    public javax.swing.JTextField getTextEnteras(){ return textEnteras; }
    public javax.swing.JTextField getTextEpsilon(){ return textEpsilon; }
    public javax.swing.JTextField getTextRacionales(){ return textRacionales; }
    public javax.swing.JTextField getTextReales(){ return textReales; }
    public javax.swing.JTextField getTextResto(){ return textResto; }
    public javax.swing.JTextField getTextValorInicial(){ return textValorInicial; }
    public javax.swing.JTextField getTextResultado(){ return textResultado; }
    public javax.swing.JTextField getTextCotaInfNeg(){ return textCotaInfNeg; }
    public javax.swing.JTextField getTextCotaSupNeg(){ return textCotaSupNeg; }
    public javax.swing.JTextField getTextCotaInfPos(){ return textCotaInfPos; }
    public javax.swing.JTextField getTextCotaSupPos(){ return textCotaSupPos; }
    public javax.swing.JTextField getTextValorInicialCotas(){ return textValorInicialCotas; }
    public javax.swing.JTextField getTextEpsilonBairstow(){ return textEpsilonBairstow; }
    public javax.swing.JTextField getTextR(){ return textR; }
    public javax.swing.JTextField getTextS(){ return textS; }
    public javax.swing.JTextField getTextMaxIter(){ return textMaxIter; }
    public javax.swing.JTextField getTextImaginarias(){ return textImag; }
    
    
    //ComboBox
    public javax.swing.JComboBox<String> getComboMetodo() { return comboMetodo; }
    public javax.swing.JComboBox<String> getComboMetodoCotas() { return comboMetodoCotas; }
    
    //CheckBox
    public javax.swing.JCheckBox getCheckRefinar(){ return checkRefinar; }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAgregarTerminos;
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonCotas;
    private javax.swing.JButton buttonDividir;
    private javax.swing.JButton buttonGraficar;
    private javax.swing.JButton buttonQuitarTerminos;
    private javax.swing.JButton buttonRaices;
    private javax.swing.JButton buttonRaicesBairstow;
    private javax.swing.JCheckBox checkRefinar;
    private javax.swing.JComboBox<String> comboMetodoCotas;
    private javax.swing.JComboBox<String> comboMetodo;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelCociente;
    private javax.swing.JLabel labelCotaInfNeg;
    private javax.swing.JLabel labelCotaInfPos;
    private javax.swing.JLabel labelCotaSupNeg;
    private javax.swing.JLabel labelCotaSupPos;
    private javax.swing.JLabel labelEnteras;
    private javax.swing.JLabel labelEpsilon;
    private javax.swing.JLabel labelEpsilonBairstow;
    private javax.swing.JLabel labelImaginarias;
    private javax.swing.JLabel labelMaxIter;
    private javax.swing.JLabel labelMetodo;
    private javax.swing.JLabel labelMetodoCotas;
    private javax.swing.JLabel labelPolinomios;
    private javax.swing.JLabel labelR;
    private javax.swing.JLabel labelRacionales;
    private javax.swing.JLabel labelReales;
    private javax.swing.JLabel labelResto;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelS;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorInicial;
    private javax.swing.JLabel labelValorInicialCotas;
    private javax.swing.JPanel panelRaizAprox;
    private javax.swing.JPanel panelCalculadora;
    private javax.swing.JPanel panelCotas;
    private javax.swing.JPanel panelDivision;
    private javax.swing.JPanel panelGraficar;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelPolinomio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRaices;
    private javax.swing.JPanel panelRaicesBairstow;
    private javax.swing.JPanel panelTerminos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JScrollPane scrollPaneCalculadora;
    private javax.swing.JTextField textA;
    private javax.swing.JTextField textB;
    private javax.swing.JTextField textC;
    private javax.swing.JTextField textCociente;
    private javax.swing.JTextField textCotaInfNeg;
    private javax.swing.JTextField textCotaInfPos;
    private javax.swing.JTextField textCotaSupNeg;
    private javax.swing.JTextField textCotaSupPos;
    private javax.swing.JTextField textEnteras;
    private javax.swing.JTextField textEpsilon;
    private javax.swing.JTextField textEpsilonBairstow;
    private javax.swing.JTextField textImag;
    private javax.swing.JTextField textMaxIter;
    private javax.swing.JTextField textR;
    private javax.swing.JTextField textRacionales;
    private javax.swing.JTextField textReales;
    private javax.swing.JTextField textResto;
    private javax.swing.JTextField textResultado;
    private javax.swing.JTextField textS;
    private javax.swing.JTextField textValorInicial;
    private javax.swing.JTextField textValorInicialCotas;
    // End of variables declaration                   
}
