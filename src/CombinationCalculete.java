import java.util.Scanner;

public class CombinationCalculete {
    public static void main(String[] args) {
      int n,r,c, fakt1=1,fakt2=1,fakt3=1,combination;

      Scanner inp=new Scanner(System.in);

        System.out.print("'n' Degerini Giriniz : ");
        n=inp.nextInt();
        for (int i =1 ; i<=n;i++){
            fakt1*=i;
        }
        System.out.print("'r' Degerini Giriniz : ");
        r=inp.nextInt();
        for (int j = 1 ; j<=r;j++){
            fakt2*=j;
        }
        c=n-r;
        for ( int k =1; k<=c; k++){
            fakt3*=k;
        }
        combination=fakt1/(fakt2*(fakt3));
        System.out.println((n+","+r)+"\s"+"Kombinasyonu : "+ combination);
    }

}
/*C(n,r) = n! / (r! * (n-r)!) */
/* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü */
