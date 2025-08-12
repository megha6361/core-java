class Company1{
    private String name ;
    private int id;
    private String city;
    private int numberOfEmployees;
    private Ceo1 ceo;

    public Company1(String name, int id, String city, int Num){
        this.name = name;
        this.id = id;
        this.city = city;
        numberOfEmployees = Num;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setCeo(Ceo1 ceo ){
        this.ceo = ceo;
    }

    public Ceo1 getCeo(){
        return ceo;
    } 

}