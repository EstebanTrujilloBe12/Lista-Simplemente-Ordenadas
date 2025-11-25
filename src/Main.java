public class Main {
    public static void main(String[] args) {

        ListaSimplementeOrdenada lista = new ListaSimplementeOrdenada();

        lista.insertar(5);
        lista.insertar(2);
        lista.insertar(7);
        lista.insertar(3);

        lista.imprimir();  // 2 -> 3 -> 5 -> 7 -> null

        lista.eliminar(5);
        lista.imprimir();  // 2 -> 3 -> 7 -> null

        System.out.println(lista.buscar(7)); // true
        System.out.println(lista.buscar(10)); // false
    }
}
