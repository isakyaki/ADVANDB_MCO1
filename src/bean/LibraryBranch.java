package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "librarybranch")
public class LibraryBranch {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BranchID;
	@Column
	private String BranchName;
	@Column
	private String BranchAddress;
	
	public LibraryBranch() {}

	public int getBranchID() {
		return BranchID;
	}

	public void setBranchID(int branchID) {
		BranchID = branchID;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getBranchAddress() {
		return BranchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		BranchAddress = branchAddress;
	}

	@Override
	public String toString() {
		return "LibraryBranch [BranchID=" + BranchID + ", BranchName=" + BranchName + ", BranchAddress=" + BranchAddress
				+ "]";
	}
	
	

}
