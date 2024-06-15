package oralsys.view;

import java.util.List;
import javax.swing.JOptionPane;
import oralsys.controller.CidadeController;
import org.json.JSONObject;
import oralsys.controller.CidadeController;
import org.json.JSONObject;
import org.json.JSONObject;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oralsys.controller.PacienteController;
import oralsys.entidades.Cidade;

/**
 *
 * @author kelvy
 */
public class PacienteCadastro extends javax.swing.JFrame {
    
   // private ListagemPaciente listagemPaciente;
    private int id;
    private String modo;

    public PacienteCadastro() {
        initComponents();
    }

    /*public PacienteCadastro(ListagemPaciente listagemPaciente) {
        this.listagemPaciente = listagemPaciente;
       initComponents();
    }*/

    public void setNome(String nome) {
        tNome.setText(nome);
    }

    public void setCPF(String cpf) {
        tCPF.setText(cpf);
    }

    public void setTelefone(String telefone) {
        tTelefone.setText(telefone);
    }

    public void setResponsavel(String responsavel) {
        tResponsavel.setText(responsavel);
    }

    public void setDataNascimento(String dataNascimento) {
        dDataNascimento.setDate(java.sql.Date.valueOf(dataNascimento));
    }

    public void setEndereco(String endereco) {
        tEndereco.setText(endereco);
    }

    public void setNumero(String numero) {
        tNumero.setText(numero);
    }

    public void setCidade(String cidade) {
        tCidade.setText(cidade);
    }

    public void setEstado(String estado) {
        tEstado.setText(estado);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lNumero = new javax.swing.JLabel();
        tCPF = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        lEndereco = new javax.swing.JLabel();
        tNumero = new javax.swing.JTextField();
        lCPF = new javax.swing.JLabel();
        tResponsavel = new javax.swing.JTextField();
        lResponsavel = new javax.swing.JLabel();
        lDataNascimento = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        dDataNascimento = new com.toedter.calendar.JDateChooser();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lEstado = new javax.swing.JLabel();
        tEstado = new javax.swing.JTextField();
        lTelefone = new javax.swing.JLabel();
        tTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Paciente");

        lNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lNome.setText("Nome");

        tNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lNumero.setText("Numero");

        tCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lCidade.setText("Cidade");

        tCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lEndereco.setText("Endereço");

        tNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lCPF.setText("CPF");

        tResponsavel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lResponsavel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lResponsavel.setText("Responsavel");

        lDataNascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lDataNascimento.setText("Data de nascimento");

        tEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        dDataNascimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");

        lEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lEstado.setText("Estado");

        tEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lTelefone.setText("Telefone");

        tTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEstado)
                                .addGap(63, 63, 63)
                                .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lResponsavel)
                                    .addComponent(lDataNascimento)
                                    .addComponent(lEndereco)
                                    .addComponent(lNumero)
                                    .addComponent(lCidade))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lNome)
                                    .addComponent(lCPF))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTelefone)
                                .addGap(63, 63, 63)
                                .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnSalvar)
                        .addGap(58, 58, 58)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCPF)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lResponsavel)
                    .addComponent(tResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDataNascimento)
                    .addComponent(dDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lNumero)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        String retorno = salvar();
        String mensagem = "Paciente Cadastrado com Sucesso!";
        if (this.modo.equals("alterar")) {
            mensagem = "Paciente Alterado com Sucesso!";
        }
        if (retorno.equals("Sucesso!")) {
            JOptionPane.showMessageDialog(rootPane, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            //listagemPaciente.montarTabela("");
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, retorno, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PacienteCadastro().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser dDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lDataNascimento;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lResponsavel;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JTextField tCPF;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tEstado;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tResponsavel;
    private javax.swing.JTextField tTelefone;
    // End of variables declaration//GEN-END:variables

    
    
        public String salvar() {
        String nome = tNome.getText();
        String cpf = tCPF.getText();
        String telefone = tTelefone.getText();
        String responsavel = tResponsavel.getText();
        String dataNascimento = ((javax.swing.JTextField) dDataNascimento.getDateEditor().getUiComponent()).getText();
        String endereco = tEndereco.getText();
        String numero = tNumero.getText();
        String cidade = tCidade.getText();
        String estado = tEstado.getText();

        JSONObject json = new JSONObject();
        json.put("nome", nome);
        json.put("cpf", cpf);
        json.put("telefone", telefone);
        json.put("responsavel", responsavel);
        json.put("dataNascimento", dataNascimento);
        json.put("endereco", endereco);
        json.put("numero", numero);
        json.put("cidade", cidade);
        json.put("estado", estado);
        json.put("id", this.id);

        PacienteController pacienteController = new PacienteController();
        String retorno = "";
        /*if (this.modo.equals("cadastro")) {
            retorno = pacienteController.cadastrarPaciente(json);
        } else {
            retorno = pacienteController.alterarPaciente(json);
        }*/
        return retorno;
    }


}
    






