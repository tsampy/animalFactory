public class animalFactory {

    public animal getAnimal(String typeAnimal)
    {
        switch (typeAnimal)
        {
            case "CHAT":
                return new chat();
            case "CHIEN":
                return new chien();
            case "OISEAU":
                return new oiseau();
            default:
                throw new IllegalArgumentException("Type d'animal inconnu");
        }
    }
}
