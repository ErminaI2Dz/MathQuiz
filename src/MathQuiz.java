import java.util.Scanner;

public class MathQuiz {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Vjezbajmo matematiku!!!");

		for (int i = 0; i < 10; i++) {
			int number1 = (int) (Math.random() * 6 + 1);

			if (number1 == 1) {
				QuestionMethods.addTwoNumbers();

			} else if (number1 == 2) {
				QuestionMethods.subtractTwoNumbers();

			} else if (number1 == 3) {
				QuestionMethods.multiplyTwoNumbers();

			} else if (number1 == 4) {
				QuestionMethods.divideTwoNumbers();

			} else if (number1 == 5) {
				QuestionMethods.squareNumber();

			} else if (number1 == 6) {
				QuestionMethods.squareRootNumber();

			}

			String odgovor = (i == 9) ? "\nBravo! Uspjesno ste rijesili kviz!" : "Odgovor je tacan! Idemo dalje!";
			System.out.println(odgovor + "\n");
		}
		input.close();
	}

}
