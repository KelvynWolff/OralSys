
package oralsys.view.listagem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oralsys.controller.ConsultaController;
import oralsys.view.ConsultaCadastro;
import oralsys.view.relatorios.RelatorioConsultas;
import org.json.JSONArray;
import org.json.JSONObject;

public class ListagemConsulta extends javax.swing.JFrame {

    public ListagemConsulta() {
        initComponents();
        montarTabela("", false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        inputPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Paciente", "Status", "Dentista", "Observacao"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
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

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object id = model.getValueAt(selectedRow, 0);

            int response = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir?", "Confirmar Ação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                ConsultaController consultaController = new ConsultaController();
                consultaController.excluirConsulta((int) id);
                montarTabela("", false);
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ConsultaCadastro consultaCadastro = new ConsultaCadastro(this);
        consultaCadastro.setModo("cadastro");
        consultaCadastro.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object id = model.getValueAt(selectedRow, 0);
            ConsultaController consultaController = new ConsultaController();
            
            String condicao = "id='" + id + "'";
            JSONArray registros = consultaController.listarConsulta(condicao, false);

            if (registros != null && registros.length() > 0) {
                JSONObject registro = registros.getJSONObject(0);
                String cpfPaciente = registro.optString("pacienteCpf");
                String status = registro.optString("status");
                String dentistaId = registro.optString("dentistaId");
                String observacao = registro.optString("observacao");
                String tipoPagamento = registro.optString("tipoPagamento");
                
                int dentista = 0, tipoPagamentoId = 0;
                try {
                    dentista = Integer.parseInt(dentistaId);
                    tipoPagamentoId = Integer.parseInt(tipoPagamento);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao converter dados: " + e.getMessage());
                    return;
                }
                
                System.out.println(dentista);
                System.out.println(tipoPagamentoId);

                ConsultaCadastro consultaCadastro = new ConsultaCadastro(this);
                consultaCadastro.inicio(dentista, tipoPagamentoId);
                consultaCadastro.setObservacoes(observacao);
                consultaCadastro.setPaciente(cpfPaciente);
                consultaCadastro.setModo("alterar");
                consultaCadastro.setId((int) id);
                consultaCadastro.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Não foram encontrados registros para o ID selecionado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String filtro = inputPesquisar.getText().toLowerCase();
        if (filtro.equals("")) {
            montarTabela("", false);
        } else { 
            String condicao = " LEFT JOIN paciente ON consulta.paciente_id = paciente.id WHERE LOWER(paciente.nome) LIKE '%" + filtro + "%'";
            montarTabela(condicao, true);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        new RelatorioConsultas().setVisible(true);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    public void montarTabela(String condicao, boolean join) {
        ConsultaController consultaController = new ConsultaController();
        JSONArray registros = consultaController.listarConsulta(condicao, join);
        
        javax.swing.table.TableModel modelo = table.getModel();

        DefaultTableModel defaultModel = (DefaultTableModel) modelo;
        defaultModel.setRowCount(0);

        if (registros != null && registros.length() > 0) {
            for (int i = 0; i < registros.length(); i++) {
                JSONObject registro = registros.getJSONObject(i);
                int id = registro.getInt("id");
                String nome = registro.getString("paciente");
                String status = registro.getString("status");
                String dentista = registro.getString("dentista");
                String observacao = registro.getString("observacao");
                defaultModel.addRow(new Object[]{id, nome, status, dentista, observacao});
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField inputPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
