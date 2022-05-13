class Test
 {
	public static void main(String args[])
	 {
		Light l = new Light();
		Fan f = new Fan();
		Projector p = new Projector();
		Popcornpopper pp = new Popcornpopper();
		Screen s = new Screen();
		Amplifier amf = new Amplifier();
		CDPlayer cp = new CDPlayer();
		DVDPlayer dp = new DVDPlayer();


		HomeTheaterRemote htr = new HomeTheaterRemote( l, f,  p,  pp,  s,  amf,  cp,  dp);
	
		htr.wathchmovie();
		htr.endmovie();
 	 }
 }
