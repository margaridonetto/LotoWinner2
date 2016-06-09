
package acesso.dados;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import regras.negocio.Usuario;

public class PrepState {

    ConectaBancoDados conecta = new ConectaBancoDados();
    
    public PrepState(){}
    
    public PrepState(Usuario user){
        conecta.conexao();
    }
    
    public void salvarSorteio(String numerosSorteados){
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into sorteios.anteriores (numeros.sorteados)values(?)");
            pst.setString(1, numerosSorteados);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar:" + ex);
        }
    }
    
    public void salvar(Usuario user){
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into usuarios (nome, cpf, telefone, celular, email, usuario, senha)values(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, user.getNome());
            pst.setString(2, user.getCpf());
            pst.setString(3, user.getTelefone());
            pst.setString(4, user.getCelular());
            pst.setString(5, user.getEmail());
            pst.setString(6, user.getUser());
            pst.setString(7, user.getSenha());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar:" + ex);
        }
    }
    
}
