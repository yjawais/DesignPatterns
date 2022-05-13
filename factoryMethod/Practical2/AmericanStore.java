class AmericanStore extends PizzaStore
{
	Pizza createPizza(String name)
	{
	Pizza p=null;
	if(name.equalsIgnoreCase("American Veggie Pizza"))
	{
	p=new AmericanVeggie();
	}
	if(name.equalsIgnoreCase("American Corn Pizza"))
	{
	p=new AmericanCorn();
	}
	if(name.equalsIgnoreCase("American Cheese Pizza"))
	{
	p=new AmericanCheese();
	}
	return p;
	}
}
