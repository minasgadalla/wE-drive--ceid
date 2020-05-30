public class wepoints {
 private int wepoints;

 public wepoints() {
  this.wepoints = 150;
 }

 public int get_wepoints() {
  // put your code here
  return this.wepoints;
 }

 public void sub_wepoints(int sub) {
  this.wepoints = this.wepoints - sub;
 }

 public void calc_wepoints(int time) {
  this.wepoints = this.wepoints + time * 5;
 }

 public void zero_wepoints() {
  this.wepoints = 0;

 }


}
