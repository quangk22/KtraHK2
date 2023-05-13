package quang.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MainApp {
	static final String FILE = "input.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> people = new ArrayList<>();
		readFromFile(FILE, people);
		print(people);

		sort(people);
		print(people);

		maxWage(people);
	}

	private static void maxWage(ArrayList<Person> people) {
		// TODO Auto-generated method stub
		System.out.println("Người có lương cao nhất: " + people.get(people.size() - 1).getName());
	}

	private static void sort(ArrayList<Person> people) {
		// TODO Auto-generated method stub
		System.out.println("Sắp xếp lương tăng dần");
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if (o1.getWage() > o2.getWage())
					return 1;
				if (o1.getWage() < o2.getWage())
					return -1;
				return 0;
			}

		});
	}

	private static void print(ArrayList<Person> people) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}

	private static void readFromFile(String file, ArrayList<Person> people) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstream = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ":");
				String name = tokenizer.nextToken();
				int age = Integer.parseInt(tokenizer.nextToken());
				String city = tokenizer.nextToken();
				double wage = Double.parseDouble(tokenizer.nextToken());
				Person person = new Person(name, age, city, wage);
				people.add(person);
			}
		} catch (Exception e) {

		}
	}

}
