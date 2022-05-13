class IndianPizzaIngredientsFactory implements PizzaIngredientsFactory
{
 public Dough createDough(){return new ThickDough();}
 public Cheese createCheese(){return new MozzarellaCheese();}
 public Sauce createSauce(){return new ChillySauce();}



}
