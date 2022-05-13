class Test
{
public static void main(String args[])
{

InternetAccess ia=new ProxyInternet("abc",3);
ia.grantInternetAccess();


InternetAccess ia2=new ProxyInternet("xyz",1);
ia2.grantInternetAccess();



}

}
