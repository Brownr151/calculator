// @GENERATOR:play-routes-compiler
// @SOURCE:/home/siamak/Documents/calculator/conf/routes
// @DATE:Mon Dec 02 07:08:06 PST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRobController RobController = new controllers.ReverseRobController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCalculatorController CalculatorController = new controllers.ReverseCalculatorController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRobController RobController = new controllers.javascript.ReverseRobController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCalculatorController CalculatorController = new controllers.javascript.ReverseCalculatorController(RoutesPrefix.byNamePrefix());
  }

}
