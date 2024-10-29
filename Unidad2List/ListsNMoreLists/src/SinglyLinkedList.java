public class SinglyLinkedList {

    Nodo cabeza;

    public SinglyLinkedList() {
        this.cabeza = null;
    }

    public void insertar(Integer dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // Vertificar si la lista esta vacia
        if (cabeza == null) {
            // Colocar el nuevo nodo como la cabeza
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;// Iniciamos desde la cabeza (el primero)
            // Recorrdemos todos los nodos hasta encontrar un null
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Mostrar
    public void mostrar() {
        Nodo temp = cabeza;
        // Mientras temp no sea nulo
        while (temp != null) {
            System.out.println(temp.dato + "->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    // Buscar valor
    public boolean buscar(Integer valor) {
        while (cabeza != null) {
            if (cabeza.dato == valor) {
                return true;
            }
            cabeza = cabeza.siguiente;
        }
        return false;
    }
    //Borrar valor
    public void eliminar(Integer valor){
        if (cabeza == null) {
            System.out.println("No se puede eliminar, la lista esta vacia");
        }
        if (cabeza.dato == valor) {
            cabeza=cabeza.siguiente;
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior=null;
        while (temp!= null && temp.dato!=valor) {
            anterior=temp;
            temp=temp.siguiente;
        }
        if (temp==null) {
            System.out.println("No se encontro");
            return;
        }
        anterior.siguiente=temp.siguiente;
    System.out.println("Se elimino correctamente " + valor);
    }

}
