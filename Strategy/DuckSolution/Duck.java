abstract class Duck
{ 


 public void swim()
  {
   System.out.println("swims.");
  }

 
 abstract public void display();
  
 FlyBehaviour fb;
 QuackBehaviour qb;

public void duckfly(){

fb.fly();
}

public void duckquack(){
qb.quack();
} 
}
