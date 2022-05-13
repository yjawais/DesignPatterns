class Test{
public static void main(String args[]){
Originator orig=new Originator();
Caretaker ct=new Caretaker();

orig.setState("first");
orig.setState("second");
ct.add(orig.saveStatetoMemento());


orig.setState("third");
ct.add(orig.saveStatetoMemento());

orig.setState("fourth");
System.out.println("current state= "+orig.getState());


orig.getStateofMemento(ct.get(0));
System.out.println("first saved state= "+orig.getState());

orig.getStateofMemento(ct.get(1));
System.out.println("second saved state= "+orig.getState());

}

}
