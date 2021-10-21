import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //değişkenler Oluşturulur
        String userName, password, cevap;

        // Kullanıcıdan Girdi Alınır

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Yanlış Şifre ! ");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz: ");
            cevap=input.nextLine();
            if (cevap.equals("evet")){
                System.out.println("Yeni giriceğiniz şifre eski şifre ile aynı olmamalı");
                System.out.print(" Yeni Şifreyi Giriniz: ");
                String newPassword=input.nextLine();

                if(newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı.");
                }else {
                    System.out.println("Şifre oluşturuldu");

                }

            }else{
                System.out.println("İyi Günler");
            }

        }

    }
}
