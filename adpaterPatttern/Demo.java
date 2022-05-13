class Demo
{
public static void main(String args[])
{

Duck d=new MallardDuck();
testDuck(d);


Turkey t=new WildTurkey();
Duck d2=new TurkeyAdapter(t);
testDuck(d2);
}



static void testDuck(Duck d){

d.fly();
d.quack();


}

}

