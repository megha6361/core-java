class TrainRunner
{
public static void main(String[] args)
{
//System.out.println(Train.Length);
Train train = new Train();
System.out.println(train.length);
train.setName("rajadhani");
System.out.println(train.getName());
System.out.println(train.length);

System.out.println("==================");
Train train1 = new Train();
System.out.println(train1.length);
System.out.println(train1.getName());

train.length = 300;
System.out.println(train.length);
System.out.println(train1.length);
}
}

