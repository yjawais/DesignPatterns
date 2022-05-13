abstract class Pizza
{
	String name;
	String sauce;
	String dough;
	abstract void recipe();


public void details(){
System.out.println(name);
System.out.println(sauce);
System.out.println(dough);



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
