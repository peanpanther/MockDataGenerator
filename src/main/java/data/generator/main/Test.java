package data.generator.main;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.person.Address;
import io.codearte.jfairy.producer.person.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

import org.joda.time.DateTime;
import org.json.JSONObject;

import data.generator.model.Comp;
import data.generator.model.Customer;
import data.generator.model.Group;

public class Test {

	private static JSONObject dataGenerator() {
		Random randomGenerator = new Random();
		Fairy fairy = Fairy.create();
		JSONObject json = new JSONObject();
		JSONObject jsonTotal = new JSONObject();

		Company company = fairy.company();
		Person person = fairy.person();
		int randomInt = randomGenerator.nextInt(100);
		UUID id = UUID.randomUUID();

		String compName = company.name();
		String compLoc = company.domain();
		String custName = person.firstName();
		String groupName = company.name();
		DateTime bday = person.dateOfBirth();
		Address custAddress = person.getAddress();
		// String phoneNo = person.telephoneNumber();
		String custEmail = person.email();
		Comp comp = new Comp(compName, compLoc);
		Group group = new Group(groupName, id);
		Customer cust = new Customer(custName, id, randomInt, custEmail,
				custAddress, bday);
		json.put("Customer", cust);
		json.put("Company", comp);
		json.put("Group", group);
		jsonTotal.put("Data", json);
		return jsonTotal;

	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream(
				"/home/filhan/Desktop/dataMama.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		for (int i = 0; i <= 1000; i++) {
			JSONObject json = Test.dataGenerator();
			System.out.println(json);
			oos.writeObject(json.toString().toLowerCase(Locale.ENGLISH));
		}

	}
}
