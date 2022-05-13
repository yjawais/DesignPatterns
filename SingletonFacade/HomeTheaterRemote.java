class HomeTheaterRemote
 {
static	Light l =new Light();;
static	Fan f = new Fan();;
static	Projector p= new Projector();;
static	Popcornpopper pp= new Popcornpopper();;
static	Screen s= new Screen();;
static	Amplifier amf = new Amplifier();;
static	CDPlayer cp = new CDPlayer();;
	
static HomeTheaterRemote rf;
	
	private HomeTheaterRemote(Light l,Fan f, Projector p, Popcornpopper pp, Screen s, Amplifier amf, CDPlayer cp)
	 {
		 this.l =l;
		 this.f=f;
		  this.p =p;
		 this.pp =pp;
		  this.s =s;
		  this.amf=amf;
		  this.cp=cp;
		


	
	 }

	public void wathchmovie()
	 {
		l.dim();
		pp.on();
		pp.popping();
		p.on();
		f.on();
		amf.setvolume(20);
		amf.settuner(2);
		cp.play();
		
	 }

	public void endmovie()
	 {
		l.on();
		pp.off();
		pp.off();
		p.off();
		f.off();
		cp.off();
		
	 }

static HomeTheaterRemote run()
{
 if (rf == null){

 rf = new HomeTheaterRemote( l, f,  p,  pp,  s,  amf,  cp);
return rf;
}
return rf;
 }

}
