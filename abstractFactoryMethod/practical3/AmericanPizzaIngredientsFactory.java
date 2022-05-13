class AmericanPizzaIngredientsFactory implements PizzaIngredientsFactory
{
 public Dough createDough(){return new ThinDough();}
 public Cheese createCheese(){return new ProcessedCheese();}
 public Sauce createSauce(){return new TomatoSauce();}



}
