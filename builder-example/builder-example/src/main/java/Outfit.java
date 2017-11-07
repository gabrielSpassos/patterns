public class Outfit {

    private int armor;
    private String color;
    private String element;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "armor=" + armor +
                ", color='" + color + '\'' +
                ", element='" + element + '\'' +
                '}';
    }
}
