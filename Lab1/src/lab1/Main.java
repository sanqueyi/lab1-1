package lab1;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		String[] disArr = new String[args.length];
		for (int j = 0; j < args.length; j++) {
			disArr[j] = args[j].toLowerCase();//what the?
		}

		int i;
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large")|| disArr[i].equals("grant"))
				break;

		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			return;
		}

		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} else {
			beveStr = disArr[0];
		}

		Beverage order=
		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
		System.out.println(order.getDescription());
		// and so on...

		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(order.cost()));
		
	}
}