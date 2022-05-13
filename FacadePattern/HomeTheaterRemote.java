class HomeTheaterRemote
 {
	Light l;
	Fan f;
	Projector p;
	Popcornpopper pp;
	Screen s;
	Amplifier amf;
	CDPlayer cp;
	DVDPlayer dp;
	
	HomeTheaterRemote(Light l,Fan f, Projector p, Popcornpopper pp, Screen s, Amplifier amf, CDPlayer cp, DVDPlayer dp)
	 {
		this.l = l;
		this.f = f;
		this.p = p;
		this.pp = pp;
		this.s = s;
		this.amf = amf;
		this.cp = cp;
		this.dp = dp;
	
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
		dp.play();
	 }

	public void endmovie()
	 {
		l.on();
		pp.off();
		pp.off();
		p.off();
		f.off();
		cp.off();
		dp.off();
	 }
 }
