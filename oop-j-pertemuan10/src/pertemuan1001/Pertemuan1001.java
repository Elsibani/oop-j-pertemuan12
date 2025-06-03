
package pertemuan1001;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Elsibnta  Bani 
 * TGGL: 20 MEI 2025
 */
public class Pertemuan1001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       koneksi cnn = new koneksi();
      Statement st = cnn.koneksi().createStatement();
      
      String sql ="SELECT * FROM MHS;";
      ResultSet res = st.executeQuery(sql);
      
      while (res.next() ){
          
          System.out.println("Nama:"+res.getString("NAMA"));
      }
    }
    
}
