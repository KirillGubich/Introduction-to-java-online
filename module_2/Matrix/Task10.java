package by.jonline.matrix.main;

// Найти положительные элементы главной диагонали квадратной матрицы. 

public class Task10 {

	public static void main(String[] args) {

		int size; // размер матрицы
		size = 6;

		int[][] doubleArray = generateMatrix(size, size);
		System.out.println("Исходная матрица: ");
		System.out.println();
		printMatrix(doubleArray);
		System.out.println();

		// Вывод положительных элементов, стоящих на главной диагонали
		System.out.print("Положительные элементы, стоящие на диагонали: ");
		for (int i = 0; i < doubleArray.length; i++) {
			if (doubleArray[i][i] > 0) {
				System.out.print(doubleArray[i][i] + " ");
			}
		}

	}

	// Генерирует матрицу со случаными целочисленными значениями
	private static int[][] generateMatrix(int m, int n) {
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 201 - 100);
			}
		}

		return matrix;
	}

	// Вывод матрицы в консоль
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
