/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package raicesDePolinomios;

public class PoliCalcView extends javax.swing.JFrame {

    public PoliCalcView() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelPrincipal = new javax.swing.JPanel();
        panelDivision = new javax.swing.JPanel();
        labelA = new javax.swing.JLabel();
        textA = new javax.swing.JTextField();
        comboMetodo = new javax.swing.JComboBox<>();
        labelMetodo = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        textC = new javax.swing.JTextField();
        labelCociente = new javax.swing.JLabel();
        textCociente = new javax.swing.JTextField();
        labelResto = new javax.swing.JLabel();
        textResto = new javax.swing.JTextField();
        buttonDividir = new javax.swing.JButton();
        textB = new javax.swing.JTextField();
        panelRaizAprox = new javax.swing.JPanel();
        labelEpsilon = new javax.swing.JLabel();
        textEpsilon = new javax.swing.JTextField();
        textValorInicial = new javax.swing.JTextField();
        textResultado = new javax.swing.JTextField();
        labelValorInicial = new javax.swing.JLabel();
        buttonCalcular = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        panelRaices = new javax.swing.JPanel();
        labelReales = new javax.swing.JLabel();
        textReales = new javax.swing.JTextField();
        textRacionales = new javax.swing.JTextField();
        labelRacionales = new javax.swing.JLabel();
        labelEnteras = new javax.swing.JLabel();
        buttonRaices = new javax.swing.JButton();
        textEnteras = new javax.swing.JTextField();
        panelPolinomio = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelPolinomio = new javax.swing.JLabel();
        panelTerminos = new javax.swing.JPanel();
        buttonAgregarTerminos = new javax.swing.JButton();
        buttonQuitarTerminos = new javax.swing.JButton();
        panelCotas = new javax.swing.JPanel();
        comboMetodoCotas = new javax.swing.JComboBox<>();
        labelCotaInfNeg = new javax.swing.JLabel();
        labelCotaInfPos = new javax.swing.JLabel();
        textCotaInfNeg = new javax.swing.JTextField();
        textCotaInfPos = new javax.swing.JTextField();
        labelCotaSupNeg = new javax.swing.JLabel();
        textCotaSupPos = new javax.swing.JTextField();
        textCotaSupNeg = new javax.swing.JTextField();
        labelCotaSupPos = new javax.swing.JLabel();
        buttonCotas = new javax.swing.JButton();
        labelMetodoCotas = new javax.swing.JLabel();
        labelValorInicialCotas = new javax.swing.JLabel();
        textValorInicialCotas = new javax.swing.JTextField();
        checkRefinar = new javax.swing.JCheckBox();
        panelRaicesBairstow = new javax.swing.JPanel();
        labelEpsilonBairstow = new javax.swing.JLabel();
        textEpsilonBairstow = new javax.swing.JTextField();
        labelR = new javax.swing.JLabel();
        textR = new javax.swing.JTextField();
        labelS = new javax.swing.JLabel();
        textS = new javax.swing.JTextField();
        labelMaxIter = new javax.swing.JLabel();
        textMaxIter = new javax.swing.JTextField();
        buttonRaicesBairstow = new javax.swing.JButton();
        labelImag = new javax.swing.JLabel();
        textImag = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelA.setText("a:");

        comboMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Horner Simple ( x+a )", "Horner Simple ( ax + b )", "horner Doble (x^2 + ax + b)", "horner Doble (ax^2 + bx + c)" }));

        labelMetodo.setText("Seleccionar:");

        labelB.setText("b:");

        labelC.setText("c:");

        labelCociente.setText("Cociente:");

        labelResto.setText("Resto:");

        buttonDividir.setText("Dividir");

        javax.swing.GroupLayout panelDivisionLayout = new javax.swing.GroupLayout(panelDivision);
        panelDivision.setLayout(panelDivisionLayout);
        panelDivisionLayout.setHorizontalGroup(
            panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDivisionLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addComponent(labelMetodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCociente)
                                .addComponent(labelResto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textCociente)
                                .addComponent(textResto)))
                        .addGroup(panelDivisionLayout.createSequentialGroup()
                            .addComponent(labelA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDivisionLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(buttonDividir)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelDivisionLayout.setVerticalGroup(
            panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDivisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetodo)
                    .addComponent(comboMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA)
                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB)
                    .addComponent(labelC)
                    .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCociente)
                    .addComponent(textCociente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDivisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResto)
                    .addComponent(textResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDividir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(82, 82, 82)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addComponent(labelResultado)
                        .addGap(18, 18, 18)
                        .addComponent(textResultado))
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEpsilon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEpsilon))
                        .addGap(18, 18, 18)
                        .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRaizAproxLayout.createSequentialGroup()
                                .addComponent(textValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buttonCalcular))
                            .addComponent(labelValorInicial))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRaizAproxLayout.setVerticalGroup(
            panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaizAproxLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addComponent(labelValorInicial)
                        .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCalcular)))
                    .addGroup(panelRaizAproxLayout.createSequentialGroup()
                        .addComponent(labelEpsilon)
                        .addComponent(textEpsilon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRaizAproxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResultado)
                    .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        labelRacionales.setText("Racionales:");

        labelEnteras.setText("Enteras:");

        buttonRaices.setText("Det. Raíces");

        javax.swing.GroupLayout panelRaicesLayout = new javax.swing.GroupLayout(panelRaices);
        panelRaices.setLayout(panelRaicesLayout);
        panelRaicesLayout.setHorizontalGroup(
            panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRaicesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRacionales)
                    .addComponent(labelEnteras))
                .addGap(18, 18, 18)
                .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textRacionales)
                    .addComponent(textEnteras, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(buttonRaices)
                .addGap(27, 27, 27))
        );
        panelRaicesLayout.setVerticalGroup(
                panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRaicesLayout.createSequentialGroup()
                    .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRaicesLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelEnteras)
                                .addComponent(textEnteras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelRaicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelRacionales)
                                .addComponent(textRacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelRaicesLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(buttonRaices)))
                    .addContainerGap(26, Short.MAX_VALUE))
            );

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setText("Calculadora de Polinomios");

        labelPolinomio.setText("Polinomio:");

        javax.swing.GroupLayout panelTerminosLayout = new javax.swing.GroupLayout(panelTerminos);
        panelTerminos.setLayout(panelTerminosLayout);
        panelTerminosLayout.setHorizontalGroup(
            panelTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTerminosLayout.setVerticalGroup(
            panelTerminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        buttonAgregarTerminos.setText("Agregar");

        buttonQuitarTerminos.setText("Quitar");

        javax.swing.GroupLayout panelPolinomioLayout = new javax.swing.GroupLayout(panelPolinomio);
        panelPolinomio.setLayout(panelPolinomioLayout);
        panelPolinomioLayout.setHorizontalGroup(
            panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPolinomioLayout.createSequentialGroup()
                        .addComponent(panelTerminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPolinomioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPolinomioLayout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPolinomioLayout.createSequentialGroup()
                                .addComponent(labelPolinomio)
                                .addGap(32, 32, 32)
                                .addComponent(buttonAgregarTerminos)
                                .addGap(18, 18, 18)
                                .addComponent(buttonQuitarTerminos)
                                .addGap(92, 92, 92))))))
        );
        panelPolinomioLayout.setVerticalGroup(
            panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPolinomioLayout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPolinomioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPolinomio)
                    .addComponent(buttonAgregarTerminos)
                    .addComponent(buttonQuitarTerminos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(panelTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
                
        labelReales.setText("Reales:");

        labelEpsilonBairstow.setText("Epsilon:");

        labelR.setText("r:");

        labelS.setText("s:");

        labelMaxIter.setText("Máx. Iter:");

        buttonRaicesBairstow.setText("Det. Raices");

        labelImag.setText("Imaginarias:");

        javax.swing.GroupLayout panelRaicesBairstowLayout = new javax.swing.GroupLayout(panelRaicesBairstow);
        panelRaicesBairstow.setLayout(panelRaicesBairstowLayout);
        panelRaicesBairstowLayout.setHorizontalGroup(
            panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(buttonRaicesBairstow))
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEpsilonBairstow)
                                    .addComponent(textEpsilonBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelR))
                                .addGap(27, 27, 27)
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelS)
                                    .addComponent(textS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMaxIter)
                                    .addComponent(textMaxIter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRaicesBairstowLayout.createSequentialGroup()
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelReales)
                                    .addComponent(labelImag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textImag, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(textReales))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelRaicesBairstowLayout.setVerticalGroup(
            panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRaicesBairstowLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEpsilonBairstow)
                            .addComponent(labelR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEpsilonBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMaxIter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRaicesBairstowLayout.createSequentialGroup()
                        .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelS)
                            .addComponent(labelMaxIter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReales)
                    .addComponent(textReales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRaicesBairstowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImag)
                    .addComponent(textImag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(buttonRaicesBairstow)
                .addContainerGap())
        );

        /*comboMetodoCotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Newton", "Laguerre", "Lagrange" }));

        labelCotaInfNeg.setText("Inf. Negativa");

        labelCotaInfPos.setText("Inf. Positiva");

        labelCotaSupNeg.setText("Sup. Negativa");

        labelCotaSupPos.setText("Sup. Positiva");

        buttonCotas.setText("Cotas");

        labelMetodoCotas.setText("Seleccionar:");
        
        labelValorInicialCotas.setText("Valor Inicial:");

        javax.swing.GroupLayout panelCotasLayout = new javax.swing.GroupLayout(panelCotas);
        panelCotas.setLayout(panelCotasLayout);
        panelCotasLayout.setHorizontalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(buttonCotas))
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelMetodoCotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboMetodoCotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaInfPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaInfNeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaSupNeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaSupPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelValorInicialCotas)
                                .addGap(18, 18, 18)
                                .addComponent(textValorInicialCotas)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCotasLayout.setVerticalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMetodoCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetodoCotas)
                    .addComponent(labelValorInicialCotas)
                    .addComponent(textValorInicialCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCotaSupNeg)
                        .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCotaInfNeg)
                            .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCotaInfPos)
                            .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCotaSupPos)
                            .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCotas)
                .addGap(12, 12, 12))
        );  */
        comboMetodoCotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Newton", "Laguerre", "Lagrange" }));

        labelCotaInfNeg.setText("Inf. Negativa");

        labelCotaInfPos.setText("Inf. Positiva");

        labelCotaSupNeg.setText("Sup. Negativa");

        labelCotaSupPos.setText("Sup. Positiva");

        buttonCotas.setText("Cotas");

        labelMetodoCotas.setText("Selec.:");

        labelValorInicialCotas.setText("Valor Inicial:");

        checkRefinar.setText("Refinar");

        javax.swing.GroupLayout panelCotasLayout = new javax.swing.GroupLayout(panelCotas);
        panelCotas.setLayout(panelCotasLayout);
        panelCotasLayout.setHorizontalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(buttonCotas))
                    .addGroup(panelCotasLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaInfPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(labelCotaSupPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelCotaInfNeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(labelCotaSupNeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCotasLayout.createSequentialGroup()
                                .addComponent(labelMetodoCotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMetodoCotas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValorInicialCotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textValorInicialCotas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkRefinar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCotasLayout.setVerticalGroup(
            panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCotasLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMetodoCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetodoCotas)
                    .addComponent(labelValorInicialCotas)
                    .addComponent(textValorInicialCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRefinar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCotaSupNeg)
                        .addComponent(textCotaSupNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCotaInfNeg)
                        .addComponent(textCotaInfNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCotaInfPos)
                        .addComponent(textCotaInfPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textCotaSupPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCotaSupPos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCotas)
                .addGap(12, 12, 12))
        );
        
        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPolinomio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(panelDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRaizAprox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRaices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRaicesBairstow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaizAprox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRaicesBairstow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        panelDivision.getAccessibleContext().setAccessibleName("");
        panelDivision.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    

    //Paneles
    public javax.swing.JPanel getPanelPrincipal() { return panelPrincipal; }
    public javax.swing.JPanel getPanelPolinomio() { return panelPolinomio; }
    public javax.swing.JPanel getPanelTerminos(){ return this.panelTerminos; }
    public javax.swing.JPanel getPanelDivision(){ return this.panelDivision; }
    public javax.swing.JPanel getPanelNewton(){ return this.panelRaizAprox; }
    public javax.swing.JPanel getPanelRaices(){ return this.panelRaices; }
    public javax.swing.JPanel getPanelCotas(){ return this.panelCotas; }
    public javax.swing.JPanel getPanelRaicesBairstow(){ return this.panelRaicesBairstow; }
    
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
    private javax.swing.JButton buttonQuitarTerminos;
    private javax.swing.JButton buttonRaices;
    private javax.swing.JButton buttonRaicesBairstow;
    private javax.swing.JCheckBox checkRefinar;
    private javax.swing.JComboBox<String> comboMetodo;
    private javax.swing.JComboBox<String> comboMetodoCotas;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField textResultado;
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
    private javax.swing.JLabel labelImag;
    private javax.swing.JLabel labelMaxIter;
    private javax.swing.JLabel labelMetodo;
    private javax.swing.JLabel labelMetodoCotas;
    private javax.swing.JLabel labelPolinomio;
    private javax.swing.JLabel labelR;
    private javax.swing.JLabel labelRacionales;
    private javax.swing.JLabel labelReales;
    private javax.swing.JLabel labelResto;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JLabel labelS;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorInicial;
    private javax.swing.JLabel labelValorInicialCotas;
    private javax.swing.JPanel panelCotas;
    private javax.swing.JPanel panelDivision;
    private javax.swing.JPanel panelPolinomio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRaices;
    private javax.swing.JPanel panelRaicesBairstow;
    private javax.swing.JPanel panelRaizAprox;
    private javax.swing.JPanel panelTerminos;
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
    private javax.swing.JTextField textS;
    private javax.swing.JTextField textValorInicial;
    private javax.swing.JTextField textValorInicialCotas;
    // End of variables declaration                   
}
