public class TreeClient{
private Tree t;
public TreeClient(String name){
t=TreeSeed.getTree(name);

}
private int currentx=0;
private int currenty=0;

public void planttree(int newX, int newY){
t.plantTree(currentx,currenty,newX,newY);
currentx=newX;
currenty=newY;

}

}
