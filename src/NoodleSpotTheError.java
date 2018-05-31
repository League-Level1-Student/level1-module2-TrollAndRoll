///*
class NoodleSpotTheError
{

	public static void main(String[] args) 
	{
		Noodle("cookies");
		System.out.println(slurp());
	}
	
     static String flavor = "slimy";

     static void Noodle(String type) 
     {
          flavor = type;
	 }
	
     static String slurp() 
     {
     	  //flavor++;
          return "yum yum";
     	  
     }
}

     


//*/