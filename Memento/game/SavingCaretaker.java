import java.util.*;

class SavingCaretaker{
private List<Memento> mementoList=new ArrayList<Memento>(); 


public void add(Memento state){
mementoList.add(state);
}

public Memento get(int index){
return mementoList.get(index);
}
}
