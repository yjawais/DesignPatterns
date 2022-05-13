class NgpCakeStore extends CakeStore{

Cake createCake(String type){
if(type.equalsIgnoreCase("nagpur blackforest")){c = new NgpBlackForest();}
else if(type.equalsIgnoreCase("nagpur vanilla")){c = new NgpVanilla();}
else{c = new NgpChocolate();}

return(c);
}
}
