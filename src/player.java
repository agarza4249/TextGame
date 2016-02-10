
public class player {

	//Player base stats
	public static int hp = 100;
	public static int ap = 20;
	
	//Player consumables 
	public static int hpPotions = 1;
	public static int apPotions = 1;
	
	//Player equippable items 
	public static boolean sword = false;
	public static boolean shield = false;
	public static boolean armor = false;
	
	
	public static void PlayerStats() {
		
		//show hp counter
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
		
		//show items in inventory 
		System.out.println("You currently own:");
		
		if(hpPotions > 0)
		{
			System.out.println(hpPotions + " health potions");
		}
		else if(apPotions > 0)
		{
			System.out.println(apPotions + " Action potions");
		}
		else if(sword = true)
		{
			System.out.println("A sword");
		}
		else if(shield = true)
		{
			System.out.println("A shield");
		}
		else if(armor = true)
		{
			System.out.println("Some armor");
		}
		else 
		{
			System.out.println("you own nothing to your name.");
		}
	
	
	
	
	}
	
	
}
