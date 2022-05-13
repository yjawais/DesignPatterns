class BirdDemo
{
public static void main(String args[])
{


AngryBird p=new YellowBird();

p.setData("yellow");
p.fly();
p.display();


try{
YellowBird p2=(YellowBird)p.clone();
p2.fly();
p2.display();
}
catch(Exception e){
System.out.println(e);
}



}


}
