abstract class PizzaStore
{
	Pizza p;
	void orderPizza(String name)
	{
		p=createPizza(name);
p.recipe();
p.details();
		p.bake();
		p.cut();
		p.pack();
		

	}
	abstract Pizza createPizza(String name);
}
