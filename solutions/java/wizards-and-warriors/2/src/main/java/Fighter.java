class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


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