
public class Father extends GrandFather {
    public String name;

    public void familyDetails()
    {
        System.out.println(name);
        System.out.println(this.name);
         System.out.println(super.name);
         name = "megha";
         System.out.println(name);
         System.out.println(this.name);
         System.out.println(super.name);
         super.name = "shetty";
         System.out.println(name);
         System.out.println(this.name);
         System.out.println(super.name);

    }


}
