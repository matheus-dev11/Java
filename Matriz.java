package trabalho;

import java.util.Locale;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N;
		System.out.println("Quantas linhas vai ter a matriz?");
		M = sc.nextInt();
		System.out.println("Quantas colunas vai ter a matriz?");
		N = sc.nextInt();
		
		int[] [] mat = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento["+ i +","+ j + "]:" );
				mat[i][j] = sc.nextInt() ;
			}
		}
		
		System.out.println();
		System.out.println("Matriz digitada:");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
		  
		
		sc.close();
	
	}

}
