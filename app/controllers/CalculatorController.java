package controllers;


import play.mvc.*;


public class CalculatorController extends Controller{
    public Result calculator(double pretaxincome,
                             double otherincome,
                             String taxyear){
        double finalamount = ((pretaxincome + otherincome) *.2); 
        String ret = String.format("Your income tax for the tax year %s, %f", taxyear, finalamount);
        return ok(views.html.resultspage.render(ret));
}
}