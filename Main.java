public class Main {
    public static void main(String[] args) {
        int total = suma(10, 30, 40);
        System.out.println(total);

        Coche miCoche = new Coche();
        miCoche.Incrementar();

        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return (a + b + c);
    }
}


class Coche {
    public int puertas = 0;

    public void Incrementar () {
        this.puertas++;
    }
}
