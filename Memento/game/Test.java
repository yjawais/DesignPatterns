class Test{
public static void main(String args[]){
Game orig=new Game();
SavingCaretaker ct=new SavingCaretaker();

orig.setState("forward");
ct.add(orig.saveStatetoMemento());

orig.setState("backward");
ct.add(orig.saveStatetoMemento());


orig.setState("right");
ct.add(orig.saveStatetoMemento());

orig.setState("left");
ct.add(orig.saveStatetoMemento());
System.out.println("current state= "+orig.getState());


orig.getStateofMemento(ct.get(0));
System.out.println("first saved state= "+orig.getState());

orig.getStateofMemento(ct.get(1));
System.out.println("second saved state= "+orig.getState());

orig.getStateofMemento(ct.get(2));
System.out.println("third saved state= "+orig.getState());
orig.getStateofMemento(ct.get(3));
System.out.println("fourth saved state= "+orig.getState());
}

}
