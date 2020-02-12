package MODEL.dao;
import MODEL.classes.Matricula;
import MODEL.utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Breno
 */
public class MatriculaDAO {
    
    
    //inserir novo usuário na tabela 'usuario'
    public void create (Matricula mat){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        
        try {
            stm=con.prepareStatement("INSERT INTO matriculas(data_matricula, nota) VALUES (?,?)");
            stm.setString(1, mat.getDataMatriculaString());
            stm.setFloat(2, mat.getNota());
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Matricula.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
    //edita um usuario
    public void editar (Matricula mat, String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm= null;
        
        try {
            stm=con.prepareStatement("UPDATE matriculas\n" +
                                    "SET data_matricula = ?,  nota = ?, \n" +
                                    "where id = ?;");
            stm.setString(1, mat.getDataMatriculaString());
            stm.setFloat(2, mat.getNota());
            stm.setString(3, id);
            stm.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(Matricula.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Conexao.closeConnection(con, stm);
        }
    }
     
    //recuperar Usuario informando o 'id' do mesmo
    public Matricula getById (String id){
        Connection con = Conexao.getConnection();
        PreparedStatement stm; 
        ResultSet resultado = null;
        Matricula mat = new Matricula();
        
        try{
            stm = con.prepareStatement("select * from matriculas where id = ?");
            stm.setString(1, id);
            resultado = stm.executeQuery();
            while(resultado.next()){
               mat.setId(resultado.getInt("id"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Driver nao pode ser carregado:"+ex);
        } finally{
            Conexao.closeConnection(con, null, resultado);
        }
        return mat;
    }
    
}