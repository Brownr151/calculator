package controllers;


import play.mvc.*;


public class CalculatorController extends Controller{
    public Result calculator(double pretaxincome,
                             double otherincome){
        double finalamount = ((pretaxincome + otherincome) *.2); 
        return ok(views.html.resultspage.render(finalamount));
}
}