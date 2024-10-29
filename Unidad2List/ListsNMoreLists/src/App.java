public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();
        int valorBuscado = 20;
        lista.buscar(valorBuscado);
        if (lista.buscar(valorBuscado) == false) {
            System.out.println("Valor no encontrado");
        } else {
            System.out.println("Valor encontrado");
        }

    }
}
