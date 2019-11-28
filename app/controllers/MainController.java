package controllers;


import play.mvc.*;
int MAXFORCALCULATOR = 99999;
int MINFORCALCULATOR = 1;
double pretaxincome =

public class CalculatorController extends Controller{

    public Result calculator(double pretaxincome,
                             int taxyear,
                             int country,
                             double taxpaidonearnings,
                             double interestpaidonsavings,
                             double taxpaidbankinterest,
                             double untaxedinterest,
                             double paidgiftaid,
                             boolean blind){
        if (country  )
        double finalamount = ((pretaxincome + otherincome) *.2);
        return ok(views.html.resultspage.render(finalamount));
    }
}