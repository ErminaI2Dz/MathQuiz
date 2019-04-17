public class QuestionMethods {

	// Generate random adding problem
	public static void addTwoNumbers() {
		int answer;

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.print(number1 + " + " + number2 + " = ");
		answer = MathQuiz.input.nextInt();

		while (answer != number1 + number2) {
			System.out.println("Odgovor nije tacan! Pokusajte ponovo!");
			System.out.print(number1 + " + " + number2 + " = ");
			answer = MathQuiz.input.nextInt();
		}
	}

	// Generate random subtraction problem
	public static void subtractTwoNumbers() {
		int answer;

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.print(number1 + " - " + number2 + " = ");
		answer = MathQuiz.input.nextInt();

		while (answer != number1 - number2) {
			System.out.println("Odgovor nije tacan! Pokusajte ponovo!");
			System.out.print(number1 + " - " + number2 + " = ");
			answer = MathQuiz.input.nextInt();
		}
	}

	// Generate random multiplication problem
	public static void multiplyTwoNumbers() {
		int answer;

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.print(number1 + " * " + number2 + " = ");
		answer = MathQuiz.input.nextInt();

		while (answer != number1 * number2) {
			System.out.println("Odgovor nije tacan! Pokusajte ponovo!");
			System.out.print(number1 + " * " + number2 + " = ");
			answer = MathQuiz.input.nextInt();
		}
	}

	// Generate random square problem
	public static void squareNumber() {
		int answer;

		int number1 = (int) (Math.random() * 10);

		System.out.print(" Koliki je kvadrat broja " + number1 + "? ");
		answer = MathQuiz.input.nextInt();

		while (answer != number1 * number1) {
			System.out.println("Odgovor nije tacan! Pokusajte ponovo!");
			System.out.print(" Koliki je kvadrat broja " + number1 + "? ");
			answer = MathQuiz.input.nextInt();
		}
	}
}
