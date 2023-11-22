package OrganizationType.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import OrganizationType.model.OrganizationType;

public class repository {
	
	/* create Database OrganizationType;
	 * 
	 * 
	 * use OrganizationType;
	 * 
	 * create table O_Type_Table(typecode char(16),typename varchar(100));
	 * 
	 */
 
	public static void saving(OrganizationType org_class) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganizationType?useSSL=false","root","Pranil@2003");
			PreparedStatement pst = con.prepareStatement("insert into O_Type_Table(typecode,typename)values(?,?)");
			pst.setString(1, org_class.getTypecode());
			pst.setString(2, org_class.getTypeame());
			int rowCount = pst.executeUpdate();
			System.out.println(rowCount+" record inserted");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void updating(OrganizationType org_class,String oldcode, String oldname) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganizationType?useSSL=false","root","Pranil@2003");
			PreparedStatement pst = con.prepareStatement("Update O_Type_Table Set typecode=? ,typename=? where typecode=? and typename=? ");
			pst.setString(1, org_class.getTypecode());
			pst.setString(2, org_class.getTypeame());
			pst.setString(3, oldcode);
			pst.setString(4, oldname);
			int rowCount = pst.executeUpdate();
			System.out.println(rowCount+" record inserted");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
