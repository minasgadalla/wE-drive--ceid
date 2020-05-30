public class routes {
 private int type;
 private int route_time;
 private int route_cost;

 public routes() {
  // initialise instance variables
  this.route_time = 18;
  this.route_cost = 0;
 }

 public void set_type(int t) {
  this.type = t;

 }

 public void save_route_time(int time) {
  this.route_time = time;
 }
 public void save_route_cost(int cost) {
  this.route_cost = cost;
 }

 public int get_routes() {
  return route_cost;
 }

 public int calculate_cost(int time) {
  this.route_cost = (int)(time * 0.20 + 1) + 1;
  return this.route_cost;
 }


}
