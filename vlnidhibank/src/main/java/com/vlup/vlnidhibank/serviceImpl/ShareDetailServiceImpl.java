package com.vlup.vlnidhibank.serviceImpl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.ShareDetailDto;
import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.ShareDetailRepository;
import com.vlup.vlnidhibank.service.ShareDetailService;




@Service
public class ShareDetailServiceImpl implements ShareDetailService{
	
	
	@Autowired
	private ShareDetailRepository shareDetailRepo; 
	
	@Autowired
	private ModelMapper modelMapper;

	

	private ShareDetailDto convertEntityToDto(ShareDetail shareDetail) {
		ShareDetailDto shareDetailDto=this.modelMapper.map(shareDetail, ShareDetailDto.class);
  	  return  shareDetailDto; 
    }

    
    
    private ShareDetail convertDtoToEntity(ShareDetailDto shareDetailDto) {
    	ShareDetail shareDetail=this.modelMapper.map(shareDetailDto,  ShareDetail.class);
    	  return shareDetail;
      }
	
    
	@Override
	public List<ShareDetailDto> getAllShareDetails() {
		List<ShareDetail> shareDetailList= this.shareDetailRepo.findAll();
		List<ShareDetailDto> listOfShareDtos=shareDetailList.stream().map(slist->this.convertEntityToDto(slist)).collect(Collectors.toList());
		return listOfShareDtos;
	}

	
	@Override
	public ShareDetailDto createShareDetail(ShareDetailDto shareDetailDto) {
		ShareDetail share=convertDtoToEntity(shareDetailDto);
		ShareDetail savedShare=shareDetailRepo.save(share);
		return this.convertEntityToDto(savedShare);
	}
	
	

	@Override
	public ShareDetailDto updateShareDetail(ShareDetailDto shareDetailDto, Integer shareDetailid) {
		ShareDetail share=this.shareDetailRepo
				          .findById(shareDetailid)
				          .orElseThrow(()-> new ResourceNotFoundException("Share","Id",shareDetailid));
		
		
		
		share.setAdvisiorId(shareDetailDto.getAdvisiorId());
		share.setInstallmentNo(shareDetailDto.getInstallmentNo());
		share.setShareAllotedFrom(shareDetailDto.getShareAllotedFrom());
		share.setPreviousShareBalance(shareDetailDto.getPreviousShareBalance());
		share.setPreviousNoOfShare(shareDetailDto.getPreviousNoOfShare());
		share.setFolioNo(shareDetailDto.getFolioNo());
		share.setDno(shareDetailDto.getDno());
		share.setUnallotedShare(shareDetailDto.getUnallotedShare());
		share.setTransferDate(shareDetailDto.getTransferDate());
		share.setTransferAmount(shareDetailDto.getTransferAmount());
		share.setShareNumber(shareDetailDto.getShareNumber());
		share.setShareValue(shareDetailDto.getShareValue());
		share.setTotalShares(shareDetailDto.getTotalShares());
		share.setIssueDate(shareDetailDto.getIssueDate());
		share.setMaturityDate(shareDetailDto.getMaturityDate());
		share.setPaymentBy(shareDetailDto.getPaymentBy());
	    share.setStatus(shareDetailDto.getStatus());
		share.setDividendsEarned(shareDetailDto.getDividendsEarned());
		share.setCreatedAt(shareDetailDto.getCreatedAt());
		share.setUpdatedAt(shareDetailDto.getUpdatedAt());
		share.setRemarks(shareDetailDto.getRemarks());
		//share.setBranch(shareDetailDto.getBranch());
		share.setFees(shareDetailDto.getFees());
		
		 ShareDetail updateShare= this.shareDetailRepo.save(share);
		 ShareDetailDto shareDetailPDto1=this.convertEntityToDto(updateShare);
		    
		    return shareDetailPDto1;
	}
 
	
	@Override
	public ShareDetailDto getShareDetailById(Integer id) {
		ShareDetail shareDetail=this.shareDetailRepo
				                .findById(id)
				                .orElseThrow(()->new ResourceNotFoundException("Share","Id",id));
		return this.convertEntityToDto(shareDetail);
	}
	
	

	@Override
	public void deleteShareDetail(Integer id) {
		ShareDetail share = this.shareDetailRepo
				.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Share","Id",id));
		this.shareDetailRepo.delete(share);
	}

}
