package controllers;

import models.Game;
import play.*;
import play.mvc.*;

import views.html.*;
import play.data.*;
import forms.*;

public class Fort extends Controller {

    final static Form<GameForm> gameForm = Form.form(GameForm.class);   

    public static Result index() {
        return ok(GameIndex.render(Game.find.all()));
    }

    public static Result newFort(){
        return ok(GameNew.render(gameForm));
    }

    public static Result createFort(){
       Form<GameForm> completedForm = gameForm.bindFromRequest();
       Game g = new Game(completedForm.field("name").value(),
               completedForm.field("description").value(), completedForm.field("mapLink").value());
       g.save();
       return ok(GameShow.render(g)); 
    }

    public static Result showGame(Long id){
       Game game = Game.find.byId(id);

       return ok(GameShow.render(game));
    }
}
