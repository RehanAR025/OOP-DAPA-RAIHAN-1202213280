import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database datb = new Database();

        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName("Bakso");
        menu1.setCategory("(Makanan)");
        menu1.setPrice(10000);
        
        Menu menu2 = new Menu();
        menu2.setName("Lemon Tea");
        menu2.setCategory("(Minuman)");
        menu2.setPrice(5000);

        Menu menu3 = new Menu();
        menu3.setName("Brownies");
        menu3.setCategory("(Dessert)");
        menu3.setPrice(12000);
        
        // TODO Insert Menu to Database
        datb.InsertMenu(menu1);
        datb.InsertMenu(menu2);
        datb.InsertMenu(menu3);

        // TODO Display Main Menu
        System.out.println("Selamat Datang di Restaurant EAD!!!!!");
        System.out.println("Silakan Register Terlebih Dahulu");
        System.out.println("==============================");

        // TODO Create User
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            
            System.out.print("No. Handphone: ");
            int phonenum = scanner.nextInt();
        
        User user = new User();
        user.setUsername(name);
        user.setPhoneNumber(phonenum);
        user.Register();

        // Display Menu
        }

    }
}