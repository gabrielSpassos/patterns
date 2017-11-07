public class Main {
    public static void main(String[] args) {
        Character characterWarrior = CharacterBuilder.builder()
                .withName("Warrior")
                .withLife(1000)
                .withMana(500)
                .withStamina(700)
                .withStrength(900)
                .withOutfit(300,"red","fire")
                .build();

        System.out.println(characterWarrior.toString());

        Character characterMage = CharacterBuilder.builder()
                .withName("Mage")
                .withLife(800)
                .withMana(900)
                .withStamina(300)
                .withStrength(100)
                .withOutfit(300,"blue","water")
                .build();

        System.out.println(characterMage);
    }
}
