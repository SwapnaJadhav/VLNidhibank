package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.DTO.DailyDepositDTO;
import com.BankingApp.entities.DailyDeposit;
import com.BankingApp.repositories.DailyDepositRepository;
import com.BankingApp.services.DailyDepositService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class DailyDepositServiceImpl implements DailyDepositService {

    @Autowired
    private DailyDepositRepository dailyDepositRepository;
 
   
    
    @Override
    public DailyDepositDTO createDailyDeposit(DailyDepositDTO dailyDepositDTO) {
    	
    	 DailyDeposit dailyDeposit = new DailyDeposit();
    	
        dailyDeposit.setPlanName(dailyDepositDTO.getPlanName());
        dailyDeposit.setMinimumAmount(dailyDepositDTO.getMinimumAmount());
        dailyDeposit.setInterestRate(dailyDepositDTO.getInterestRate());
        dailyDeposit.setTermMode(dailyDepositDTO.getTermMode());
        dailyDeposit.setTerm(dailyDepositDTO.getTerm());
        dailyDeposit.setCommNew(dailyDepositDTO.getCommNew());
        dailyDeposit.setCommRenew(dailyDepositDTO.getCommRenew());
        dailyDeposit.setCompoundInterval(dailyDepositDTO.getCompoundInterval());
        dailyDeposit.setTotalDeposit(dailyDepositDTO.getTotalDeposit());
        dailyDeposit.setMaturityAmount(dailyDepositDTO.getMaturityAmount());
        dailyDeposit.setIsFlexi(dailyDepositDTO.getIsFlexi());
        dailyDeposit.setGracePeriod(dailyDepositDTO.getGracePeriod());
        dailyDeposit.setLateFine(dailyDepositDTO.getLateFine());
        dailyDeposit.setPlanStatus(dailyDepositDTO.getPlanStatus());

        DailyDeposit savedDailyDeposit = dailyDepositRepository.save(dailyDeposit);

        DailyDepositDTO resultDTO = new DailyDepositDTO();
        resultDTO.setPlanName(savedDailyDeposit.getPlanName());
        resultDTO.setMinimumAmount(savedDailyDeposit.getMinimumAmount());
        resultDTO.setInterestRate(savedDailyDeposit.getInterestRate());
        resultDTO.setTermMode(savedDailyDeposit.getTermMode());
        resultDTO.setTerm(savedDailyDeposit.getTerm());
        resultDTO.setCommNew(savedDailyDeposit.getCommNew());
        resultDTO.setCommRenew(savedDailyDeposit.getCommRenew());
        resultDTO.setCompoundInterval(savedDailyDeposit.getCompoundInterval());
        resultDTO.setTotalDeposit(savedDailyDeposit.getTotalDeposit());
        resultDTO.setMaturityAmount(savedDailyDeposit.getMaturityAmount());
        resultDTO.setIsFlexi(savedDailyDeposit.getIsFlexi());
        resultDTO.setGracePeriod(savedDailyDeposit.getGracePeriod());
        resultDTO.setLateFine(savedDailyDeposit.getLateFine());
        resultDTO.setPlanStatus(savedDailyDeposit.getPlanStatus());
        
        

        return resultDTO;
    }
    
    public List<DailyDepositDTO> getAllDailyDeposits() {
        List<DailyDeposit> dailyDeposits = dailyDepositRepository.findAll();
        return dailyDeposits.stream().map(dailyDeposit -> {
            DailyDepositDTO dto = new DailyDepositDTO();
            dto.setPlanName(dailyDeposit.getPlanName());
            dto.setMinimumAmount(dailyDeposit.getMinimumAmount());
            dto.setInterestRate(dailyDeposit.getInterestRate());
            dto.setTermMode(dailyDeposit.getTermMode());
            dto.setTerm(dailyDeposit.getTerm());
            dto.setCommNew(dailyDeposit.getCommNew());
            dto.setCommRenew(dailyDeposit.getCommRenew());
            dto.setCompoundInterval(dailyDeposit.getCompoundInterval());
            dto.setTotalDeposit(dailyDeposit.getTotalDeposit());
            dto.setMaturityAmount(dailyDeposit.getMaturityAmount());
            dto.setIsFlexi(dailyDeposit.getIsFlexi());
            dto.setGracePeriod(dailyDeposit.getGracePeriod());
            dto.setLateFine(dailyDeposit.getLateFine());
            dto.setPlanStatus(dailyDeposit.getPlanStatus());
            return dto;
        }).collect(Collectors.toList());
    }

}
