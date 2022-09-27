		package Jdpc;
		import java .sql.*; 

		public class InsertValuesUsingJava
		{

			public static void main(String[] args) throws Exception
			{
				String url="jdbc:mysql://localhost:3308/using_where";
				String UserName="root";
				String PassWord="Santhamsasi2000";
				String Query="insert into Students values ('viji',9760,68,43)";//Add Values
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn=DriverManager.getConnection(url,UserName,PassWord);   
				Statement st =cn.createStatement();
				int count= st.executeUpdate(Query);
				
				System.out.println(count);
				
				
				st.close();
				cn.close();
				
				
			}

		

	}


