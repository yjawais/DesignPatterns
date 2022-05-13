import java.util.*;

class PublicPerson implements Subject{
List<Observer> obs=new ArrayList<Observer>();
String name;
String handle;
PublicPerson(String name,String handle){
this.name=name;
this.handle=handle;

}


public void addFollower(Observer ob){

obs.add(ob);
System.out.println("follower added");
}

public void removeFollower(Observer ob){

obs.remove(ob);

}
public void notify(String message){

obs.forEach(ob->ob.recieveNotification(handle,message));
}
public void newmessage(String message){

System.out.println("name= "+name+" message= "+message);
notify(message);
}


}
