
package ejerciciosfunciones;

import java.util.Scanner;

/**
 *
 * @author khaletn
 */
public class EjerciciosFunciones {

    
    public static void main(String[] args) {
        int V[] = new int [100];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba n:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Escriba posición "+i+" del vector:");
            V[i] = sc.nextInt();
        }
        int x = Suma(V,n);
        System.out.println(""+x);
    }
    
    public static int Suma(int[] V, int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + factorial(V[i]/(i+1));
            
        }
        return s;
    }

    private static int factorial(int n) {
        int f=1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        
        return f;
    }
    
}
