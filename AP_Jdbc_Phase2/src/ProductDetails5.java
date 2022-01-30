
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

public class ProductDetails5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ProductDetails5() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           stmt.executeUpdate("insert into eproduct (name, price) values ('New Product', 17800.00)");
           out.println("Executed an insert operation<br>");
           
           stmt.executeUpdate("update eproduct set price=2000 where name = 'New Product'");
           out.println("Executed an update operation<br>");
           
           //** stmt.executeUpdate("delete from eproduct where name = 'New Product'");
//           out.println("Executed a delete operation<br>");
           
           stmt.close();
           
           conn.closeConnection();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
