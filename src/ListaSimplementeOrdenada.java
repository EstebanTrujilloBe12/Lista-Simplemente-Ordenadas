public class ListaSimplementeOrdenada {

    private Nodo cabeza;

    public ListaSimplementeOrdenada() {
        cabeza = null;
    }

    // Insertar en orden ascendente
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        // Si la lista está vacía o el nuevo debe ir primero
        if (cabeza == null || dato < cabeza.dato) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }

        // Buscar posición correcta
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato < dato) {
            actual = actual.siguiente;
        }

        // Insertar en esa posición
        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
    }

    // Eliminar un dato si existe
    public void eliminar(int dato) {
        if (cabeza == null) return;

        // Si el elemento a borrar es la cabeza
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Buscar un elemento
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null && actual.dato <= dato) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Imprimir la lista
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}

