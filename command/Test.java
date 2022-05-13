class Test{


public static void main(String args[]){
Remote rc=new Remote();
Light light=new Light();
Fan fan =new Fan();
Command lo = new LightOn(light);
Command lf = new LightOff(light);


Command fo = new FanOn(fan);
Command ff = new FanOff(fan);


rc.setCommand(lo);
rc.pressButton();
rc.setCommand(lf);
rc.pressButton();


rc.setCommand(fo);
rc.pressButton();
rc.setCommand(ff);
rc.pressButton();




}




}
