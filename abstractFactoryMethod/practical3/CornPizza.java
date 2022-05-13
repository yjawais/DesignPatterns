class CornPizza extends Pizza
{
PizzaIngredientsFactory pif;


	CornPizza(PizzaIngredientsFactory pif){
		this.pif=pif;
	}
	public void recipe()
	{
	d=pif.createDough();

	s=pif.createSauce();

	c=pif.createCheese();

	}
}
