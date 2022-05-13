class Test{

public static void main(String args[]){
PublicPerson p=new PublicPerson("person1","p1");

Follower f=new Follower("follower1"); 

p.newmessage("new message");
p.addFollower(f);
p.notify("new message");
//p.removeFollower(f);


//f.recieveNotification();
}


}
