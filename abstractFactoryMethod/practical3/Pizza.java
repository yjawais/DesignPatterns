abstract class Pizza
{
	
	Sauce s;
	Dough d;
	Cheese c;
	abstract void recipe();


public void details(){

d.display();
s.display();
c.display();

}

	public void bake()
	{
		System.out.println("Pizza is baked!!");
	}
	public void cut()
	{
		System.out.println("Pizza cut into slices!!");
	}
	public void pack()
	{
		System.out.println("Pizza is packed!!");
	}


}
