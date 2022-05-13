class Test
{
public static void main(String args[])
{
//RealImage rm=new RealImage();
ImageLoader i1=new ProxyImage("abc");
i1.loadImage();
i1.loadImage();
i1.loadImage();
}

}
