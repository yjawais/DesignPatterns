class IceCream extends Toppings
{
Coffee c;
IceCream(Coffee c){this.c=c;}


public double cost(){
double coffeeCost=c.cost();
return (coffeeCost+100);
}
public String getDescription(){


return (c.getDescription+"with IceCream");

}
}
