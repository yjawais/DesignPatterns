class VeggiePizza extends Pizza
{
PizzaIngredientsFactory pif;


	VeggiePizza(PizzaIngredientsFactory pif){
		this.pif=pif;
	}
	public void recipe()
	{
	d=pif.createDough();

	s=pif.createSauce();

	c=pif.createCheese();

	}
}
