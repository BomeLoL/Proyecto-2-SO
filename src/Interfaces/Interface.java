/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.AI;
import Classes.Admin;
import Classes.Global;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JComponent;



/**
 *
 * @author kevin
 */
public class Interface extends javax.swing.JFrame {

    boolean iniciado=false;
    AI ai;
    Admin admin;
    /**
     * Creates new form Interface
     */
    public Interface() {
        
        initComponents();
        this.ai = new AI();
         JComponent editor = SPINNERTIEMPO.getEditor();
       
    if (editor instanceof JSpinner.DefaultEditor) {
    ((JSpinner.DefaultEditor) editor).getTextField().setEditable(false);}
      
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }

    public AI getAi() {
        return ai;
    }

    public void setAi(AI ai) {
        this.ai = ai;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public static JLabel getCountST() {
        return CountST;
    }

    public static void setCountST(JLabel CountST) {
        Interface.CountST = CountST;
    }

    public static JLabel getCountSW() {
        return CountSW;
    }

    public static void setCountSW(JLabel CountSW) {
        Interface.CountSW = CountSW;
    }

    public static JLabel getIASTATUS() {
        return IASTATUS;
    }

    public static void setIASTATUS(JLabel IASTATUS) {
        Interface.IASTATUS = IASTATUS;
    }

    public static JSpinner getSPINNERTIEMPO() {
        return SPINNERTIEMPO;
    }

    public static void setSPINNERTIEMPO(JSpinner SPINNERTIEMPO) {
        Interface.SPINNERTIEMPO = SPINNERTIEMPO;
    }

    public JLabel getST() {
        return ST;
    }

    public void setST(JLabel ST) {
        this.ST = ST;
    }

    public static JTextArea getSTP1() {
        return STP1;
    }

    public static void setSTP1(JTextArea STP1) {
        Interface.STP1 = STP1;
    }

    public static JTextArea getSTP2() {
        return STP2;
    }

    public static void setSTP2(JTextArea STP2) {
        Interface.STP2 = STP2;
    }

    public static JTextArea getSTP3() {
        return STP3;
    }

    public static void setSTP3(JTextArea STP3) {
        Interface.STP3 = STP3;
    }

    public static JTextArea getSTR() {
        return STR;
    }

    public static void setSTR(JTextArea STR) {
        Interface.STR = STR;
    }

    public JLabel getSW() {
        return SW;
    }

    public void setSW(JLabel SW) {
        this.SW = SW;
    }

    public JLabel getSW10() {
        return SW10;
    }

    public void setSW10(JLabel SW10) {
        this.SW10 = SW10;
    }

    public JLabel getSW2() {
        return SW2;
    }

    public void setSW2(JLabel SW2) {
        this.SW2 = SW2;
    }

    public JLabel getSW3() {
        return SW3;
    }

    public void setSW3(JLabel SW3) {
        this.SW3 = SW3;
    }

    public JLabel getSW4() {
        return SW4;
    }

    public void setSW4(JLabel SW4) {
        this.SW4 = SW4;
    }

    public JLabel getSW5() {
        return SW5;
    }

    public void setSW5(JLabel SW5) {
        this.SW5 = SW5;
    }

    public JLabel getSW6() {
        return SW6;
    }

    public void setSW6(JLabel SW6) {
        this.SW6 = SW6;
    }

    public JLabel getSW7() {
        return SW7;
    }

    public void setSW7(JLabel SW7) {
        this.SW7 = SW7;
    }

    public JLabel getSW8() {
        return SW8;
    }

    public void setSW8(JLabel SW8) {
        this.SW8 = SW8;
    }

    public JLabel getSW9() {
        return SW9;
    }

    public void setSW9(JLabel SW9) {
        this.SW9 = SW9;
    }

    public static JTextArea getSWP1() {
        return SWP1;
    }

    public static void setSWP1(JTextArea SWP1) {
        Interface.SWP1 = SWP1;
    }

    public static JTextArea getSWP2() {
        return SWP2;
    }

    public static void setSWP2(JTextArea SWP2) {
        Interface.SWP2 = SWP2;
    }

    public static JTextArea getSWP3() {
        return SWP3;
    }

    public static void setSWP3(JTextArea SWP3) {
        Interface.SWP3 = SWP3;
    }

    public static JTextArea getSWR() {
        return SWR;
    }

    public static void setSWR(JTextArea SWR) {
        Interface.SWR = SWR;
    }

    public JLabel getTiempo() {
        return Tiempo;
    }

    public void setTiempo(JLabel Tiempo) {
        this.Tiempo = Tiempo;
    }

    public static JTextArea getWINNERS() {
        return WINNERS;
    }

    public static void setWINNERS(JTextArea WINNERS) {
        Interface.WINNERS = WINNERS;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public static JLabel getFotoPersonajeStartrek() {
        return fotoPersonajeStartrek;
    }

    public static void setFotoPersonajeStartrek(JLabel fotoPersonajeStartrek) {
        Interface.fotoPersonajeStartrek = fotoPersonajeStartrek;
    }

    public static JLabel getFotoPersonajeStarwars() {
        return fotoPersonajeStarwars;
    }

    public static void setFotoPersonajeStarwars(JLabel fotoPersonajeStarwars) {
        Interface.fotoPersonajeStarwars = fotoPersonajeStarwars;
    }

    public static JButton getjButton1() {
        return jButton1;
    }

    public static void setjButton1(JButton jButton1) {
        Interface.jButton1 = jButton1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane10() {
        return jScrollPane10;
    }

    public void setjScrollPane10(JScrollPane jScrollPane10) {
        this.jScrollPane10 = jScrollPane10;
    }

    public JScrollPane getjScrollPane11() {
        return jScrollPane11;
    }

    public void setjScrollPane11(JScrollPane jScrollPane11) {
        this.jScrollPane11 = jScrollPane11;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    public void setjScrollPane8(JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    public JScrollPane getjScrollPane9() {
        return jScrollPane9;
    }

    public void setjScrollPane9(JScrollPane jScrollPane9) {
        this.jScrollPane9 = jScrollPane9;
    }

    public static JTextArea getStatsST() {
        return statsST;
    }

    public static void setStatsST(JTextArea statsST) {
        Interface.statsST = statsST;
    }

    public static JTextArea getStatsSW() {
        return statsSW;
    }

    public static void setStatsSW(JTextArea statsSW) {
        Interface.statsSW = statsSW;
    }

    
    
        

    




 

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CountSW = new javax.swing.JLabel();
        CountST = new javax.swing.JLabel();
        SW = new javax.swing.JLabel();
        ST = new javax.swing.JLabel();
        IASTATUS = new javax.swing.JLabel();
        SW2 = new javax.swing.JLabel();
        SW3 = new javax.swing.JLabel();
        SW4 = new javax.swing.JLabel();
        SW5 = new javax.swing.JLabel();
        SW6 = new javax.swing.JLabel();
        SW7 = new javax.swing.JLabel();
        SW8 = new javax.swing.JLabel();
        SW9 = new javax.swing.JLabel();
        SW10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        WINNERS = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        STR = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        STP1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        STP2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        SWR = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        SWP1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        SWP2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        SWP3 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        STP3 = new javax.swing.JTextArea();
        fotoPersonajeStartrek = new javax.swing.JLabel();
        fotoPersonajeStarwars = new javax.swing.JLabel();
        SPINNERTIEMPO = new javax.swing.JSpinner();
        Tiempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statsSW = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        statsST = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CountSW.setBackground(new java.awt.Color(255, 255, 255));
        CountSW.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        CountSW.setForeground(new java.awt.Color(255, 255, 51));
        CountSW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CountSW.setText("0");
        jPanel1.add(CountSW, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 60));

        CountST.setBackground(new java.awt.Color(255, 255, 255));
        CountST.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        CountST.setForeground(new java.awt.Color(255, 0, 51));
        CountST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CountST.setText("0");
        jPanel1.add(CountST, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 80, 60));

        SW.setBackground(new java.awt.Color(255, 255, 255));
        SW.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        SW.setForeground(new java.awt.Color(255, 255, 51));
        SW.setText("Star Wars");
        jPanel1.add(SW, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, 60));

        ST.setBackground(new java.awt.Color(255, 255, 255));
        ST.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        ST.setForeground(new java.awt.Color(255, 0, 51));
        ST.setText("Star Trek");
        jPanel1.add(ST, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 110, 60));

        IASTATUS.setBackground(new java.awt.Color(255, 255, 255));
        IASTATUS.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        IASTATUS.setForeground(new java.awt.Color(255, 255, 255));
        IASTATUS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IASTATUS.setText("IA Descansando zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz zzz");
        IASTATUS.setToolTipText("");
        IASTATUS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                IASTATUSPropertyChange(evt);
            }
        });
        jPanel1.add(IASTATUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 670, 60));

        SW2.setBackground(new java.awt.Color(255, 255, 255));
        SW2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW2.setForeground(new java.awt.Color(255, 0, 51));
        SW2.setText("Refuerzo");
        jPanel1.add(SW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 190, 60));

        SW3.setBackground(new java.awt.Color(255, 255, 255));
        SW3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW3.setForeground(new java.awt.Color(255, 255, 51));
        SW3.setText("Prioridad 2");
        jPanel1.add(SW3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 60));

        SW4.setBackground(new java.awt.Color(255, 255, 255));
        SW4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW4.setForeground(new java.awt.Color(255, 255, 51));
        SW4.setText("Prioridad 3");
        jPanel1.add(SW4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 190, 60));

        SW5.setBackground(new java.awt.Color(255, 255, 255));
        SW5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW5.setForeground(new java.awt.Color(255, 255, 51));
        SW5.setText("Prioridad 1");
        jPanel1.add(SW5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 60));

        SW6.setBackground(new java.awt.Color(255, 255, 255));
        SW6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW6.setForeground(new java.awt.Color(255, 0, 51));
        SW6.setText("Prioridad 1");
        jPanel1.add(SW6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 190, 60));

        SW7.setBackground(new java.awt.Color(255, 255, 255));
        SW7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW7.setForeground(new java.awt.Color(255, 0, 51));
        SW7.setText("Prioridad 2");
        jPanel1.add(SW7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 190, 60));

        SW8.setBackground(new java.awt.Color(255, 255, 255));
        SW8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW8.setForeground(new java.awt.Color(255, 0, 51));
        SW8.setText("Prioridad 3");
        jPanel1.add(SW8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 190, 60));

        SW9.setBackground(new java.awt.Color(255, 255, 255));
        SW9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        SW9.setForeground(new java.awt.Color(255, 255, 51));
        SW9.setText("Refuerzo");
        jPanel1.add(SW9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 190, 60));

        SW10.setBackground(new java.awt.Color(255, 255, 255));
        SW10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        SW10.setForeground(new java.awt.Color(255, 255, 255));
        SW10.setText("Ganadores");
        jPanel1.add(SW10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 100, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jButton1.setText("INICIO");
        jButton1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton1MouseWheelMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 100, 50));

        WINNERS.setEditable(false);
        WINNERS.setColumns(20);
        WINNERS.setRows(5);
        jScrollPane5.setViewportView(WINNERS);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 320, 90));

        STR.setEditable(false);
        STR.setColumns(20);
        STR.setRows(5);
        jScrollPane3.setViewportView(STR);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 160, 70));

        STP1.setEditable(false);
        STP1.setColumns(20);
        STP1.setRows(5);
        jScrollPane2.setViewportView(STP1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 160, 70));

        STP2.setEditable(false);
        STP2.setColumns(20);
        STP2.setRows(5);
        jScrollPane4.setViewportView(STP2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 160, 70));

        SWR.setEditable(false);
        SWR.setColumns(20);
        SWR.setRows(5);
        jScrollPane6.setViewportView(SWR);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 70));

        SWP1.setEditable(false);
        SWP1.setColumns(20);
        SWP1.setRows(5);
        jScrollPane7.setViewportView(SWP1);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 70));

        SWP2.setEditable(false);
        SWP2.setColumns(20);
        SWP2.setRows(5);
        jScrollPane8.setViewportView(SWP2);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 70));

        SWP3.setEditable(false);
        SWP3.setColumns(20);
        SWP3.setRows(5);
        jScrollPane9.setViewportView(SWP3);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 70));

        STP3.setEditable(false);
        STP3.setColumns(20);
        STP3.setRows(5);
        jScrollPane10.setViewportView(STP3);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 160, 70));

        fotoPersonajeStartrek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cartainiciost.png"))); // NOI18N
        jPanel1.add(fotoPersonajeStartrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 190, 240));

        fotoPersonajeStarwars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cartainicio.png"))); // NOI18N
        jPanel1.add(fotoPersonajeStarwars, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, 240));

        SPINNERTIEMPO.setToolTipText("10");
        SPINNERTIEMPO.setValue(10);
        SPINNERTIEMPO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPINNERTIEMPOStateChanged(evt);
            }
        });
        jPanel1.add(SPINNERTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 90, 40));

        Tiempo.setBackground(new java.awt.Color(255, 255, 255));
        Tiempo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(255, 255, 255));
        Tiempo.setText("Tiempo AI (s)");
        jPanel1.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 80, 60));

        statsSW.setEditable(false);
        statsSW.setColumns(20);
        statsSW.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statsSW.setRows(5);
        statsSW.setText("Star Wars Stats");
        statsSW.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                statsSWPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(statsSW);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 210, 120));

        statsST.setEditable(false);
        statsST.setColumns(20);
        statsST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statsST.setRows(5);
        statsST.setText("Star Trek Stats");
        statsST.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                statsSTPropertyChange(evt);
            }
        });
        jScrollPane11.setViewportView(statsST);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 210, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Diseño sin título (3).png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 590));

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

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (this.iniciado!=true){
        Global.st.listainicial();
        Global.sw.listainicial();
        this.ai = new AI();
        this.admin = new Admin(ai);
        this.ai.start();
        this.admin.start();    }//GEN-LAST:event_jButton1ActionPerformed
        this.iniciado=true;

        }
    private void IASTATUSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_IASTATUSPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_IASTATUSPropertyChange

    private void statsSWPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_statsSWPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_statsSWPropertyChange

    private void statsSTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_statsSTPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_statsSTPropertyChange

    private void SPINNERTIEMPOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPINNERTIEMPOStateChanged
        if(iniciado == true){
            if((int)this.SPINNERTIEMPO.getValue() <= 0){
                this.SPINNERTIEMPO.setValue(1);
                this.repaint();
            }
            admin.getAi().setSpeed((int)this.SPINNERTIEMPO.getValue());
            this.SPINNERTIEMPO.setValue(admin.getAi().getSpeed());
            this.repaint();
        }else{
            this.SPINNERTIEMPO.setValue(10);
            this.repaint();
        }
    }//GEN-LAST:event_SPINNERTIEMPOStateChanged

    private void jButton1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton1MouseWheelMoved

    }//GEN-LAST:event_jButton1MouseWheelMoved

    
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel CountST;
    private static javax.swing.JLabel CountSW;
    private static javax.swing.JLabel IASTATUS;
    private static javax.swing.JSpinner SPINNERTIEMPO;
    private javax.swing.JLabel ST;
    private static javax.swing.JTextArea STP1;
    private static javax.swing.JTextArea STP2;
    private static javax.swing.JTextArea STP3;
    private static javax.swing.JTextArea STR;
    private javax.swing.JLabel SW;
    private javax.swing.JLabel SW10;
    private javax.swing.JLabel SW2;
    private javax.swing.JLabel SW3;
    private javax.swing.JLabel SW4;
    private javax.swing.JLabel SW5;
    private javax.swing.JLabel SW6;
    private javax.swing.JLabel SW7;
    private javax.swing.JLabel SW8;
    private javax.swing.JLabel SW9;
    private static javax.swing.JTextArea SWP1;
    private static javax.swing.JTextArea SWP2;
    private static javax.swing.JTextArea SWP3;
    private static javax.swing.JTextArea SWR;
    private javax.swing.JLabel Tiempo;
    private static javax.swing.JTextArea WINNERS;
    private javax.swing.JLabel fondo;
    private static javax.swing.JLabel fotoPersonajeStartrek;
    private static javax.swing.JLabel fotoPersonajeStarwars;
    private static javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JTextArea statsST;
    private static javax.swing.JTextArea statsSW;
    // End of variables declaration//GEN-END:variables
}












































































































































































































































































/* */
