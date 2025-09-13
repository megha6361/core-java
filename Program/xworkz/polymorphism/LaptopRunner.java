package xworkz.polymorphism;

public class LaptopRunner {
        public static void main(String[] args) {
            // Upcasting - child to parent
            Laptop laptop = new Dell();
            Laptop laptop1 = new Lenovo();

            System.out.println(laptop.name);
            System.out.println(laptop1.name);

            if (laptop1 instanceof Lenovo) {
                Lenovo lenovo = (Lenovo) laptop1;
                System.out.println("object is lenovo");
            }

            if (laptop instanceof Dell){
              Dell dell =(Dell) laptop;
              System.out.println("object is lenovo");

            }
        }
    }


