package ADVANCE_LEVEL.oops;

public class Data_abstraction {
    void company()
    {
        System.out.println("Renault");
    }
     void model()
    {
        System.out.println("Duster");
    }
     void color()
    {
        System.out.println("red");
    }
     void oilType()
    {
        System.out.println("petrol");
    }
     void price()
    {
        System.out.println("399999");
    }
     void piston()
    {
        System.out.println("2 piston");
    }
     void personWhoMade()
    {
        System.out.println("akash");
    }
}
class show
{
    public static void main(String[] args) {
        Data_abstraction data_abstraction = new Data_abstraction();
        data_abstraction.company();
        data_abstraction.model();
        data_abstraction.piston();
        data_abstraction.personWhoMade();
        data_abstraction.price();
        data_abstraction.oilType();
        data_abstraction.color();

    }
}
