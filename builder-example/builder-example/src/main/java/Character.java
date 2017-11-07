public class Character {

    private String name;
    private int strength;
    private int mana;
    private int stamina;
    private int life;
    private Outfit outfit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", mana=" + mana +
                ", stamina=" + stamina +
                ", life=" + life +
                ", outfit=" + outfit +
                '}';
    }
}
