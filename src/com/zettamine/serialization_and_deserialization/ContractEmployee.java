package com.zettamine.serialization_and_deserialization;

import java.util.Objects;

public class ContractEmployee extends Employee {
	private int contractRegId;
	
	public ContractEmployee(int empId, String empName, int dNo, int contractRegId) {
		super(empId, empName, contractRegId);
		this.contractRegId=contractRegId;
	}

	public int getContractRegId() {
		return contractRegId;
	}

	public void setContractRegId(int contractRegId) {
		this.contractRegId = contractRegId;
	}

//	@Override
//	public String toString() {
//		return "ContractEmployee [contractRegId=" + contractRegId + ", getEmpId()=" + getEmpId() + ", getEmpName()="
//				+ getEmpName() + ", getdNo()=" + getdNo() + ", toString()=" + super.toString() + ", hashCode()="
//				+ hashCode() + ", getClass()=" + getClass() + "]";
//	}
	
	@Override
	public String toString() {
		return "ContractEmployee Contract Id=" + contractRegId +" " + super.toString() +"";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contractRegId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractEmployee other = (ContractEmployee) obj;
		return contractRegId == other.contractRegId;
	}
	
	
	

}
