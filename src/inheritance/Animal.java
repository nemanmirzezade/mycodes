package inheritance;

public class Animal extends Alive {
    private String name;
    private int age;

    //instance
    private static int objectcount;
    public Animal(){
        objectcount++;
    }

//    public Animal(String data){
//        super(data);
//        super.supermethod();
//        System.out.println("new animal created");
//    }


//    public Animal(String name,int age) {
//        this(name);
//        this.age=age;
//        System.out.println("new animal created");
//    }
//
//    public Animal(String name){
//        this.name=name;
//
//        System.out.println("new animal created");
//    }
//
//    public Animal(int age){
//        this.age=age;
//        System.out.println("new animal created");
//    }

//    public Animal(){
//        System.out.println("new animal created");
//    }

    public int getObjjectcount() {
        return objectcount;
    }

//    @Override
//    public String toString() {
//            return "Animal{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    '}';
//    }

//    public String getName() {
//        return name;
//    }

//    public void mainMove(){
//        System.out.println("moving...");
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
