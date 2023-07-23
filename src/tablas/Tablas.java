package tablas;

public class Tablas {

	public Tablas() {

		int[] array = calcularTabla(5);
		imprimir(array);
	}

	private void imprimir(int[] array) {
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n] + " ");
		}
	}

	private int[] calcularTabla(int variable1) {
		int num = 10;
		int array[] = new int[num];
		for (int n = 0; n < array.length; n++) {
			int variable3 = variable1 * n;
			array[n] = variable3;
		}
		return array;
	}
	public static void main(String[] args) {
		new Tablas();
	}
}
