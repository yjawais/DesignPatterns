class FlyWeightNeem extends Tree
{
public static int num;

public FlyWeightNeem(){
num++;
}

public void plantTree(int cx,int cy,int nx,int ny){
System.out.println("new location set for neem "+nx+" "+ny);
}

}
