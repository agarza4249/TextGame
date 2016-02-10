
public class player {

	//Player base stats
	public static int hp = 100;
	public static int ap = 20;
	
	//Player consumables 
	public static int hpPotions = 1;
	public static int apPotions = 1;
	
	//Player equippable items 
	public static int sword = 0;
	public static int shield = 0;
	public static int armor = 0;
	
	
	public static void PlayerStats() {
		
		System.out.println("With an hp of " + hp + " you feel ");
		
		if (hp > 80)
		{
			System.out.print("great!");
		}
		
		else if (hp >= 60 && hp < 80)
		{
			System.out.print("fine.");
		}
		
		else if (hp >= 40 && hp < 60)
		{
			System.out.print("awful.");
		}
		
		else if (hp < 40)
		{
			System.out.print("near death.");
		}
		
		System.out.println("");
		
	}
	
	
}
