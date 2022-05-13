class Test{
public static void main(String args[]){


TreeClient trees[]={
new TreeClient("neem"),
//new TreeClient("neem"),
new TreeClient("neem"),
new TreeClient("mango"),
//new TreeClient("mango"),
new TreeClient("mango")
};

trees[0].planttree(0,0);
trees[1].planttree(0,1);
trees[2].planttree(0,2);
trees[3].planttree(1,0);
trees[4].planttree(1,1);
trees[5].planttree(1,2);

System.out.println("neem instances "+ FlyWeightNeem.num);
System.out.println("mango instances "+ FlyWeightMango8m.num);
}


}
