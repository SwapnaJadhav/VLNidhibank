package com.vlup.vlnidhibank.dto;

import java.util.List;

import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.entity.MemberAddress;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.entity.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntityDto {

	private Integer id;
    private String memberCode;
    private String remarks;
    private boolean status;
    private String c1;
    private String c2;
    private String c3;
    private MemberAddress memberAddress;
    private MemberPersonalDetail memPerDetail;
    private Nominee nominee;
    private Branch branch;
    

    public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public MemberPersonalDetail getMemPerDetail() {
		return memPerDetail;
	}

	public void setMemPerDetail(MemberPersonalDetail memPerDetail) {
		this.memPerDetail = memPerDetail;
	}

	public Integer getId() {
        return id;
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

    public boolean getStatus() {
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

	public Nominee getNominee() {
		return nominee;
	}

	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}

	public MemberEntityDto(Integer id, String memberCode, String remarks, boolean status, String c1, String c2,
			String c3, MemberAddress memberAddress, MemberPersonalDetail memPerDetail, Nominee nominee, Branch branch) {
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

	public MemberEntityDto() {
		super();
	}

	

	
	    
    
}


