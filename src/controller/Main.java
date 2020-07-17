package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main{
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException
	{
		TreeMap<Skill,Integer> map=new TreeMap<Skill,Integer>();
		SkillDAO ob=new SkillDAO();
		map=ob.skillCount();
		System.out.println(map);
	}
}
