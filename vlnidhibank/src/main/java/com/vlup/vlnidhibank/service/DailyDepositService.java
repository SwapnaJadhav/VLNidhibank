package com.vlup.vlnidhibank.service;

import java.util.List;

import com.BankingApp.DTO.DailyDepositDTO;

public interface DailyDepositService {
	
    DailyDepositDTO createDailyDeposit(DailyDepositDTO dailyDepositDTO);
    List<DailyDepositDTO> getAllDailyDeposits();
}
