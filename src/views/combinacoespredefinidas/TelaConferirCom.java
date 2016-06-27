
package views.combinacoespredefinidas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class TelaConferirCom extends javax.swing.JFrame {

    private int quantidade = 0;
    private ArrayList<Integer> numerosSelecionados = new ArrayList<Integer>();
    public TelaConferirCom() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField01 = new javax.swing.JTextField();
        jTextField02 = new javax.swing.JTextField();
        jTextField03 = new javax.swing.JTextField();
        jTextField04 = new javax.swing.JTextField();
        jTextField05 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField09 = new javax.swing.JTextField();
        jTextField08 = new javax.swing.JTextField();
        jTextField07 = new javax.swing.JTextField();
        jTextField06 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantNum = new javax.swing.JTextField();
        jLabelAdvertencia = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField01.setEditable(false);
        jTextField01.setText("01");
        jTextField01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField01MouseClicked(evt);
            }
        });
        jTextField01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField01ActionPerformed(evt);
            }
        });

        jTextField02.setEditable(false);
        jTextField02.setText("02");
        jTextField02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField02MouseClicked(evt);
            }
        });
        jTextField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField02ActionPerformed(evt);
            }
        });

        jTextField03.setEditable(false);
        jTextField03.setText("03");
        jTextField03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField03MouseClicked(evt);
            }
        });
        jTextField03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField03ActionPerformed(evt);
            }
        });

        jTextField04.setEditable(false);
        jTextField04.setText("04");
        jTextField04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField04MouseClicked(evt);
            }
        });

        jTextField05.setEditable(false);
        jTextField05.setText("05");
        jTextField05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField05MouseClicked(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setText("10");
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jTextField09.setEditable(false);
        jTextField09.setText("09");
        jTextField09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField09MouseClicked(evt);
            }
        });

        jTextField08.setEditable(false);
        jTextField08.setText("08");
        jTextField08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField08MouseClicked(evt);
            }
        });

        jTextField07.setEditable(false);
        jTextField07.setText("07");
        jTextField07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField07MouseClicked(evt);
            }
        });

        jTextField06.setEditable(false);
        jTextField06.setText("06");
        jTextField06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField06MouseClicked(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setText("11");
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setText("12");
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField16.setEditable(false);
        jTextField16.setText("16");
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jTextField17.setEditable(false);
        jTextField17.setText("17");
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setText("18");
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField18MouseClicked(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setText("13");
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setText("14");
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField19.setEditable(false);
        jTextField19.setText("19");
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField19MouseClicked(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setText("20");
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.setText("15");
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jTextField25.setEditable(false);
        jTextField25.setText("25");
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setText("24");
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });

        jTextField23.setEditable(false);
        jTextField23.setText("23");
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField23MouseEntered(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setText("22");
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setText("21");
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Resultado Final:");

        jButton1.setText("Conferir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Quantidade:");

        jTextFieldQuantNum.setEditable(false);
        jTextFieldQuantNum.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextFieldQuantNum.setText("0");
        jTextFieldQuantNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantNumActionPerformed(evt);
            }
        });

        jLabelAdvertencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField21)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldQuantNum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAdvertencia)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField01MouseClicked
        boolean clicou;
        if (jTextField01.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField01.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
               JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField01.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField01MouseClicked

    private void jTextField01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField01ActionPerformed

    }//GEN-LAST:event_jTextField01ActionPerformed

    private void jTextField02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField02MouseClicked
        boolean clicou;
        if (jTextField02.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField02.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField02.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField02MouseClicked

    private void jTextField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField02ActionPerformed

    }//GEN-LAST:event_jTextField02ActionPerformed

    private void jTextField03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField03MouseClicked
        boolean clicou;
        if (jTextField03.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField03.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField03.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField03MouseClicked

    private void jTextField03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField03ActionPerformed

    }//GEN-LAST:event_jTextField03ActionPerformed

    private void jTextField04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField04MouseClicked
        boolean clicou;
        if (jTextField04.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField04.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField04.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField04MouseClicked

    private void jTextField05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField05MouseClicked
        boolean clicou;
        if (jTextField05.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField05.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField05.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField05MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        boolean clicou;
        if (jTextField10.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField10.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField10.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField09MouseClicked
        boolean clicou;
        if (jTextField09.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField09.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField09.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField09MouseClicked

    private void jTextField08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField08MouseClicked
        boolean clicou;
        if (jTextField08.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField08.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField08.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField08MouseClicked

    private void jTextField07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField07MouseClicked
        boolean clicou;
        if (jTextField07.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField07.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField07.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField07MouseClicked

    private void jTextField06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField06MouseClicked
        boolean clicou;
        if (jTextField06.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField06.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField06.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField06MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        boolean clicou;
        if (jTextField11.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField11.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField11.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        boolean clicou;
        if (jTextField12.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField12.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField12.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        boolean clicou;
        if (jTextField16.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField16.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField16.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        boolean clicou;
        if (jTextField17.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField17.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField17.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseClicked
        boolean clicou;
        if (jTextField18.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField18.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField18.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField18MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        boolean clicou;
        if (jTextField13.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField13.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField13.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        boolean clicou;
        if (jTextField14.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField14.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField14.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseClicked
        boolean clicou;
        if (jTextField19.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField19.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField19.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField19MouseClicked

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
        boolean clicou;
        if (jTextField20.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField20.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField20.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
        boolean clicou;
        if (jTextField15.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField15.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField15.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
        boolean clicou;
        if (jTextField25.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField25.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField25.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
        boolean clicou;
        if (jTextField24.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField24.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField24.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        boolean clicou;
        if (jTextField23.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField23.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField23.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jTextField23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23MouseEntered

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        boolean clicou;
        if (jTextField22.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField22.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField22.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
        boolean clicou;
        if (jTextField21.getBackground() == Color.green) {
            clicou = false;
        } else {
            clicou = true;
        }

        if (clicou) {

            if (quantidade < 15) {
                jTextField21.setBackground(Color.green);
                quantidade++;
                String quant = "" + quantidade;
                jTextFieldQuantNum.setText(quant);
            } else {
                JOptionPane.showMessageDialog(null, "São Permitidos apenas 15 números!");
            }
        } else {
            jTextField21.setBackground(Color.white);
            quantidade--;
            String quant = "" + quantidade;
            jTextFieldQuantNum.setText(quant);
        }
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextFieldQuantNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantNumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(quantidade == 15){

            if (jTextField01.getBackground() == Color.green){
                numerosSelecionados.add(1);
            }
            if (jTextField02.getBackground() == Color.green){
                numerosSelecionados.add(2);
            }
            if (jTextField03.getBackground() == Color.green){
               numerosSelecionados.add(3);
            }
            if (jTextField04.getBackground() == Color.green){
                numerosSelecionados.add(4);
            }
            if (jTextField05.getBackground() == Color.green){
                numerosSelecionados.add(5);
            }
            if (jTextField06.getBackground() == Color.green){
                numerosSelecionados.add(6);
            }
            if (jTextField07.getBackground() == Color.green){
                numerosSelecionados.add(7);
            }
            if (jTextField08.getBackground() == Color.green){
                numerosSelecionados.add(8);
            }
            if (jTextField09.getBackground() == Color.green){
                numerosSelecionados.add(9);
            }
            if (jTextField10.getBackground() == Color.green){
                numerosSelecionados.add(10);
            }
            if (jTextField11.getBackground() == Color.green){
                numerosSelecionados.add(11);
            }
            if (jTextField12.getBackground() == Color.green){
                numerosSelecionados.add(12);
            }
            if (jTextField13.getBackground() == Color.green){
                numerosSelecionados.add(13);
            }
            if (jTextField14.getBackground() == Color.green){
                numerosSelecionados.add(14);
            }
            if (jTextField15.getBackground() == Color.green){
                numerosSelecionados.add(15);
            }
            if (jTextField16.getBackground() == Color.green){
                numerosSelecionados.add(16);
            }
            if (jTextField17.getBackground() == Color.green){
                numerosSelecionados.add(17);
            }
            if (jTextField18.getBackground() == Color.green){
                numerosSelecionados.add(18);
            }
            if (jTextField19.getBackground() == Color.green){
                numerosSelecionados.add(19);
            }
            if (jTextField20.getBackground() == Color.green){
                numerosSelecionados.add(20);
            }
            if (jTextField21.getBackground() == Color.green){
                numerosSelecionados.add(21);
            }
            if (jTextField22.getBackground() == Color.green){
                numerosSelecionados.add(22);
            }
            if (jTextField23.getBackground() == Color.green){
                numerosSelecionados.add(23);
            }
            if (jTextField24.getBackground() == Color.green){
                numerosSelecionados.add(24);
            }
            if (jTextField25.getBackground() == Color.green){
                numerosSelecionados.add(25);
            }

 

        }else{
            if((15-quantidade) == 1){
                JOptionPane.showMessageDialog(null, "Você deve escolher mais " + (15 - quantidade) + " número!");
            }else{
                JOptionPane.showMessageDialog(null, "Você deve escolher mais " + (15 - quantidade) + " números!");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaConferirCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConferirCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConferirCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConferirCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConferirCom().setVisible(true);
            }
        });
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField03;
    private javax.swing.JTextField jTextField04;
    private javax.swing.JTextField jTextField05;
    private javax.swing.JTextField jTextField06;
    private javax.swing.JTextField jTextField07;
    private javax.swing.JTextField jTextField08;
    private javax.swing.JTextField jTextField09;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextFieldQuantNum;
    // End of variables declaration//GEN-END:variables
}
