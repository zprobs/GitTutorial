public class Cake {
    public enum CakeToppings {
        Chocolate, Strawberry
    }

    public enum CakeToppingsFrench {
        Chocolat, Fraise
    }

    public CakeToppings cakeToppings;
    public CakeToppingsFrench cakeToppingsFrench;

    public Cake(CakeToppings t) {
        cakeToppings = t;

        // Assign the name in french for the topping
        if(cakeToppings==CakeToppings.Strawberry)
            cakeToppingsFrench=CakeToppingsFrench.Fraise;
        else
            cakeToppingsFrench=CakeToppingsFrench.Chocolat;

    }

    public int getName() {
        return cakeToppings + " Cake\n";
    }

    public String getNameFrench() {
        return cakeToppingsFrench + " Cake\n";
    }
}
