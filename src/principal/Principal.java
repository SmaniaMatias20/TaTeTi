package principal;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/tateti.png")));
        setIconImage(new ImageIcon(getClass().getResource("/images/tateti.png")).getImage());

    }

    private void contadorDePuntos() {

        if (turno.getText().equalsIgnoreCase("GANADOR O")) {
            int banderaO = Integer.parseInt(contadorO.getText());
            banderaO = banderaO + 1;
            contadorO.setText(Integer.toString(banderaO));

        }
        if (turno.getText().equalsIgnoreCase("GANADOR X")) {
            int banderaX = Integer.parseInt(contadorX.getText());
            banderaX = banderaX + 1;
            contadorX.setText(Integer.toString(banderaX));
        }

    }

    private void limpiarCasillas() {
        uno.setText("");
        dos.setText("");
        tres.setText("");
        cuatro.setText("");
        cinco.setText("");
        seis.setText("");
        siete.setText("");
        ocho.setText("");
        nueve.setText("");
        uno.setBackground(Color.WHITE);
        dos.setBackground(Color.WHITE);
        tres.setBackground(Color.WHITE);
        cuatro.setBackground(Color.WHITE);
        cinco.setBackground(Color.WHITE);
        seis.setBackground(Color.WHITE);
        siete.setBackground(Color.WHITE);
        ocho.setBackground(Color.WHITE);
        nueve.setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        primerCasilla3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        nueve = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        turno = new javax.swing.JLabel();
        jugadorO = new javax.swing.JLabel();
        jugadorX = new javax.swing.JLabel();
        contadorO = new javax.swing.JLabel();
        contadorX = new javax.swing.JLabel();
        botonMarcador = new javax.swing.JButton();

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel1");
        jLabel5.setOpaque(true);

        primerCasilla3.setBackground(new java.awt.Color(255, 255, 255));
        primerCasilla3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        primerCasilla3.setForeground(new java.awt.Color(0, 0, 0));
        primerCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        primerCasilla3.setText("X");
        primerCasilla3.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TA-TE-TI");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        uno.setBackground(new java.awt.Color(255, 255, 255));
        uno.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        uno.setForeground(new java.awt.Color(0, 0, 0));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uno.setText("X");
        uno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uno.setOpaque(true);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(255, 255, 255));
        dos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        dos.setForeground(new java.awt.Color(0, 0, 0));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dos.setText("X");
        dos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dos.setOpaque(true);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(255, 255, 255));
        cinco.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        cinco.setForeground(new java.awt.Color(0, 0, 0));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinco.setText("X");
        cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cinco.setOpaque(true);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(255, 255, 255));
        nueve.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        nueve.setForeground(new java.awt.Color(0, 0, 0));
        nueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueve.setText("X");
        nueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nueve.setOpaque(true);
        nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nueveMousePressed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(255, 255, 255));
        tres.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        tres.setForeground(new java.awt.Color(0, 0, 0));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres.setText("X");
        tres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tres.setOpaque(true);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(255, 255, 255));
        seis.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        seis.setForeground(new java.awt.Color(0, 0, 0));
        seis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seis.setText("X");
        seis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seis.setOpaque(true);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(255, 255, 255));
        cuatro.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        cuatro.setForeground(new java.awt.Color(0, 0, 0));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuatro.setText("X");
        cuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuatro.setOpaque(true);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(255, 255, 255));
        siete.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        siete.setForeground(new java.awt.Color(0, 0, 0));
        siete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siete.setText("X");
        siete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        siete.setOpaque(true);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(255, 255, 255));
        ocho.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ocho.setForeground(new java.awt.Color(0, 0, 0));
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocho.setText("X");
        ocho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ocho.setOpaque(true);
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ochoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        boton.setBackground(new java.awt.Color(255, 255, 255));
        boton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boton.setForeground(new java.awt.Color(0, 0, 0));
        boton.setText("INICIAR");
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMousePressed(evt);
            }
        });
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        turno.setBackground(new java.awt.Color(0, 51, 51));
        turno.setForeground(new java.awt.Color(255, 255, 255));
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setText("TURNO  X");
        turno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        turno.setOpaque(true);

        jugadorO.setBackground(new java.awt.Color(0, 51, 51));
        jugadorO.setForeground(new java.awt.Color(255, 255, 255));
        jugadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugadorO.setText("JUGADOR O");
        jugadorO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jugadorO.setOpaque(true);

        jugadorX.setBackground(new java.awt.Color(0, 51, 51));
        jugadorX.setForeground(new java.awt.Color(255, 255, 255));
        jugadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugadorX.setText("JUGADOR X");
        jugadorX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jugadorX.setOpaque(true);

        contadorO.setBackground(new java.awt.Color(0, 51, 51));
        contadorO.setForeground(new java.awt.Color(255, 255, 255));
        contadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contadorO.setOpaque(true);

        contadorX.setBackground(new java.awt.Color(0, 51, 51));
        contadorX.setForeground(new java.awt.Color(255, 255, 255));
        contadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contadorX.setOpaque(true);

        botonMarcador.setBackground(new java.awt.Color(0, 51, 51));
        botonMarcador.setForeground(new java.awt.Color(255, 255, 255));
        botonMarcador.setText("REINICIAR");
        botonMarcador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMarcador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMarcadorMousePressed(evt);
            }
        });
        botonMarcador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMarcadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMousePressed
        //CUANDO PRESIONAMOS EL BOTON...
        if (contadorO.getText().isEmpty() && contadorX.getText().isEmpty()) {
            contadorO.setText("0");
            contadorX.setText("0");
        }
        
        //SI GANADOR ES X COMIENZA X. DE LO CONTRARIO COMIENZA O
        if(turno.getText().equalsIgnoreCase("GANADOR X")){
        turno.setText("TURNO X");
        } else {
        turno.setText("TURNO O");
        }
        
        boton.setText("REINICIAR");

        //LIMPIAMOS TODAS LAS CASILLAS
        limpiarCasillas();


    }//GEN-LAST:event_botonMousePressed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

    }//GEN-LAST:event_botonActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        if (uno.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                uno.setText("X");
                turno.setText("TURNO O");
            } else {
                uno.setText("O");
                turno.setText("TURNO X");

            }
            if (uno.getText().equalsIgnoreCase(cuatro.getText()) && uno.getText().equalsIgnoreCase(siete.getText())) {
                uno.setBackground(jPanel1.getBackground());
                cuatro.setBackground(jPanel1.getBackground());
                siete.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + uno.getText());
                contadorDePuntos();
            }

            if (uno.getText().equalsIgnoreCase(cinco.getText()) && uno.getText().equalsIgnoreCase(nueve.getText())) {
                uno.setBackground(jPanel1.getBackground());
                cinco.setBackground(jPanel1.getBackground());
                nueve.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + uno.getText());
                contadorDePuntos();
            }

            if (uno.getText().equalsIgnoreCase(dos.getText()) && uno.getText().equalsIgnoreCase(tres.getText())) {
                uno.setBackground(jPanel1.getBackground());
                dos.setBackground(jPanel1.getBackground());
                tres.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + uno.getText());
                contadorDePuntos();
            }

        }
    }//GEN-LAST:event_unoMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        if (dos.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                dos.setText("X");
                turno.setText("TURNO O");
            } else {
                dos.setText("O");
                turno.setText("TURNO X");
            }
            if (dos.getText().equalsIgnoreCase(uno.getText()) && dos.getText().equalsIgnoreCase(tres.getText())) {
                uno.setBackground(jPanel1.getBackground());
                dos.setBackground(jPanel1.getBackground());
                tres.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + dos.getText());
                contadorDePuntos();
            }

            if (dos.getText().equalsIgnoreCase(cinco.getText()) && dos.getText().equalsIgnoreCase(ocho.getText())) {
                dos.setBackground(jPanel1.getBackground());
                cinco.setBackground(jPanel1.getBackground());
                ocho.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + dos.getText());
                contadorDePuntos();
            }
        }


    }//GEN-LAST:event_dosMousePressed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        if (tres.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                tres.setText("X");
                turno.setText("TURNO O");
            } else {
                tres.setText("O");
                turno.setText("TURNO X");
            }
            if (tres.getText().equalsIgnoreCase(seis.getText()) && tres.getText().equalsIgnoreCase(nueve.getText())) {
                tres.setBackground(jPanel1.getBackground());
                seis.setBackground(jPanel1.getBackground());
                nueve.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + tres.getText());
                contadorDePuntos();
            }

            if (tres.getText().equalsIgnoreCase(cinco.getText()) && tres.getText().equalsIgnoreCase(siete.getText())) {
                tres.setBackground(jPanel1.getBackground());
                cinco.setBackground(jPanel1.getBackground());
                siete.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + tres.getText());
                contadorDePuntos();
            }

            if (tres.getText().equalsIgnoreCase(dos.getText()) && tres.getText().equalsIgnoreCase(uno.getText())) {
                uno.setBackground(jPanel1.getBackground());
                dos.setBackground(jPanel1.getBackground());
                tres.setBackground(jPanel1.getBackground());
                turno.setText("GANADOR " + tres.getText());
                contadorDePuntos();
            }
        }


    }//GEN-LAST:event_tresMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        if (cuatro.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                cuatro.setText("X");
                turno.setText("TURNO O");
            } else {
                cuatro.setText("O");
                turno.setText("TURNO X");
            }
        }
        if (cuatro.getText().equalsIgnoreCase(cinco.getText()) && cuatro.getText().equalsIgnoreCase(seis.getText())) {
            cuatro.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            seis.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + cuatro.getText());
            contadorDePuntos();
        }

        if (cuatro.getText().equalsIgnoreCase(uno.getText()) && cuatro.getText().equalsIgnoreCase(siete.getText())) {
            uno.setBackground(jPanel1.getBackground());
            cuatro.setBackground(jPanel1.getBackground());
            siete.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + cuatro.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_cuatroMousePressed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        if (cinco.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                cinco.setText("X");
                turno.setText("TURNO O");
            } else {
                cinco.setText("O");
                turno.setText("TURNO X");
            }
        }
        if (cinco.getText().equalsIgnoreCase(dos.getText()) && cinco.getText().equalsIgnoreCase(ocho.getText())) {
            cinco.setBackground(jPanel1.getBackground());
            dos.setBackground(jPanel1.getBackground());
            ocho.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + cinco.getText());
            contadorDePuntos();
        }

        if (cinco.getText().equalsIgnoreCase(cuatro.getText()) && cinco.getText().equalsIgnoreCase(seis.getText())) {
            cuatro.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            seis.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + cinco.getText());
            contadorDePuntos();
        }

        if (cinco.getText().equalsIgnoreCase(uno.getText()) && cinco.getText().equalsIgnoreCase(nueve.getText())) {
            uno.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + cinco.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_cincoMousePressed

    private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
        if (seis.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                seis.setText("X");
                turno.setText("TURNO O");
            } else {
                seis.setText("O");
                turno.setText("TURNO X");
            }
        }
        if (seis.getText().equalsIgnoreCase(tres.getText()) && seis.getText().equalsIgnoreCase(nueve.getText())) {
            seis.setBackground(jPanel1.getBackground());
            tres.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + seis.getText());
            contadorDePuntos();
        }

        if (seis.getText().equalsIgnoreCase(cinco.getText()) && seis.getText().equalsIgnoreCase(cuatro.getText())) {
            seis.setBackground(jPanel1.getBackground());
            cuatro.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + seis.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_seisMousePressed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        if (siete.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                siete.setText("X");
                turno.setText("TURNO O");
            } else {
                siete.setText("O");
                turno.setText("TURNO X");
            }
        }

        if (siete.getText().equalsIgnoreCase(cuatro.getText()) && siete.getText().equalsIgnoreCase(uno.getText())) {
            siete.setBackground(jPanel1.getBackground());
            cuatro.setBackground(jPanel1.getBackground());
            uno.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + siete.getText());
            contadorDePuntos();
        }

        if (siete.getText().equalsIgnoreCase(cinco.getText()) && siete.getText().equalsIgnoreCase(tres.getText())) {
            siete.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            tres.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + siete.getText());
            contadorDePuntos();
        }

        if (siete.getText().equalsIgnoreCase(ocho.getText()) && siete.getText().equalsIgnoreCase(nueve.getText())) {
            siete.setBackground(jPanel1.getBackground());
            ocho.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + siete.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_sieteMousePressed

    private void ochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMousePressed
        if (ocho.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                ocho.setText("X");
                turno.setText("TURNO O");
            } else {
                ocho.setText("O");
                turno.setText("TURNO X");
            }
        }
        if (ocho.getText().equalsIgnoreCase(siete.getText()) && ocho.getText().equalsIgnoreCase(nueve.getText())) {
            ocho.setBackground(jPanel1.getBackground());
            siete.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + ocho.getText());
            contadorDePuntos();
        }

        if (ocho.getText().equalsIgnoreCase(cinco.getText()) && ocho.getText().equalsIgnoreCase(dos.getText())) {
            ocho.setBackground(jPanel1.getBackground());
            dos.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + ocho.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_ochoMousePressed

    private void nueveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nueveMousePressed
        if (nueve.getText().isEmpty() && !turno.getText().contains("GANADOR")) {
            if (turno.getText().equalsIgnoreCase("TURNO X")) {
                nueve.setText("X");
                turno.setText("TURNO O");
            } else {
                nueve.setText("O");
                turno.setText("TURNO X");
            }
        }

        if (nueve.getText().equalsIgnoreCase(cinco.getText()) && nueve.getText().equalsIgnoreCase(uno.getText())) {
            nueve.setBackground(jPanel1.getBackground());
            cinco.setBackground(jPanel1.getBackground());
            uno.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + nueve.getText());
            contadorDePuntos();

        }

        if (nueve.getText().equalsIgnoreCase(ocho.getText()) && nueve.getText().equalsIgnoreCase(siete.getText())) {
            siete.setBackground(jPanel1.getBackground());
            ocho.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + nueve.getText());
            contadorDePuntos();
        }

        if (nueve.getText().equalsIgnoreCase(seis.getText()) && nueve.getText().equalsIgnoreCase(tres.getText())) {
            tres.setBackground(jPanel1.getBackground());
            seis.setBackground(jPanel1.getBackground());
            nueve.setBackground(jPanel1.getBackground());
            turno.setText("GANADOR " + nueve.getText());
            contadorDePuntos();
        }
    }//GEN-LAST:event_nueveMousePressed

    private void botonMarcadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMarcadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMarcadorActionPerformed

    private void botonMarcadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMarcadorMousePressed
        contadorO.setText("0");
        contadorX.setText("0");
    }//GEN-LAST:event_botonMarcadorMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton botonMarcador;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel contadorO;
    private javax.swing.JLabel contadorX;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jugadorO;
    private javax.swing.JLabel jugadorX;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel primerCasilla3;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
