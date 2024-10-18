package seleniumfree.pages;

public class TestDevsu {

    public int computeClosestToZero(int[] ts) {
        if (ts.length == 0) {
            return 0; // Devolver 0 si la matriz está vacía
        }

        int closestTemp = ts[0]; // Inicializar la temperatura más cercana como la primera en la matriz

        for (int i = 1; i < ts.length; i++) {
            // Si la temperatura actual es más cercana a 0 que la más cercana actual,
            // o si ambas temperaturas están igualmente cerca de 0 pero la temperatura
            // actual es positiva,
            // actualizar la temperatura más cercana.
            if (Math.abs(ts[i]) < Math.abs(closestTemp) || (Math.abs(ts[i]) == Math.abs(closestTemp) && ts[i] > 0)) {
                closestTemp = ts[i];
            }
        }

        return closestTemp;
    }

    public static void main(String[] args) {
        TestDevsu closestToZero = new TestDevsu();
        int[] temperatures = { 7, -5, 10, -2, 5 };
        System.out.println("Temperatura más cercana a 0: " + closestToZero.computeClosestToZero(temperatures));
    }
}
