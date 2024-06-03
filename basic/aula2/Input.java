import java.util.Scanner; /* É preciso puxar da API do java para fazer o input utilizando o Scanner */

public class Input { 
    public static void main(String[] args) { 
        System.out.print("Printar");

        System.out.println("Printa e salta uma linha");

        System.out.printf("Pode fazer a mesma formatação de C");

        String nome = "Exemplo";

        System.out.printf("Nome: %s", nome);

        System.out.print("Nome eh: " + nome); 

        /* System.out.print(`Nome eh: ${nome}`); */ 


        /* =================================== */

        Scanner exemploVariavel = new Scanner(System.in); /* System.in é a entrada de valores de sistemas que é o teclado */

        String pickExemplo = exemploVariavel.next(); /* Vai ler até a primeira palavra, usando next */

        String pickExemplo2 = exemploVariavel.nextLine(); /* Vai ler tudo, usando nextLine */

        Double testeDouble = exemploVariavel.nextDouble(); /* Mesma coisa para os outros */


        System.out.printf("pickExemplo: %s, pickExemplo2: %s, testeDouble: %g", pickExemplo, pickExemplo2, testeDouble);

        exemploVariavel.close();
    } 
}

/* No print e println precisará concatenar caso não use a formatação do C (printf) */

/* %n -> pra saltar linha no print e println */

