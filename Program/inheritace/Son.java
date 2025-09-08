public class Son extends Father{
private int salary;
private int noOfxFriends;
public Son()
{

}
public Son(String name, int salary, int noOfxFriends){
    this.name = name;
    this.salary = salary;
    this.noOfxFriends = noOfxFriends;
}
public void getSonDetails(){
    System.out.println("Son details name - " + this.name + " salary " + this.salary
    + " friends - " + this.noOfxFriends);
}
}
