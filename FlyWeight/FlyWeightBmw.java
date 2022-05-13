class FlyWeightBmw extends RaceCar
{
public static int num;

public FlyWeightBmw(){
num++;
}

public void movecar(int cx,int cy,int nx,int ny){
System.out.println("new location set "+nx+""+ny);
}

}
