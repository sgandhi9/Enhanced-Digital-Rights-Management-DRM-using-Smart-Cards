package javaapplication1;
import java.io.Console;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class SelectTest {
    
			public static String u_email;	
		        public static String pwd=NewJApplet.password1;
	public static void select() {
		        
			try {

				//1. register the driver
				
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				System.out.println("Driver registered...");
				
				//2. acquire the connection
				
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "beproj12345");
				System.out.println("Connected to the database : "+conn);
								
				//3. make a desired statement
				
				//Statement st = 	conn.createStatement();
                               // System.out.println("hiiii");
				PreparedStatement pst =  conn.prepareStatement("select u_id,u_name,u_email from jay.firm where u_id= ? ");
                                //String stmt="select u_id,u_name from jay.firm where u_id="+123+";";
				//4. fire the query and acquire the result if any
                               // System.out.println(" "+NewJApplet.u_id);
                              // System.out.println(NewJApplet.u_id);
            
                                pst.setString(1,NewJApplet.u_id);
                                //pst.setString(1," "+Readfile.filedata);
                                //System.out.println(stmt);
                                
				ResultSet rs = 	pst.executeQuery();
                                	
				//5. process the result set
				
					Console con =  System.console();
					                    //
                                                          
						while(rs.next())
						{
                                                        // String u_no=NewJApplet.u_id;
                                                    
                                                    String u_id =rs.getString(1);
                                                    
						         String u_name = rs.getString(2);
                                                        
                                                         String u_email1=rs.getString(3);
                                                         u_email=u_email1;
                                                       
							
                                                        
							/*int man_id = rs.getInt(3);
							int loc_id= rs.getInt(4);*/
							System.out.println(u_id+"\t"+u_name+"\t"+u_email+""/*+man_id+"\t"+loc_id*/);
							//con.printf("%5d|%20s|%5d|%5d|", deptno,dname,man_id,loc_id);
							System.out.println("\n---------------------------------------");
						}
						
				// 6 close the resources
					rs.close();
					pst.close();
					conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
                                
                                JOptionPane.showMessageDialog(null,"INVALID USER");
				e.printStackTrace();
			}
	}
}
