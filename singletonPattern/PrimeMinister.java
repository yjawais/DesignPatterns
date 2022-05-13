class PrimeMinister
{
static PrimeMinister pm;//create static reference


 private PrimeMinister(){}//declare constructor as private
 
  void setRule()
  {
  System.out.println("rules");
  }
 void givePermission()
  {
  System.out.println("Permission");
  }

	static PrimeMinister createPm()//create a static function to create object
{

	if(pm==null)
	{
	 pm = new PrimeMinister();
	}
	return pm;
	


}
}
