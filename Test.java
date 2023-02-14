import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "admin", password = "123";
        int bakiye = 1000;
        int girisHakki = 3;
        int islem;
        while (girisHakki > 0) {
            System.out.print("Kullanıcı Adı:");
            String kullanici = input.nextLine();
            System.out.print("Şifre:");
            String sifre = input.nextLine();


            if (kullanici.equals(name) && sifre.equals(password))
            {
                System.out.println("Başarıyla Giriş Yaptınız");

                do {
                    System.out.println("1-Bakiye Sorgula\n2-Para Yatırma\n3-Para Çekme\n4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
                    islem = input.nextInt();
                    switch (islem)
                    {
                        case 1:
                            System.out.println("Bakiyeniz: " + bakiye+"\n");
                            break;
                        case 2:
                            System.out.print("Yatırmak İstediğiniz Miktar: ");
                            int paragirisi = input.nextInt();
                            bakiye += paragirisi;
                            System.out.println("Başarıyla Yatırıldı\nYeni Bakiyeniz:"+bakiye+"\n");
                            break;
                        case 3:
                            System.out.print("Çekmek İstediğiniz Miktar: ");
                            int paracikisi = input.nextInt();
                            bakiye -= paracikisi;
                            System.out.println("Başarıyla Çekildi\nYeni Bakiyeniz:"+bakiye+"\n");
                            break;
                        case 4:
                            System.out.println("İyi Günler Dileriz. Tekrar Bekleriz");
                            girisHakki -=3;
                            break;
                        default:
                            System.out.println("Lütfen Doğru İşlem Seçiniz"+"\n");



                    }
                }while (islem != 4) ;



            }
            else
            {
                girisHakki--;
                System.out.println("Bilgileriniz Hatalı\nKalan Giriş Hakkınız:"+girisHakki);
                if(girisHakki==0)
                {
                    System.out.println("Hesabınız Bloke Olmuştur");
                }
                else
                    System.out.println("Tekrar Deneyin");
            }

        }

    
        
    
    
    }


}













