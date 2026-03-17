package InterViewQuestion;

import java.util.ArrayList;
import java.util.List;

public class processList {

	public static void main(String[] args) {

		List<Integer> stringList = new ArrayList<>();

		stringList.add(1);

		System.out.println(processList(stringList));

	}

	private static String processList(List<Integer> stringList) {

		for (int i : stringList) {

			if (i > 0) {

				return "Positive"; 

			}

		}

		return "negative"; 

	}

}
