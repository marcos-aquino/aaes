/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.sql.*;
import model.Contato;

/**
 *
 * @author ice
 */
public class ContatoDAO {
    private static ContatoDAO instance = new ContatoDAO();
    public static ContatoDAO getInstance(){
        return instance;
    }
    private ContatoDAO(){}
    
    public void save (Contato contato) throws 
            SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into contato (nome, email)" +
                        " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
        } catch (SQLException e){
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public void closeResources(Connection conn, Statement st){
        try {
            if (st != null) st.close();
            if (conn != null) conn.close();
        }catch(SQLException e) {
            
        }
    }
}
