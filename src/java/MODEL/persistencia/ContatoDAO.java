package MODEL.persistencia;
import MODEL.persistencia.Conexao;
import java.sql.SQLException; 
import java.sql.Connection; 
import java.sql.Statement; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.util.ArrayList; 
import aplicacao.Contato; //Modelo que representa um registro do BD
public class ContatoDAO {
    private Connection conexao;
    public ContatoDAO() {
        try {
            // Executa a conexão com o banco de dados
            conexao = Conexao.criaConexao();
        }
        catch( Exception e ) {
            System.out.println("Erro criação de conexao DAO");
            System.out.println(e);
        }
    }
    public ArrayList<Contato> getLista() {
        //Cria o objeto resultado que irá armazenar os registros retornados do BD
        ArrayList<Contato> resultado = new ArrayList<>();
        try {            
            // Cria o objeto para quer será utilizado para enviar comandos SQL
            // para o BD
            Statement stmt = conexao.createStatement();
            // Armazena o resultado do comando enviado para o banco de dados
            ResultSet rs = stmt.executeQuery("select * from contato");
            // rs.next() Aponta para o próximo registro do BD, se houver um 
            while( rs.next() ) {
                //Cria o objeto da classe Contato para armazenar os dados
                //que vieram do BD
                Contato contato = new Contato();
                
                //Pega o conteúdo da coluna "codigo" do ResultSet (rs)
                contato.setId(rs.getInt("id") );
                //Pega o conteúdo da coluna "nome" do ResultSet (rs)
                contato.setNome( rs.getString("nome") );
                //Pega o conteúdo da coluna "setor" do ResultSet (rs)
                contato.setIdade(rs.getInt("idade") );
                //Adiciona o objeto criado na ArrayList resultado
                resultado.add(contato);
            }
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        
        // Retorna a lista de Contatos encontrados no banco de dados.
        return resultado;
    }
    
    public Contato getContatoPorID( int codigo ) {
        Contato Contato = new Contato();
        try {
            String sql = "SELECT * FROM contato WHERE id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            if ( rs.next() ) {
                Contato.setId(rs.getInt("id"));
                Contato.setNome( rs.getString("nome") );
                Contato.setIdade(rs.getInt("idade") );
            }
            
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return Contato;
    }
    
    public boolean gravar( Contato Contato ) {
        try {
            String sql;
            if ( Contato.getId() == 0 ) {
                // Realizar uma inclusão
                sql = "INSERT INTO contato (nome, idade) VALUES (?,?)";
            } else {
                // Realizar uma alteração
                sql = "UPDATE contato SET nome=?, idade=? WHERE id=?";
            }
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, Contato.getNome());
            ps.setInt(2, Contato.getIdade());
            
            if ( Contato.getId()> 0 )
                ps.setInt(3, Contato.getId());
            
            ps.execute();
            
            return true;
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
    
    public boolean excluir( int id ) {
        try {
            String sql = "DELETE FROM contato WHERE id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return false;
        }
    }
}
