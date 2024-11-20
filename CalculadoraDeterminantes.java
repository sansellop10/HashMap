import java.util.Scanner;
public class CalculadoraDeterminantes {
    public static void main(String[] args) {
       
        Scanner x= new Scanner(System.in);
       
        int Determinante_matriz=0;
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
        int matriz[][]=new int[3][3];
        
        for(int j=0;j<=2;j++){ 
            for(int k=0;k<=2;k++){
                System.out.print("Ingresa el valor matriz["+(j+1)+"]["+(k+1)+"]:");
                matriz[j][k] =x.nextInt();  
            }
        }   
        

        a=matriz[0][0];
        b=matriz[0][1];
        c=matriz[0][2];
        d=matriz[1][0];
        e=matriz[1][1];
        f=matriz[1][2];
        g=matriz[2][0];
        h=matriz[2][1];
        i=matriz[2][2];
        
        System.out.print("| "+a+" ");
        System.out.print(" "+b+" ");
        System.out.println(" "+c+" |");
        System.out.print("| "+d+" ");
        System.out.print(" "+e+" ");
        System.out.println(" "+f+" |");
        System.out.print("| "+g+" ");
        System.out.print(" "+h+" ");
        System.out.println(" "+i+" |");
        
        Determinante_matriz = (a*e*i+b*f*g+d*h*c)-(c*e*g+a*f*h+d*b*i);
        System.out.println("El determinante de la matriz dada es: "+Determinante_matriz);
        
        x.close();
    }
    
}
