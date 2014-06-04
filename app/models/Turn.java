package models;

import javax.persistence.Id;

import play.data.format.Formats.DateTime;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

public class Turn extends Model{
	
	public Turn(){}
	
	@Id
	public Long id;
	
	public String user;
	
	public Game parentGame;
	
	
	public DateTime dateStarted;
	
	public DateTime dateFinished;
	
	public boolean isActive;
	
	public int turnNumber;
	
	
	public static Finder<Long,Turn> find = new Finder<Long,Turn>(Long.class, 
			  Turn.class);

}
