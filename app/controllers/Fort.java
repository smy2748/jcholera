package controllers;

import models.Game;
import play.*;
import play.mvc.*;

import views.html.*;

public class Fort extends Controller {

    public static Result index() {
        return ok(GameIndex.render(Game.find.all()));
    }

}
