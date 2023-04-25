package Homework4;
import java.util.Arrays;
import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
       String[] speciestype = new String[5];
        speciestype[0] = "Dog";
        speciestype[1] = "Cat";
        speciestype[2] = "Fish";
        speciestype[3] = "Birds";
        speciestype[4] = "Reptiles";
        int i=0;
        System.out.println("Pets available in the store are:" + Arrays.toString(speciestype));


        for(i=0;i<5;i++)
        {
            System.out.println("Enter the type of pet to know its details and availability");
            Scanner pettypeinput = new Scanner(System.in);
            String pettype = pettypeinput.next();

            switch(pettype) {

        case "Dog":
            Dog dog = new Dog("Dog",10,"Yorkshire", 213, 'M', 6, 7, "Grey");
            System.out.println("Dog details: " + dog.species +"," + dog.count +"," + dog.breed + "," + dog.petid + "," + dog.gender + "," + dog.getHeight() + "," + dog.getWeight() + "," + dog.getColor());
            dog.habitat();
            dog.characteristic();
            dog.sound();
            dog.food();
            dog.medicines();
            dog.accessories();
            dog.toys();
            System.out.println("Enter the dog count you need to purchase");
            Scanner countinput = new Scanner(System.in);
            int dogcount = countinput.nextInt();
            System.out.println("Purchase amount: $" + dog.amountofpurchase(dogcount,dog.dogprice));
            break;

        case "Cat":
            Cat cat = new Cat("Cat",5,"Bengal Cat", 302, 2, 'F', "White");
            System.out.println("Cat details: " + cat.species +"," +cat.count +"," +cat.breed + "," + cat.petid + "," + cat.age + "," + cat.gender + "," + cat.getColor());
            Cat.vaccination();
            cat.habitat();
            cat.characteristic();
            cat.sound();
            cat.food();
            cat.medicines();
            cat.accessories();
            cat.toys();
            System.out.println("Enter the cat count you need to purchase");
            Scanner catcountinput = new Scanner(System.in);
            int catcount = catcountinput.nextInt();
            System.out.println("Purchase amount: $" + cat.amountofpurchase(catcount,980.55));
            break;
                case "Birds":
                    Birds bird= new Birds("Parakeet",114,1,'F',"yellow",18.50);
                    System.out.println("Bird details: " + bird.breed + "," + bird.getPetid() + "," + bird.age + "," + bird.gender + "," + bird.getColor() + "," +bird.getBirdprice());
                    bird.habitat();
                    bird.characteristic();
                    bird.sound();
                    bird.food();
                    bird.medicines();
                    bird.accessories();
                    bird.toys();
                    System.out.println("Enter the bird count you need to purchase");
                    Scanner birdcountinput = new Scanner(System.in);
                    int birdcount = birdcountinput.nextInt();
                    System.out.println("Purchase amount: $" + bird.amountofpurchase(birdcount, 18.50));
                    break;

                case "Fish":
                    Fish fish =new Fish("Golden Fish","Golden Yellow");
                    System.out.println("Fish details: " +fish.breed +"," +fish.getColor());
                    Aquaticbehaviour.swim();
                    fish.sustainability();
                    System.out.println("Enter the fish count you need to purchase");
                    Scanner fishcountinput = new Scanner(System.in);
                    int fishcount = fishcountinput.nextInt();
                    System.out.println("Purchase amount: $" + fish.amountofpurchase(fishcount, 4.66));
                    break;
                case "Snake":
                    Snake snake=new Snake();
                    snake.food();
                    snake.habitat();
                    snake.actions();
                    break;

                default:
            System.out.println("Pet not available");

    }
        }
    }
}
