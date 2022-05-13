abstract class Beverage{
public void prepare(){
boilmilk();
addsugar();
addbeverage();
boil();
pour();


}


public void boilmilk(){System.out.println("boil milk");}
public void addsugar(){System.out.println("add sugar");}
public void boil(){System.out.println("boil ");}
public void pour(){System.out.println("pour");}
abstract public void addbeverage();


}
