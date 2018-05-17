/*
 * 
Pig + Candy

class Candy {

       private String maker; //e.g. Hershey’s, Willy Wonka
       private boolean isChocolatey;
       private double price;
}

1. Write a constructor for this class.

	Candy(String maker, boolean isChocolatey, double price)
	{
		this.maker = maker;
		this.isChocolatey = isChocolatey
		this.price = price;
	}

2. Instantiate your favorite candy

Candy("Hershey's", true, 4.99); 

3. Finish the Pig constructor.

class Pig {

       private String name;
       private boolean isSheepHerder;

       public Pig(String name, boolean canHerdSheep) 
       {
            // write code here
          this.name = name;
          this.canHerdSheep = isSheepHerder;
      }
      
      public boolean willBecomeBacon() 
      {
            if(this.isSheepHerder)
            {
                  return false;
            }
            else 
            {
            return true;
            }
      }

4. Instantiate two pigs, “Babe” and “Rasher”.

	Pig(Babe, true);
	Pig(Rasher, false);

5. Write code to create strawberry jam and spread it on toast.
	
	private String jamType;
	private boolean spreadOnToast;
	
	Class Jam
	{
		public Jam(String jamType, boolean spreadOnToast)
		{
			this.jamType = jamType;
			this.spreadOnToast = spreadOnToast;
		}
		
		Jam("strawberry", true);
	}

6. Imagine there is a pig instance called ziggy. Write code that will print “bacon for breakfast” if ziggy is destined to be turned into bacon, or “eggs for breakfast” if he is not.



	





Copyright League of Amazing Programmers 2013-2018

*/