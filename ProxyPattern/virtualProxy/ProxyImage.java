class ProxyImage implements ImageLoader{
RealImage rm;
String image;
ProxyImage(String image){
this.image=image;
}

public void loadImage(){

if(rm==null){
rm= new RealImage();
rm.loadImage();
System.out.println("new object");
}
else{

System.out.println("existing");
}
}
}
