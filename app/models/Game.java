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
  
  @Column(columnDefinition = "TEXT") 
  public String description;                                                                   
 
  @Constraints.Required                                                                        
  public String startMapLink;
                                                                                               
 
  public static Finder<Long,Game> find = new Finder<Long,Game>(Long.class, 
  Game.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartMapLink() {
        return startMapLink;
    }

    public void setStartMapLink(String startMapLink) {
        this.startMapLink = startMapLink;
    }

    public String getTrimmedDes(){
      if(this.description != null && this.description.length() >1000){
        return description.substring(0,1000)+"...";
      }

      return description;
    }
}
