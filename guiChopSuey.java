package com.example.graphical;
/* We put the 'guiChopSuey' class in the 'com/example/graphical' package. */

import com.allmycode.dummiesframe.DummiesFrame;
/* We import this 'DummiesFrame' class because we want to build up a window/frame 
 * which appears on the screen. The window/frame has its own title, rows with fields
 * to be filled in, button for submitting the user inputs, and data process machine.
 */

public class guiChopSuey {

    public static void main(String[] args) {

        DummiesFrame foodFrame = new DummiesFrame("GUI CHOP SUEY");
          /* We create a new object/instance of the 'DummiesFrame' class and give it a name
          * 'foodFrame'. 'foodFrame' is a frame/window which can appear on the screen and 
          * has its own title 'GUI CHOP SUEY'. 
          */

          /* Now we add rows to this frame/window. They tells people: 1)type of food; 
            * 2)food weight; 3) food cost; 4) number of servings; 5) number of calories per
            * serving. 
            */
          foodFrame.addRow("Type of food");
          foodFrame.addRow("Weight (gram)");
          foodFrame.addRow("Cost (dollar)");
          foodFrame.addRow("Number of servings (integer)");
          foodFrame.addRow("Number of calories per serving (calory)");

          /* We set the button below the rows to 'Display'. When the user clicks the 'Display'
          * button, the window/frame will show them something.
          */
          foodFrame.setButtonText("Display");
          foodFrame.go();
    }

    public static String calculate(String typeOfFood, double weight, double cost, int numberOfServings, double numberOfCaloriesPerServing) {
        
      /* We return: 1)the cost per 100 grams; 2)the cost per serving; and 3)the total
       * number of calories in the product.
       */
      double costPer100Grams = cost / weight * 100;
      double costPerServing = cost / numberOfServings;
      double totolNumberOfCalories = numberOfCaloriesPerServing * numberOfServings;
       
      return "The cost per 100 grams is $" + costPer100Grams + "; " + "the cost per serving is $" + costPerServing 
             + "; the total number of calories in the " + typeOfFood + " is " + totolNumberOfCalories + "Calories.";
    }
        


    


}

