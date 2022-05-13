abstract class Cake{

String name;
String bread;
String chocolate;

abstract void recipe();

void bake(){System.out.println("baking cake");}
void pack(){System.out.println("packing cake");}
void decorate(){System.out.println("decorating cake");}

void ingredient(){


System.out.println(name);
System.out.println(bread);
System.out.println(chocolate);

}


}
