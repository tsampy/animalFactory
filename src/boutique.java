import java.util.Scanner;

public class boutique {

    public static void main(String[] args)
    {
        System.out.println("Quoi c'est-y qu'tu veux ?");

        Scanner scanner = new Scanner(System.in);
        String choix = scanner.nextLine().toUpperCase();

        animalFactory factory = new animalFactory();

        try
        {
            System.out.println("Animal que t'as choisi : " + choix);
            animal bestiole = factory.getAnimal(choix);
            bestiole.cri();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}