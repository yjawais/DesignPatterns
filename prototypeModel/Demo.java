class Demo
{
public static void main(String args[])
{


Person p=new Person();

p.setData("p1",23);
p.display();


try{
Person p2=(Person)p.clone();
p2.display();
}
catch(Exception e){
System.out.println(e);
}



}


}
