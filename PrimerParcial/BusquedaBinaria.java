public class BusquedaBinaria {

    // Función de búsqueda binaria recursiva
    static int busquedaBinaria(int[] arr, int inicio, int fin, int objetivo) {
        if (fin >= inicio) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el elemento está presente en el medio
            if (arr[medio] == objetivo)
                return medio;

            // Si el elemento es más pequeño que el medio, entonces está en la sublista izquierda
            if (arr[medio] > objetivo)
                return busquedaBinaria(arr, inicio, medio - 1, objetivo);

            // Si el elemento es más grande que el medio, entonces está en la sublista derecha
            return busquedaBinaria(arr, medio + 1, fin, objetivo);
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int objetivo = 14;
        int resultado = busquedaBinaria(arreglo, 0, arreglo.length - 1, objetivo);

        if (resultado == -1) {
            System.out.println("Elemento no encontrado en el arreglo.");
        } else {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        }
    }
}

