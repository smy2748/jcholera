package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.ebean.*;                                                                        
import play.data.format.*;                                                                     
import play.data.validation.*;                                                                 
                                                                                               
                                                                                               
@Entity                                                                                        
public class Game extends Model{                                                               

  public Game(){}

  public Game(String name, String description, String startMapLink){
    this.name = name;
    this.description = description;
    this.startMapLink = startMapLink;
  }
                                                                                               
  @Id
  public Long id;                                                                              
 
  @Constraints.Required
  public String name;
 
  public String description;                                                                   
 
  @Constraints.Required                                                                        
  public String startMapLink;
                                                                                               
 
  public static Finder<Long,Game> find = new Finder<Long,Game>(Long.class, Task.class);
}         
