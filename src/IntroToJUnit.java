import static org.junit.Assert.assertEquals;

public class IntroToJUnit 
{	
	public static void main(String[] args) 
	{
		 assertEquals(4, add(2,2));
	     assertEquals("brains", getZombieFood());
	     assertEquals(3, getLargest(3,2)); 
	}
	
	static int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	static String getZombieFood()
	{
		return "brains";
	}
	
	static int getLargest(int a, int b)
	{
		return Math.max(a, b);
	}
}
/*
Get a red marker, a green marker, and another color to write text.
Write at top of board:
               assertEquals(expected, actual)

If expected matches actual, the results bar will be green, if they are different, the results bar will be red.
Ask the students, will the results bar be green or red for the following asserts?
        assertEquals(true, water is wet)
        assertEquals(true, zombies are real)
        assertEquals(false, coding is lame)
Part 2
Now for some real code. Will the results bar be green or red for these asserts?
       assertEquals(4, add(2,2));
       assertEquals(“brains”, getZombieFood());
       assertEquals(2, getLargest(3,2));
Copyright League of Amazing Programmers 2013-2017 
*/