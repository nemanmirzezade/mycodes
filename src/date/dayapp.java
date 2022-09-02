package date;

import java.util.Scanner;

public class dayapp {
    private String nameofday;

    public String getNameofday() {
        try {


            Scanner scanner = new Scanner(System.in);
            System.out.println("eded daxil edin");
            int eded = scanner.nextInt();
            if (eded == 1) {
                System.out.println("monday");
            } else if (eded == 2) {
                System.out.println("tuesday");
            } else if (eded == 3) {
                System.out.println("wednesday");
            } else if (eded == 4) {
                System.out.println("thursday");
            } else if (eded == 5) {
                System.out.println("friday");
            } else if (eded == 6) {
                System.out.println("saturday");
            } else if (eded == 7) {
                System.out.println("sunday");
            } else{
                System.out.println("1 ve 7 aralaiginda daxil edin");
            }

        }    catch (Exception e){
            System.out.println("reqem daxil edin");
        }

        return nameofday;
    }

    public void setNameofday(String nameofday) {
        this.nameofday = nameofday;
    }
}
