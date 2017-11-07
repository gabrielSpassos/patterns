public class CharacterBuilder {

    private Character character;

    public CharacterBuilder() {
        this.character = new Character();
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    public CharacterBuilder withName(String name) {
        this.character.setName(name);
        return this;
    }

    public CharacterBuilder withStrength(int strength) {
        this.character.setStrength(strength);
        return this;
    }

    public CharacterBuilder withMana(int mana) {
        this.character.setMana(mana);
        return this;
    }

    public CharacterBuilder withStamina(int stamina) {
        this.character.setStamina(stamina);
        return this;
    }

    public CharacterBuilder withLife(int life) {
        this.character.setLife(life);
        return this;
    }

    public CharacterBuilder withOutfit(int armor, String color, String element) {
        Outfit outfit = new Outfit();
        outfit.setArmor(armor);
        outfit.setColor(color);
        outfit.setElement(element);
        this.character.setOutfit(outfit);
        return this;
    }

    public Character build(){
        return this.character;
    }
}
