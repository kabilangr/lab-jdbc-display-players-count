package dao;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public TreeMap<Skill,Integer> skillCount() throws SQLException, ClassNotFoundException, IOException 
	{
		TreeMap<Skill,Integer> map=new TreeMap<Skill,Integer>();
		ConnectionManager ob=new ConnectionManager();
		Skill s=null;
		Statement st=ob.getConnection().createStatement();
		ResultSet rs=st.executeQuery("select * from skill order by name asc");
		int key=1;
		while(rs.next())
		{
			s=new Skill(rs.getLong("id"),rs.getString("name"));
			map.put(s,key);
			key=key+1;
		}
		ob.getConnection().close();
		return map;
	}
}
