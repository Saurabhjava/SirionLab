package com.sirion.dao;

import com.sirion.bean.Address;

public interface IAddressDao {
	public String addAddress(Address add);
	public Address getAddress(int aid);
}
