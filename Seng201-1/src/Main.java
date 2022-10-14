import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Flight flight=new Flight();

        String menu = "1-Reserve a ticket.\n"
                     +"2-Cancel a reservation.\n"
                     +"3-Check if whether a ticket is reserved.\n"
                     +"4-Display flight no and list of passangers."
                     +"5-Exit.";
        System.out.println(menu);

        while(true){

            System.out.println("What do you want to do?");
            String operation= scan.nextLine();

            if(operation.equals("5")){
                break;
            }
            else if(operation.equals("1")){
                System.out.println("What is your name: ");
                String name = scan.nextLine();
                if(flight.reserveSeat(name)==true){
                    System.out.println("Your reservation has been made successfully.");
                }
                else{
                    System.out.println("Something went wrong :(");
                }
            }
            else if(operation.equals("2")){
                System.out.println("Who's reservation you want to cancel: ");
                String name = scan.nextLine();
                if(flight.cancelRez(name)==true){
                    System.out.println("Your reservation has been canceled successfully.");
                }
                else{
                    System.out.println("Something went wrong :(");
                }
            }
            else if(operation.equals("3")){
                System.out.println("Which ticket do you want to check: ");
                int i=scan.nextInt();
                if(i>flight.numberOfPassangers()){
                    System.out.println("This seat has been reserved for another person.");
                }
                else{
                    System.out.println("This seat is available to reserve.");
                }
            }
            else if(operation.equals("4")){
                flight.printPassangers();

            }
        }
    }
}
