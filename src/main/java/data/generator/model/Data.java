package data.generator.model;

import java.util.LinkedList;
import java.util.List;

public class Data {

	private Group group;
	private Comp company;
	private Customer customer;

	// private List<Object> storage = new LinkedList<Object>();

	public Data() {
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Comp getCompany() {
		return company;
	}

	public void setCompany(Comp company) {
		this.company = company;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Data(Comp company, Group group, Customer customer) {
		this.company = company;
		this.group = group;
		this.customer = customer;
		// storage.add(company);
		// storage.add(group);
		// storage.add(customer);
	}

	@Override
	public String toString() {
		return "Data [group=" + group.toString() + ", company="
				+ company.toString() + ", customer=" + customer.toString()
				+ "]";
	}

}
