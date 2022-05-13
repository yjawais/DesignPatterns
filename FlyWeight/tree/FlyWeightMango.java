class FlyWeightMango extends Tree
{
public static int num;

public FlyWeightMango(){
num++;
}

public void plantTree(int cx,int cy,int nx,int ny){
System.out.println("new location set for mango "+nx+" "+ny);
}

}
