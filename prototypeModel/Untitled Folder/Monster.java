abstract class Monster implements Cloneable{



String id,name;

void setId(String id){this.id=id;}
void setName(String name){this.name=name;}

String getId(){return id;}
String getName(){return name;}
abstract void move();
public Object clone(){
Object clone=null;

try{

clone=super.clone();


}catch(Exception e){}

return clone;
}

}
