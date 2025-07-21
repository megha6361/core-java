 class Clock {

private String name;
private int cost;
private int second;
private int hours;
private int minutes;

public static int length;
static {
System.out.println("static block is clock");
}
{
System.out.println("non-static block is clock");
}
public static void main(String[] args){
}
public void setName(String clockName){
name = clockName;
}
public void setCost(int clockCost){
cost = clockCost;
}
public void setSecond(int clockSecond){
second = clockSecond;
}
public void setHours(int clockHours){
hours = clockHours;
}
public void setMinutes(int clockMinutes){
minutes = clockMinutes;
}
public String getName() {
return name;
}
public int getCost() {
return cost;
}
public int getSecond() {
return second;
}
public int getHours(){
return hours;
}
public int getMinutes(){
return minutes;
}
}
 class ClockRunner {

static {
        System.out.println(" static block in runner class");
    }

  public static void main(String[] args){

Clock clock = new Clock();
clock .setName("wallclock");
System.out.println(clock.getName());

clock.setCost(1000);
System.out.println(clock.getCost());

clock.setMinutes(10);
System.out.println(clock.getMinutes());
clock.setSecond(5);
System.out.println(clock.getSecond());

clock.setHours(6);
System.out.println(clock.getHours());

clock .setName("digetalclock");
System.out.println(clock.getName());

clock.setCost(20000);
System.out.println(clock.getCost());

clock.setMinutes(15);
System.out.println(clock.getMinutes());

clock.setSecond(10);
System.out.println(clock.getSecond());

clock.setHours(4);
System.out.println(clock.getHours());
}
}