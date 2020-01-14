package com.app.pojos.customer;

public class Address {

	private Integer addressId;
	private int userId;
	private AddressType addressType;
	private String addressFieldOne;
	private String addressFieldTwo;
	private String addressCity;
	private String addressState;
	private int addressPincode;
	
	public Address() {
		System.out.println("Address Pojo");
	}

	public Address(int userId, AddressType addressType, String addressFieldOne, String addressFieldTwo,
			String addressCity, String addressState, int addressPincode) {
		super();
		this.userId = userId;
		this.addressType = addressType;
		this.addressFieldOne = addressFieldOne;
		this.addressFieldTwo = addressFieldTwo;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPincode = addressPincode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public String getAddressFieldOne() {
		return addressFieldOne;
	}

	public void setAddressFieldOne(String addressFieldOne) {
		this.addressFieldOne = addressFieldOne;
	}

	public String getAddressFieldTwo() {
		return addressFieldTwo;
	}

	public void setAddressFieldTwo(String addressFieldTwo) {
		this.addressFieldTwo = addressFieldTwo;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public int getAddressPincode() {
		return addressPincode;
	}

	public void setAddressPincode(int addressPincode) {
		this.addressPincode = addressPincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", userId=" + userId + ", addressType=" + addressType
				+ ", addressFieldOne=" + addressFieldOne + ", addressFieldTwo=" + addressFieldTwo + ", addressCity="
				+ addressCity + ", addressState=" + addressState + ", addressPincode=" + addressPincode + "]";
	}
	
	
}
