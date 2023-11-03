import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota=0;
        do{
            System.out.println("Introduzca las notas: ");
            int nota1 = entrada.nextInt();
            int nota2 = entrada.nextInt();
            int nota3 = entrada.nextInt();

            int aprobados=0;

            int suspensos = 0;
            int notaMedia= (nota1 + nota2 + nota3) /3;

            int conjuntoNotas= nota1+ nota2 + nota3;
            System.out.println("La media es: " +notaMedia);

            if(conjuntoNotas>=5){
                System.out.println("Aprobados: " +conjuntoNotas );
            }
        }while(nota!=-1);
    }
}
