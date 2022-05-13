class WardhaCakeStore extends CakeStore{

Cake createCake(String type){
if(type.equalsIgnoreCase("wardha blackforest")){c = new WarBlackForest();}
else if(type.equalsIgnoreCase("wardha vanilla")){c = new WarVanilla();}
else{c = new WarChocolate();}
return (c);
}

}
