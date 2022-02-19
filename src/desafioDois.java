
public class desafioDois {

	public static void main(String[] args) {

		sleepIn(true, false);
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {

		if (weekday == true && vacation == false) {

			System.out.println("Não pode dormir a tarde!");

			return false;

		} else {
			System.out.println("Podemos dormir a tarde!");
			return true;
		}
	}
}
