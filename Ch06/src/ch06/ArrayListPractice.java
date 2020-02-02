package ch06;
import java.util.ArrayList;
public class ArrayListPractice {

    
    public static void main(String[] args) {

        ArrayList<String> cartoonChars = new <String>ArrayList();

        cartoonChars.add("Charlie Brown");
        cartoonChars.add("Spongebob Squarepants");
        cartoonChars.add("Homer Simpson");
        cartoonChars.add("Goku");
        cartoonChars.add("Wile E. Coyote");

        System.out.println(cartoonChars);

        
        // 1.  Add Scooby Doo to the first position
        cartoonChars.add(0, "Scooby Doo");
        // 2.  Print out the ArrayList cartoonChars again.
        System.out.println(cartoonChars);
        // 3.  Output the number of cartoon characters, using the size() method
        System.out.println(cartoonChars.size());
        /* 4.  Use the get(int index) method to return and output the third
         *     cartoon character.  Did you output 'Spongebob Squarepants?'   */
        System.out.println(cartoonChars.get(2));
          
        
        /* 5.  Create your own ArrayList of Strings of favorite foods.  
         *     Add four foods to your ArrayList
         */
        ArrayList<String> favoriteFoods = new <String>ArrayList();
        favoriteFoods.add("ice cream");
        favoriteFoods.add("drumsticks");
        favoriteFoods.add("berry");
        favoriteFoods.add("chicken");
        System.out.println(favoriteFoods);
        // 6.  Create an ArrayList called tenDice
        ArrayList<Die> tenDice = new <Die>ArrayList();
        // 7.  Using a for loop, add (hint, hint) ten Die objects to tenDice
        for (int i = 0; i < 10; i++) {
            tenDice.add(i, new Die());
        }
        
        // 8.  "Roll" all ten dice
        for (int i = 0; i < 10; i++) {
            tenDice.get(i).roll();
        }
        
        
        // 9.  Using a for loop, output the face value of the ten dice
        for (int i = 0; i < 10; i++) {
            System.out.println(tenDice.get(i).getFaceValue());
        }
        
        
    }
}
