abstract class AngryBird implements Cloneable
{
String name;

abstract void fly();

void display(){

System.out.println(name);


}
void setData(String name){
this.name=name;
}


protected Object clone() throws CloneNotSupportedException
{

return super.clone();

} 


}
