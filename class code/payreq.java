public class payreq {
 private String pay_date;
 private String req_date;
 private int pay_cost;
 private boolean paid;


 /**
  * Constructor for objects of class payreq
  */
 public payreq(String date, int cost) {
  this.pay_date = date;
  this.pay_cost = cost;
 }

 public void make_payment() {
  this.paid = true;
 }

 public boolean payment_success() {
  if (this.paid) {
   return true;
  } else {
   return false;
  }
 }



}
