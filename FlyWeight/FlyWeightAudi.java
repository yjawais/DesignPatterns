class FlyWeightAudi extends RaceCar
{
public static int num;

public FlyWeightAudi(){
num++;
}

public void movecar(int cx,int cy,int nx,int ny){
System.out.println("new location set "+nx+""+ny);
}

}
