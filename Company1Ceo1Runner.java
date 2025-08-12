class Company1Ceo1Runner1{
    public static void main(String[] args){

        Company1 c1 = new Company1("FoodDilivaries", 2121, "Kolar", 300);
System.out.println("company details");
        System.out.println(c1.getName());
        System.out.println(c1.getId());
        System.out.println(c1.getCity());
        System.out.println(c1.getNumberOfEmployees());

        Ceo1 ce = new Ceo1("Thanushree", 200000.0f, "Kolar");

        c1.setCeo(ce);

        Ceo1 ceo = c1.getCeo();
System.out.println("ceo details");
        System.out.println(ceo.getName());
         System.out.println(ceo.getCity());
          System.out.println(ceo.getSalary());
        
        

        
    }

}