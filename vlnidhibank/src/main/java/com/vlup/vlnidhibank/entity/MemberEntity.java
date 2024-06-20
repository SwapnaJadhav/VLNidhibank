package com.vlup.vlnidhibank.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Members")
public class MemberEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String memberCode; 
      
    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;
    
    @Column(name = "status")
    private boolean status;

    @Column(name = "c1", length = 255)
    private String c1;

    @Column(name = "c2", length = 255)
    private String c2;

    @Column(name = "c3", length = 255)
    private String c3;    

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private MemberAddress memberAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memPersonalDetail_id", referencedColumnName = "id")
    private MemberPersonalDetail memPerDetail;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_nominee_id", referencedColumnName = "nominee_id")
    private Nominee nominee;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_branch_id", referencedColumnName = "branch_id")
    private Branch branch;
    
    
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Integer getId() {
		return id;
	}

	public Nominee getNominee() {
		return nominee;
	}

	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}

	public MemberPersonalDetail getMemPerDetail() {
		return memPerDetail;
	}

	public void setMemPerDetail(MemberPersonalDetail memPerDetail) {
		this.memPerDetail = memPerDetail;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public MemberAddress getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(MemberAddress memberAddress) {
		this.memberAddress = memberAddress;
	}

	public MemberEntity(Integer id, String memberCode, String remarks, boolean status, String c1, String c2, String c3,
			MemberAddress memberAddress, MemberPersonalDetail memPerDetail, Nominee nominee, Branch branch) {
		super();
		this.id = id;
		this.memberCode = memberCode;
		this.remarks = remarks;
		this.status = status;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.memberAddress = memberAddress;
		this.memPerDetail = memPerDetail;
		this.nominee = nominee;
		this.branch = branch;
	}

	public MemberEntity() {
		super();
	}

	
	

	

	

}
