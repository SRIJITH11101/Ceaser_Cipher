import java.util.*;
public class CeaserCipher {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0;
        int newidx=0;
        int orgidx=0;
        String es="";
        char ar[]=new char[26];
        for (char i = 'A'; i <= 'Z'; i++,j++) {
            ar[j]=i;       
        }
        System.out.println("Enter the sentence to be enrypted");
        String ps=sc.nextLine();
        ps=ps.toUpperCase();
        System.out.println("Enter the n constant value");
        int n=sc.nextInt();
        for(int i=0;i<ps.length();i++){
            char x=ps.charAt(i);
            for(int z=0;z<ar.length;z++){
                if(x==ar[z]) {
                    newidx=(z+n)%26;
                    //System.out.println(newidx);
                    es=es+ar[newidx];
                }
            }
        }
        System.out.println("Encrypted Text : "+es);

        //Decryption
        String os="";
        for(int i=0;i<es.length();i++){
            char x=es.charAt(i);
            for(int z=0;z<ar.length;z++){
                if(x==ar[z]) {
                    orgidx=(z-n)%26;
                    //System.out.println(newidx);
                    os=os+ar[orgidx];
                }
            }
        }
        System.out.println("Decrypted Text : "+os);
        sc.close();
    }
}