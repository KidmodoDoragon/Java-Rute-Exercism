public class GameMaster {

    public String describe(Character character){
        StringBuilder sb = new StringBuilder();
        sb.append("You're a level " +character.getLevel() +
                " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points." );
        return sb.toString();
    }
     
    public String describe(Destination destination){
        StringBuilder sb = new StringBuilder();
        sb.append("You've arrived at " + destination.getName()
                +", which has " + destination.getInhabitants() + " inhabitants.");
        return sb.toString();
        }
        
    public String describe(TravelMethod trameth){
        return switch(trameth){
            case HORSEBACK -> "You're traveling to your destination on horseback.";
            case WALKING -> "You're traveling to your destination by walking.";
        };
    }
    
    public String describe(Character character, Destination destination, TravelMethod trameth){
        return this.describe(character)+ " " +
            this.describe(trameth)+ " " +
            this.describe(destination);
    }
    
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
        return this.describe(character)+ " " +
            this.describe(TravelMethod.WALKING)+ " " +
            this.describe(destination);
    }
    
}