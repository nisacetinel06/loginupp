
package loginuygulaması;

import java.util.Scanner;
public class Loginuygulaması {
    
static boolean aktif=true;
static int hakSayisi=3;

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        if (aktif)
        {
            if (hakSayisi>0) 
            {
                while(aktif)
                {
                    System.out.println("Kullanıcı adı: ");
                    String username=klavye.nextLine();
                    
                    System.out.println("Şifre girin:" );
                    String password=klavye.nextLine();
                    
                    boolean sonuc=login(username, password);
                    if (sonuc)
                    {
                        System.out.println("Başarılı şekilde giriş yaptınız.");
                        break;
                    }
                    else
                    {
                        if (hakSayisi==0) 
                        {
                            aktif=false;
                            break;
                        }
                        else
                        {
                            System.out.println("Yanlış bilgi ,tekrar deneyin");
                        }
                    }
                }
                if(aktif!=0)
                {
                    System.out.println("Hak sayınız dolmuştur.Hesap bloke edildi.");
                } else 
                {    
                    System.out.println("Hak sayınız dolmuştur");
                }
            }
        }
        else
        {
            System.out.println("Hesabınız aktif değildir.");
        }
    }
    public static boolean login(String username,String password)
    {
        if(username.equals("nisa") && password.equals("1126"))
        {
            return true;
        }
        else
        {
            hakSayisi--;
            if(hakSayisi==0)
            {
                aktif=false;
            }
            return false;
        }
    }
}
