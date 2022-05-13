class IndianStore extends PizzaStore
{
	Pizza createPizza(String name)
	{
	PizzaIngredientsFactory pif=new IndianPizzaIngredientsFactory();
	if(name.equalsIgnoreCase("Veggie Pizza"))
	{
	p=new VeggiePizza(pif);
	}
	else if(name.equalsIgnoreCase("Corn Pizza"))
	{
	p=new CornPizza(pif);
	}
	else if(name.equalsIgnoreCase("Cheese Pizza"))
	{
	p=new CheesePizza(pif);
	}
	return p;
	}
}
