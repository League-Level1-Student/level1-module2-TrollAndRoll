
public class JamesBond
{
	int i = 0;
	
	int findCode(Vault vault)
	{
		while(vault.trycode(i) == false)
		{
			i = i + 1;
			
			throw new RuntimeException("The Codes not in here");	
		}
		return i;
			
	}
}
