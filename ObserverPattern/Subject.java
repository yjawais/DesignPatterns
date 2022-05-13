interface  Subject{
public void addFollower(Observer ob);

public void removeFollower(Observer ob);
public void notify(String message);
}
