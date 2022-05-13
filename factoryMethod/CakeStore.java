abstract class CakeStore{


Cake c;

void order(String type){

c=createCake(type);
c.bake();
c.decorate();
c.pack();
c.recipe();
c.ingredient();

};
abstract Cake createCake(String type);
 

}
