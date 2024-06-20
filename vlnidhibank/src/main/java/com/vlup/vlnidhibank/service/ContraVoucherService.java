package com.vlup.vlnidhibank.service;

import java.util.List;

import com.BankingApp.DTO.ContraVoucherDTO;
import com.BankingApp.entities.ContraVoucher;

public interface ContraVoucherService {
   
    ContraVoucherDTO createContraVoucher(ContraVoucherDTO contraVoucherDTO);
    ContraVoucherDTO getContraVoucher(Long voucherId);
    List<ContraVoucherDTO> getAllContraVouchers();
    ContraVoucherDTO updateContraVoucher(Long voucherId, ContraVoucherDTO contraVoucherDTO);
    void deleteContraVoucher(Long voucherId);

    ContraVoucher createContraVoucher(ContraVoucher contraVoucher);
    ContraVoucher updateContraVoucher(Long voucherId, ContraVoucher contraVoucher);
}
