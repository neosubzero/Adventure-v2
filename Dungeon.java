public class Dungeon
{
    public Dungeon
    {
        String balcony = "You are on the Balcony. Exit is South.";
        String bedroom1 = "You are in the Master Bedroom. Exits are East and South.";
        String bedroom2 = "You are in the Guest Bedroom. Exits are North and East.";
        String dining = "You are in the Dining Room. Exits are West and North.";
        String kitchen = "You are in the Kitchen. Exits are West and South.";
        String northHall = "You are in the North Hall. Exits are West, North, East, and South.";
        String southHall = "You are in the South Hall. Exits are West, North, and East.";
    }   
    
    public String getRoom()
    {
        return this.southHall;
    }
}

