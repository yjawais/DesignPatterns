abstract class Building{
public void build(){
base();
roof();
wall();
window();
decorate();


}


public void base(){System.out.println("making base");}
public void roof(){System.out.println("make roof");}

abstract public void wall();
abstract public void window();
abstract public void decorate();
}
