import java.io.PipedReader;

public class Main {
    public static void main(String[] args) {

        Book b = new Book("Crime and punishment", 1000, "base book content", "Fyodor Dostoyevskiy", 1868);
        Magazine m = new Magazine("Generic name", 500, "Generic magazine content");

        //PrintedProduct pr = new PrintedProduct("name", 12, "content");

        PrintedProduct[] products = new PrintedProduct[] {
                new Book("Generic book name 1", 300, "generic book content 1", "generic author book 1", 1377),
                new Magazine("name1", 100, "c1"),
                new Magazine("name2", 100, "c2"),
        };

        for (int i = 0; i < products.length; i++){
            PrintedProduct p = products[i];
//            p.getAuthorName();
            p.printContent();
        }

        m.printContent();
        b.printContent();

        TVController[] controllers = new TVController[]{
                new SmartSpeaker(),
                new RemoteController()
        };

        for(TVController controller : controllers){
            controller.turnOnFirstChannel();
        }

        PolarBear bear = new PolarBear();
        FurSeal furSeal = new FurSeal();

        Swimmable bear2 = new PolarBear();
        Swimmable furSeal2 = new FurSeal();

        addToPool(bear);
        addToPool(furSeal2);

        A a = new A();
        A b1 = new B();
        B b2 = new B();

        a.doSmth();
        b1.doSmth();
//        b1.doSmth2();
        b2.doSmth();
        b2.doSmth2();

        int n1 = 5;
        String n2 = "6";
//        printSquare(n1,null);
//        printSquare(-1, n2);
        printSquare(n1);
        printSquare(n2);

    }

    public static void addToPool(Swimmable animal) {
//        swimmingPool.add(animal);
//        animal.swim();
    }

//    public static void printSquare(int num, String numStr){
//        if(num != -1){
//            System.out.println(num*num);
//        } else{
//            int parsedNum = Integer.parseInt(numStr);
//            System.out.println(parsedNum * parsedNum);
//        }
//    }

    public static void printSquare(int num){
        System.out.println(num * num);
    }

    public static void printSquare(String str){
        int parsedNum = Integer.parseInt(str);
        System.out.println(parsedNum * parsedNum);
    }

}