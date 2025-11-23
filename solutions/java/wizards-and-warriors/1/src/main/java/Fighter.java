class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter objetive){
        return objetive.isVulnerable() ? 10 : 6 ;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter{
    private boolean spell = false;

    @Override
    boolean isVulnerable(){
        return !spell;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    void prepareSpell(){
        this.spell = true;
        return;
    }

    @Override
    int getDamagePoints(Fighter objetive){
        return spell ? 12 : 3;
    }
}