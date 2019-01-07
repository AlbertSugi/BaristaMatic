# BaristaMatic
The task is to create a simulator of an automatic coffee dispensing machine, called the BaristaMatic. The
machine maintains an inventory of drink ingredients, and is able to dispense a fixed set of possible drinks by
combining these ingredients in different amounts. The cost of a drink is computed as the total cost of its
component ingredients.

## To Run the Application <br/>
Open your selected Java IDE and click run to start the application

## Requirements <br/>
Upon startup, the BaristaMatic should display its current inventory, followed by a menu to allow the user to select
a drink. As drinks are dispensed, the inventory of ingredients should be maintained, to continually and accurately
reflect current stock in the machine. Only drinks for which there is sufficient inventory can be dispensed.

Your BaristaMatic machine should be capable of dispensing the following drinks: 

* Drink Name Ingredients<br/>
  Coffee 3 units of coffee, 1 unit of sugar, 1 unit of cream<br/>
  Decaf Coffee 3 units of Decaf Coffee, 1 unit of sugar, 1 unit of cream<br/>
  Caffe Latte 2 units of espresso, 1 unit of steamed milk<br/>
  Caffe Americano 3 units of espresso<br/>
  Caffe Mocha 1 units of Espresso, 1 unit of cocoa, 1 unit of steamed milk, 1 unit of whipped cream<br/>
  Cappuccino 2 units of Espresso, 1 unit of steamed milk, 1 unit of foamed milk<br/>

* Per-unit ingredient costs are as follows:

  Ingredient    Unit Cost<br/>
  Coffee         $0.75<br/>
  Decaf Coffee   $0.75<br/>
  Sugar          $0.25<br/>
  Cream          $0.25<br/>
  Steamed Milk   $0.35<br/>
  Foamed Milk    $0.35<br/>
  Espresso       $1.10<br/>
  Cocoa          $0.90<br/>
  Whipped Cream  $1.00<br/>

The BaristaMatic machine is capable of holding 10 units of each ingredient. At startup, the BaristaMatic should
be fully stocked with all ingredients. Restocking the machine should restore the inventory of each ingredient to
its fully-stocked state.

### Input	Format: <br/>
Your solution should read from the standard input stream, one command per line. No prompts or other
extraneous user messages should be displayed. Blank input lines should be ignored.
### Each valid command consists of a single character, as follows:<br/>
• 'R' or 'r' - restock the inventory and redisplay the menu<br/>
• 'Q' or 'q' - quit the application<br/>
• [1-6] - order the drink with the corresponding number in the menu<br/>
#### If the user enters an invalid command, then the program should display a single-line message with the following format:<br/>
Invalid selection: (characters that were entered)<br/>
#### If the user selects a valid drink number, and the machine has sufficient ingredients on hand to make the drink, then the program should display a single-line message with the following format:<br/>
Dispensing: (drink name)<br/>
#### On the other hand, if the drink order cannot be completed, then the program should display a single-line message with the following format:<br/>
Out of stock: (drink name)<br/>

The inventory and menu should be displayed immediately, one after the other, following any
applicable message.<br/>

## Output	Format:<br/>
All output should be written to the standard output stream. At program startup, and following the processing of
every command, the machine inventory and the drink menu should be displayed. Both the inventory list and the
drink menu should be displayed in alphabetic order (by ingredient name or drink name, respectively), in the
following format:<br/>
***Inventory:<br/>
(ingredient name),(quantity in inventory)<br/>
...<br/>
(ingredient name),(quantity in inventory)<br/>
Menu:<br/>
(drink number),(drink name),(cost),(in-stock)<br/>
...<br/>
(drink number),(drink name),(cost),(in-stock)<br/>***
Drinks should be numbered sequentially, starting at 1, in the order they are displayed in the menu. Cost should be
displayed in standard currency format (US dollars). The in-stock indicator should be either "true" or "false".
Note: the sample output is indented in these instructions to make it easier to read. The output generated by your
program should not have any whitespace at the beginning of a line.

## Example:<br/>
### Upon application startup, the initial inventory list and drink menu would look like this:<br/>
Inventory:<br/>
Cocoa,10<br/>
Coffee,10<br/>
Cream,10<br/>
Decaf Coffee,10<br/>
Espresso,10<br/>
Foamed Milk,10<br/>
Steamed Milk,10<br/>
Sugar,10<br/>
Whipped Cream,10<br/>
Menu:<br/>
1,Caffe Americano,$3.30,true<br/>
2,Caffe Latte,$2.55,true<br/>
3,Caffe Mocha,$3.35,true<br/>
4,Cappuccino,$2.90,true<br/>
5,Coffee,$2.75,true<br/>
6,Decaf Coffee,$2.75,true<br/>
*** For input consisting of the following commands:<br/>
 2<br/>
 q<br/> ***
### the program would produce the following output (including the startup output):<br/>
Inventory:<br/>
Cocoa,10<br/>
Coffee,10<br/>
Cream,10<br/>
Decaf Coffee,10<br/>
Espresso,10<br/>
Foamed Milk,10<br/>
Steamed Milk,10<br/>
Sugar,10<br/>
Whipped Cream,10<br/>
Menu:<br/>
1,Caffe Americano,$3.30,true<br/>
2,Caffe Latte,$2.55,true<br/>
3,Caffe Mocha,$3.35,true<br/>
4,Cappuccino,$2.90,true<br/>
5,Coffee,$2.75,true<br/>
6,Decaf Coffee,$2.75,true<br/>
Dispensing: Caffe Latte<br/>
Inventory:<br/>
Cocoa,10<br/>
Coffee,10<br/>
Cream,10<br/>
Decaf Coffee,10<br/>
Espresso,8<br/>
Foamed Milk,10<br/>
Steamed Milk,9<br/>
Sugar,10<br/>
Whipped Cream,10<br/>
Menu:<br/>
1,Caffe Americano,$3.30,true<br/>
2,Caffe Latte,$2.55,true<br/>
3,Caffe Mocha,$3.35,true<br/>
4,Cappuccino,$2.90,true<br/>
5,Coffee,$2.75,true<br/>
6,Decaf Coffee,$2.75,true<br/>
