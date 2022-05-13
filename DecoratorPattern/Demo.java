class Demo
{
public static void main(String args[])
{
Coffee c1= new Decaf();
Toppings t1= new Mocha(c1);

System.out.println(t1.getDescription());
System.out.println(t1.cost());
}

}
