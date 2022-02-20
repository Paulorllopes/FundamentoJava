
public class returnEmArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		ExibirArray(a);
		
		String[] cadastro = {"Paulo", "Robson"};
		
		nome(cadastro);
		sobrenome(cadastro);

	}
	
	public static void ExibirArray(int[] x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
	}
	
	public static void nome(String[] a) {
		
		System.out.println(a[0]);
	}
	
	public static void sobrenome(String[] b) {
		
		System.out.println(b[1]);
		
	}

}
