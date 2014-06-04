package forms;

import models.Game;

public class GameForm {

      public GameForm(){}
      public GameForm(String name, String description, String mapLink){
          this.name = name;
          this.description = description;
          this.mapLink = mapLink;
      }
      public GameForm(Game g){
          this.name = g.getName();
          this.description = g.getDescription();
          this.mapLink = g.getStartMapLink();
      }
      public String name;
      public String description;
      public String mapLink;
    }
