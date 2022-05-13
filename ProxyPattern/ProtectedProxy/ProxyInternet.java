class ProxyInternet implements InternetAccess{
String empname;
int role;
ProxyInternet(String empname,int role){
this.empname=empname;
this.role=role;

}

public void grantInternetAccess(){

if(role<3){
RealInternet ra=new RealInternet();
ra.grantInternetAccess();
}
else{
System.out.println("restricted access");
}
}
}
