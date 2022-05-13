class IndianStore extends PizzaStore
{
	Pizza createPizza(String name)
	{
	Pizza p=null;
	if(name.equalsIgnoreCase("Indian Veggie Pizza"))
	{
	p=new IndianVeggie();
	}
	if(name.equalsIgnoreCase("Indian Corn Pizza"))
	{
	p=new IndianCorn();
	}
	if(name.equalsIgnoreCase("Indian Cheese Pizza"))
	{
	p=new IndianCheese();
	}
	return p;
	}
}
