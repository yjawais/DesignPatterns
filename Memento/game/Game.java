class Game{
private String state;

public void  setState(String state){
this.state=state;
}

public String getState(){
return state;}

public Memento saveStatetoMemento(){
return new Memento(state);}

public void getStateofMemento(Memento memento){
state=memento.getState();
}
}
