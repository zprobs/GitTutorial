public class Cake {
    public enum CakeToppings {
        Chocolate, Strawberry
    }

    public CakeToppings cakeToppings;

    public Cake(CakeToppings t) {
        cakeToppings = t;
    }

    public String getName() {
        return cakeToppings + " Cake\n";
    }
}
