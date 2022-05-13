class Person implements Cloneable
{
String name;
int age;

void setData(String name,int age){
this.name=name;

this.age=age;
}


protected Object clone() throws CloneNotSupportedException
{

return super.clone();

} 


void display(){

System.out.println(name);
System.out.println(age);

}

}
