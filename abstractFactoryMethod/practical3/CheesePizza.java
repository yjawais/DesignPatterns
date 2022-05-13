class CheesePizza extends Pizza
{
PizzaIngredientsFactory pif;


	CheesePizza(PizzaIngredientsFactory pif){
		this.pif=pif;
	}
	public void recipe()
	{
	d=pif.createDough();

	s=pif.createSauce();

	c=pif.createCheese();

	}
}
