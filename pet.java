import java.util.*;

public class pet {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int time = 0; 

        System.out.println("1.Resiodence; 2. Apartment; 3. Dormitory");
        System.out.println("Type of Residence:");
        String Residence = x.nextLine().toLowerCase();
        

        switch (Residence) { 
            case "house":
                System.out.println("How long are you staying in your 'house'?");
                time = x.nextInt();
    
                    if (time >= 18){
                        System.out.println("Recommended pet is: Pot-bellied pig");
                        break;
                    }
                    else if (time <=17 && time >=10){
                        System.out.println("Recommended pet is: Dog");
                        break;
                    }
                    else if (time < 10 && time > 0){
                        System.out.println("Recommended pet is: Snake");
                        break;
                    }
                    else{
                        System.out.println("Time can't be a zero or negative time");
                        break;
                    }
            
            case "apartment":
                System.out.println("How long are you staying in your 'house'?");
                time = x.nextInt();

                    if (time >= 10){
                        System.out.println("Recommended pet is: Cat");
                        break;
                    }
                    else if (time < 10 && time > 0){
                        System.out.println("Recommended pet is: Hamster");
                        break;
                    }
                    else{
                        System.out.println("Time can't be a zero or negative time");
                        break;
                    }
                
            case "dormitory":
                System.out.println("How long are you staying in your 'house'?");
                time = x.nextInt();

                    if (time >= 6){
                        System.out.println("Recommended pet is: Fish");
                        break;
                    }
                    else if (time < 6 && time > 0){
                        System.out.println("Recommended pet is: Ant Farm");
                        break;
                    }
                    else{
                        System.out.println("Time can't be a zero or negative time");
                        break;
                    }

            default:
                System.out.println("walang ganun dito!");
                break;
        }
    }
}
