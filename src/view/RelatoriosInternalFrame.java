/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author caiomoreno
 */
public class RelatoriosInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MovimentacoesInternalFrame
     */
    public RelatoriosInternalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGerarRelatoriodeVendas = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        PanelGerarRelatoriodeVendas1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FFildeDataInicio = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        FFildeDataInicio1 = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaVendas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BotaoDesconto = new javax.swing.JButton();
        BotaoValorTotal = new javax.swing.JButton();
        BotaoNomeDoCliente = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 602));

        PanelGerarRelatoriodeVendas.setBackground(new java.awt.Color(204, 204, 204));

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMovimentacoes.setText("Gerar relatório de vendas");
        LabelMovimentacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelGerarRelatoriodeVendasLayout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas);
        PanelGerarRelatoriodeVendas.setLayout(PanelGerarRelatoriodeVendasLayout);
        PanelGerarRelatoriodeVendasLayout.setHorizontalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes)
                .addGap(250, 250, 250))
        );
        PanelGerarRelatoriodeVendasLayout.setVerticalGroup(
            PanelGerarRelatoriodeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelMovimentacoes)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelGerarRelatoriodeVendas1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Data Inicial: ");

        jLabel2.setText("Data Final: ");

        try {
            FFildeDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FFildeDataInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FFildeDataInicio.setToolTipText("");
        FFildeDataInicio.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        FFildeDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFildeDataInicioActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");

        try {
            FFildeDataInicio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FFildeDataInicio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FFildeDataInicio1.setToolTipText("");
        FFildeDataInicio1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        FFildeDataInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFildeDataInicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGerarRelatoriodeVendas1Layout = new javax.swing.GroupLayout(PanelGerarRelatoriodeVendas1);
        PanelGerarRelatoriodeVendas1.setLayout(PanelGerarRelatoriodeVendas1Layout);
        PanelGerarRelatoriodeVendas1Layout.setHorizontalGroup(
            PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(FFildeDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(FFildeDataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addGap(43, 43, 43))
        );
        PanelGerarRelatoriodeVendas1Layout.setVerticalGroup(
            PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGerarRelatoriodeVendas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FFildeDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnPesquisar)
                .addComponent(FFildeDataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        TabelaVendas.setAutoCreateRowSorter(true);
        TabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001", "752,00", "50,00", "0001", "Cliente da Silva"}
            },
            new String [] {
                "Cod_Venda", "Valor", "Desconto", "Cod_Cliente", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(TabelaVendas);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        BotaoDesconto.setBackground(new java.awt.Color(153, 204, 255));
        BotaoDesconto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoDesconto.setForeground(new java.awt.Color(51, 51, 255));
        BotaoDesconto.setText("Valor Total: 752,00");

        BotaoValorTotal.setBackground(new java.awt.Color(153, 204, 255));
        BotaoValorTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoValorTotal.setForeground(new java.awt.Color(51, 51, 255));
        BotaoValorTotal.setText("Com descontos: 702,00");
        BotaoValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoValorTotalActionPerformed(evt);
            }
        });

        BotaoNomeDoCliente.setBackground(new java.awt.Color(153, 204, 255));
        BotaoNomeDoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoNomeDoCliente.setForeground(new java.awt.Color(51, 51, 255));
        BotaoNomeDoCliente.setText("Quantidade de Vendas: 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BotaoNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(BotaoDesconto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelGerarRelatoriodeVendas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelGerarRelatoriodeVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGerarRelatoriodeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGerarRelatoriodeVendas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 800, 602);
    }// </editor-fold>//GEN-END:initComponents

    private void FFildeDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFildeDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FFildeDataInicioActionPerformed

    private void BotaoValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoValorTotalActionPerformed

    private void FFildeDataInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFildeDataInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FFildeDataInicio1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDesconto;
    private javax.swing.JButton BotaoNomeDoCliente;
    private javax.swing.JButton BotaoValorTotal;
    private javax.swing.JFormattedTextField FFildeDataInicio;
    private javax.swing.JFormattedTextField FFildeDataInicio1;
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas;
    private javax.swing.JPanel PanelGerarRelatoriodeVendas1;
    private javax.swing.JTable TabelaVendas;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
