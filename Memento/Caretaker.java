import java.util.*;

class Caretaker{
private List<Memento> mementoList=new ArrayList<Mememto>(); 


public void add(Memento state){
mementoList.add(state);
}

public Memento get(int index){
return mementoList.get(index);
}
}
