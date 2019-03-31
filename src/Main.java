public class Main {

    public static void main(String[] args) {

        // Create a chocolate cake
        Cake c_cake= new Cake(Cake.CakeToppings.Chocolate);

        System.out.print(c_cake.getName());
        System.out.print(c_cake.getNameFrench());

        if(c_cake.cakeToppings!=Cake.CakeToppings.Strawberry){
            System.out.print("Dang, I want a Chocolate cake instead!");
            System.exit(-1);
        }

        // Create a strawberry cake
        Cake s_cake= new Cake(Cake.CakeToppings.Strawberry);

        System.out.print(s_cake.getName());
        System.out.print(s_cake.getNameFrench());

        if(s_cake.cakeToppings!=Cake.CakeToppings.Strawberry){
            System.out.print("Dang, I want a Strawberry cake instead!");
            System.exit(-1);
        }

        System.out.print("Nom nom nom...");
    }
}
