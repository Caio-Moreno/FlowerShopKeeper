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
public class MovimentacoesInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MovimentacoesInternalFrame
     */
    public MovimentacoesInternalFrame() {
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

        PanelMovimentacoes = new javax.swing.JPanel();
        LabelMovimentacoes = new javax.swing.JLabel();
        PainelAudaPesquisa = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisaPlanta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BotaoDesconto = new javax.swing.JButton();
        BotaoValorTotal = new javax.swing.JButton();
        BotaoNomeDoCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnAdicionarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);

        PanelMovimentacoes.setBackground(new java.awt.Color(204, 204, 204));

        LabelMovimentacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMovimentacoes.setForeground(new java.awt.Color(60, 63, 65));
        LabelMovimentacoes.setText("Movimentações");

        javax.swing.GroupLayout PanelMovimentacoesLayout = new javax.swing.GroupLayout(PanelMovimentacoes);
        PanelMovimentacoes.setLayout(PanelMovimentacoesLayout);
        PanelMovimentacoesLayout.setHorizontalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovimentacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMovimentacoes)
                .addGap(313, 313, 313))
        );
        PanelMovimentacoesLayout.setVerticalGroup(
            PanelMovimentacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovimentacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PainelAudaPesquisa.setBackground(new java.awt.Color(204, 204, 204));

        btnAjuda.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajuda.png"))); // NOI18N
        btnAjuda.setText("Ajuda");

        btnPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisaPlanta.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        txtPesquisaPlanta.setText("Ex. Bromélia");
        txtPesquisaPlanta.setMinimumSize(new java.awt.Dimension(23, 24));
        txtPesquisaPlanta.setOpaque(false);
        txtPesquisaPlanta.setPreferredSize(new java.awt.Dimension(100, 24));
        txtPesquisaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPlantaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAudaPesquisaLayout = new javax.swing.GroupLayout(PainelAudaPesquisa);
        PainelAudaPesquisa.setLayout(PainelAudaPesquisaLayout);
        PainelAudaPesquisaLayout.setHorizontalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(10, 10, 10))
        );
        PainelAudaPesquisaLayout.setVerticalGroup(
            PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAudaPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelAudaPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjuda)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisaPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        BotaoDesconto.setBackground(new java.awt.Color(153, 204, 255));
        BotaoDesconto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoDesconto.setForeground(new java.awt.Color(51, 51, 255));
        BotaoDesconto.setText("Desconto R$ 50,00");

        BotaoValorTotal.setBackground(new java.awt.Color(153, 204, 255));
        BotaoValorTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoValorTotal.setForeground(new java.awt.Color(51, 51, 255));
        BotaoValorTotal.setText("Valor Total R$ 450,00");
        BotaoValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoValorTotalActionPerformed(evt);
            }
        });

        BotaoNomeDoCliente.setBackground(new java.awt.Color(153, 204, 255));
        BotaoNomeDoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotaoNomeDoCliente.setForeground(new java.awt.Color(51, 51, 255));
        BotaoNomeDoCliente.setText("Cliente da Silva Santos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BotaoNomeDoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
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

        btnAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionarCesta.png"))); // NOI18N
        btnAdicionarProduto.setText("Adicionar Item");
        btnAdicionarProduto.setBorderPainted(false);

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluirCesta.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir Item");
        btnExcluirProduto.setBorderPainted(false);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pranta", "500", "50", "1", "450"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Valor Unitario", "Desconto", "Quantidade", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdicionarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProduto)
                    .addComponent(btnExcluirProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMovimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAudaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPlantaActionPerformed
        // TODO add your handling code here:

        String a = evt.toString();
        System.out.println(a);
    }//GEN-LAST:event_txtPesquisaPlantaActionPerformed

    private void BotaoValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoValorTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDesconto;
    private javax.swing.JButton BotaoNomeDoCliente;
    private javax.swing.JButton BotaoValorTotal;
    private javax.swing.JLabel LabelMovimentacoes;
    private javax.swing.JPanel PainelAudaPesquisa;
    private javax.swing.JPanel PanelMovimentacoes;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPesquisaPlanta;
    // End of variables declaration//GEN-END:variables
}
