
package studikasus;
import java.util.Scanner;

public class class2 {
    static int p,l,pilih;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== program menghitung luas dan keliling persegi panjang ==");
        
        System.out.println("masukan nilai panjang persegi panjang");
        p = input.nextInt();
        
        System.out.println("masukan nilai lebar persegi panjang");
        l = input.nextInt();
        
        System.out.println("masukan operasi yang dipilih \n1. luas\n2. keliling");
        pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.println("luas persegi panjang adalah : "+luas());
        }
        else if (pilih == 2){
            System.out.println("keliling persegi panjang adalah :"+keliling());
        }
        else {
            System.out.println("maaf, format yang anda masukan tidak valid");
        }
        
    }
    static int luas(){
        int c = p*l;
        return c;
    }
    static int keliling(){
        int c = 2*(p+l);
        return c;
    }
    
}
