package loops;

import javax.swing.JOptionPane;

public class Ex32 {

	public static void main(String[] args) {

		String userAnswer = "";

		Double sum = 0.0;

		Double userInput1, userInput2;

		do {

			userAnswer = userAnswer.toLowerCase();

			userAnswer = userAnswer.trim();

			userInput1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input A:"));

			userInput2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input B:"));

			sum += userInput1 + userInput2;

			JOptionPane.showMessageDialog(null, "Sum = " + Math.round(sum));

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want to Continue??");

			sum = 0.0;

		} while (userAnswer.equals("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

		JOptionPane.showMessageDialog(null, "Sum = " + Math.round(sum));

	}

}
