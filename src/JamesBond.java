
public class JamesBond
{
	int i = 0;
	
	int findCode(Vault vault)
	{
		while(vault.trycode(i) == false)
		{
			if(i < 1000000000)
			{
			i = i + 1;
			}
			else
			{
			throw new RuntimeException("The Codes not in here");	
			}
		}
		return i;		
	}
}
