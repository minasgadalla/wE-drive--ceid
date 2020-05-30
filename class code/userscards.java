public class userscards {
 // instance variables - replace the example below with your own
 private int card_number;
 private String card_name;
 private int card_cvc;
 private String card_exp;
 private boolean card_default;

 /**
  * Constructor for objects of class usercards
  */
 public userscards() {
  // initialise instance variables

 }

 public void printCard() {
  System.out.println("Card Number " + this.card_default);
  System.out.println(" Name " + this.card_name);
 }

 public void add_new_card(int num, String name, int cvc, String exp, boolean def) {
  this.card_number = num;
  this.card_name = name;
  this.card_cvc = cvc;
  this.card_exp = exp;
  this.card_default = def;
 }


 public int get_card_info() {
  return this.card_number;

 }

 public boolean is_default() {
  if (this.card_default) {
   return true;
  } else {
   return false;
  }
 }

}
