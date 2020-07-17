package utility;


import java.sql.*;
import java.io.*;
import java.util.Properties;


public class ConnectionManager
{
	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException
	{
		Properties prop;
		prop=loadPropertiesFile();
		final String url=prop.getProperty("url");
		final String driver=prop.getProperty("driver");
		Class.forName(driver);
		Connection ob=null;
		ob=DriverManager.getConnection(url);
		if(ob!=null)
			System.out.println("OHOOOOOOO");
		return ob;
	}
	public Properties loadPropertiesFile() throws IOException
	{
		Properties pro=new Properties();
		InputStream in=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		pro.load(in);
		in.close();
		return pro;
	}
}
