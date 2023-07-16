package CaglaSonmez;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("caglasonmez") && password.equals("123456")){
            System.out.println("Giriş Başarılı !");
        } else {
            System.out.println("Girdiğiniz Bilgiler Yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String select = input.nextLine();

            if (select.equals("evet")) {
                System.out.print("Yeni Şifre: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }

    }
}
