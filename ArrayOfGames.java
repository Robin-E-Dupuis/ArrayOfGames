
import java.util.Scanner;

/**
 *
 * @author robin dupuis
 */
public class PracticingArrays {

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int numberOfGames = 0;
        do{
        System.out.println("Enter number of games or -1 to quit : ");
        numberOfGames=input.nextInt();
        if(numberOfGames==0){
            System.out.println("You cannot have 0 games man...");
        }
        return numberOfGames;
        
        }while(numberOfGames!=-1);
    }

    public PracticingArrays() {
    }
    public static char[][]readArray(int games){
        
        Scanner input = new Scanner(System.in);
        String name = "";
        char[][] names = new char[games][];
        for (int i = 0; i < games; ++i) {
            System.out.println("Enter name of game " + (i + 1) + " of " + games);
            name = input.next();
            names[i] = name.toCharArray();
        }
        return names;
    } 
    

 

   
     public static void sortGames(char[][] ar) {
        for (int i = 0; i < ar.length - 1; ++i) {
            for (int j = i + 1; j < ar.length; j++) {
                String iNames = new String(ar[i]);
                String jNames = new String(ar[j]);
                if ((iNames.compareTo(jNames)) > 0) {
                    String temp = new String(ar[i]);//temporary string put at the element of the array that is at indexd I
                    ar[i] = ar[j];//element of the array at index i is now equal to the element of the array at index j
                    ar[j] = temp.toCharArray();//element of the array at index j is now equal to the temp
                }

            }
        }
    }

  public static void print(char[][] ar) {
        for (int i = 0; i < ar.length; ++i) {
            System.out.println(ar[i]);
        }
    }
    
    
    
    public static void main(String[] args) {
       char[][] games = null;
        int choice = menu();
        while(choice!=-1){
            games = readArray(choice);
            print(games);
            System.out.println("--------now sorted-------");
            sortGames(games);
            print(games);
            choice=menu();
           
        }
        System.out.println("goobye!");
    }
}
