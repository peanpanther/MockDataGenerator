package data.generator.model;

public class Comp {

	private String CompanyName;
	private String CompanyLocation;

	// private List<Object> storage = new LinkedList<>();

	/*
	 * public Company(Company company, Group group, Customer customer) {
	 * this.company = company; this.group = group; this.customer = customer;
	 * storage.add(company); storage.add(group); storage.add(customer); }
	 */

	public Comp(String compName, String compLocation) {
		this.CompanyName = compName;
		this.CompanyLocation = compLocation;
	}

	@Override
	public String toString() {
		return "Company [CompanyName=" + CompanyName + ", CompanyLocation="
				+ CompanyLocation + "]";
	}

	public String getcompName() {
		return CompanyName;
	}

	public String getcompLocation() {
		return CompanyLocation;
	}

}
