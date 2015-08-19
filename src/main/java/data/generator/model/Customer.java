package data.generator.model;

import io.codearte.jfairy.producer.person.Address;

import java.util.Date;
import java.util.UUID;

import org.joda.time.DateTime;

public class Customer {

	private String CustomerEmail;
	private String CustomerName;
	private int CustomerPhoneNo;
	private Address CustomerAddress;
	private DateTime CustomerBdayDate;
	private UUID CustomerId;

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getCustomerPhoneNo() {
		return CustomerPhoneNo;
	}

	public void setCustomerPhoneNo(int customerPhoneNo) {
		CustomerPhoneNo = customerPhoneNo;
	}

	public Address getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		CustomerAddress = customerAddress;
	}

	public DateTime getCustomerBdayDate() {
		return CustomerBdayDate;
	}

	public void setCustomerBdayDate(DateTime customerBdayDate) {
		CustomerBdayDate = customerBdayDate;
	}

	public UUID getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(UUID customerId) {
		CustomerId = customerId;
	}

	public Customer(String name, UUID custID, int custPhoneNo,
			String CustomerEmail, Address CustomerAddress,
			DateTime CustomerBdayDate) {
		this.CustomerName = name;
		this.CustomerId = custID;
		this.CustomerPhoneNo = custPhoneNo;
		this.CustomerEmail = CustomerEmail;
		this.CustomerAddress = CustomerAddress;
		this.CustomerBdayDate = CustomerBdayDate;
	}

	@Override
	public String toString() {
		return "Customer [CustomerEmail=" + CustomerEmail + ", CustomerName="
				+ CustomerName + ", CustomerPhoneNo=" + CustomerPhoneNo
				+ ", CustomerAddress=" + CustomerAddress
				+ ", CustomerBdayDate=" + CustomerBdayDate + ", CustomerId="
				+ CustomerId + "]";
	}

}