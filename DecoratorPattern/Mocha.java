class Mocha extends Toppings
{
Coffee c;
Mocha(Coffee c){this.c=c;}


public double cost(){
double coffeeCost=c.cost();
return(coffeeCost+50);
}
public String getDescription(){


return(c.getDescription()+"with mocha");

}

}
