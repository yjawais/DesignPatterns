public class RaceClient{
private RaceCar racecar;
public RaceClient(String name){
racecar=CarFactory.getRaceCar(name);

}
private int currentx=0;
private int currenty=0;

public void movecar(int newX, int newY){
racecar.movecar(currentx,currenty,newX,newY);
currentx=newX;
currenty=newY;

}

}
