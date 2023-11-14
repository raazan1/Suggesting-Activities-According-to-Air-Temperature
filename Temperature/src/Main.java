import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Bugün Hava Kaç Derece: ");
        double Heat = input.nextDouble();

        if(Heat<=25){
            if(Heat>=5 && Heat<=15){
                System.out.printf("Sinemaya Gidebilirsin :))");
            }
            if(Heat>=15 && Heat<=25 ){
                System.out.printf("Pikniğe Gidebilirsin ;))");
            }
            if(Heat<5){
                System.out.printf("Kayak Yapmaya Gidebilirsin :))");
            }
        }
        else {
            System.out.printf("Yüzmeye Gidebilirsin :))");
        }



    }
}