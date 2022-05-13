class Follower implements Observer{

String name;
Follower(String name){
this.name=name;

}

public void recieveNotification(String handle,String message){

System.out.println("handle= "+handle+" message= "+message+"follower: "+name);

}


}
