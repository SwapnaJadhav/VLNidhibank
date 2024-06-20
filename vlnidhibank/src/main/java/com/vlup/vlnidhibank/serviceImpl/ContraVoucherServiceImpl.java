package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.DTO.ContraVoucherDTO;
import com.BankingApp.entities.ContraVoucher;
import com.BankingApp.repositories.ContraVoucherRepository;
import com.BankingApp.services.ContraVoucherService;

@Service
public class ContraVoucherServiceImpl implements ContraVoucherService {

    @Autowired
    private ContraVoucherRepository contraVoucherRepository;

    @Override
    public ContraVoucherDTO createContraVoucher(ContraVoucherDTO contraVoucherDTO) {
        ContraVoucher contraVoucher = convertToEntity(contraVoucherDTO);
        ContraVoucher savedContraVoucher = contraVoucherRepository.save(contraVoucher);
        return convertToDTO(savedContraVoucher);
    }

    @Override
    public ContraVoucherDTO getContraVoucher(Long voucherId) {
        ContraVoucher contraVoucher = contraVoucherRepository.findById(voucherId)
                .orElseThrow(() -> new RuntimeException("Contra Voucher not found"));
        return convertToDTO(contraVoucher);
    }

    @Override
    public List<ContraVoucherDTO> getAllContraVouchers() {
        List<ContraVoucher> contraVouchers = contraVoucherRepository.findAll();
        return contraVouchers.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ContraVoucherDTO updateContraVoucher(Long voucherId, ContraVoucherDTO contraVoucherDTO) {
        ContraVoucher existingVoucher = contraVoucherRepository.findById(voucherId)
                .orElseThrow(() -> new RuntimeException("Contra Voucher not found"));
        existingVoucher.setTxnDate(contraVoucherDTO.getTxnDate());
        existingVoucher.setCrLedger(contraVoucherDTO.getCrLedger());
        existingVoucher.setDrLedger(contraVoucherDTO.getDrLedger());
        existingVoucher.setAmount(contraVoucherDTO.getAmount());
        existingVoucher.setRemarks(contraVoucherDTO.getRemarks());
        ContraVoucher updatedContraVoucher = contraVoucherRepository.save(existingVoucher);
        return convertToDTO(updatedContraVoucher);
    }

    @Override
    public void deleteContraVoucher(Long voucherId) {
        contraVoucherRepository.deleteById(voucherId);
    }

    @Override
    public ContraVoucher createContraVoucher(ContraVoucher contraVoucher) {
        return contraVoucherRepository.save(contraVoucher);
    }

    @Override
    public ContraVoucher updateContraVoucher(Long voucherId, ContraVoucher contraVoucher) {
        ContraVoucher existingVoucher = contraVoucherRepository.findById(voucherId)
                .orElseThrow(() -> new RuntimeException("Contra Voucher not found"));
        existingVoucher.setTxnDate(contraVoucher.getTxnDate());
        existingVoucher.setCrLedger(contraVoucher.getCrLedger());
        existingVoucher.setDrLedger(contraVoucher.getDrLedger());
        existingVoucher.setAmount(contraVoucher.getAmount());
        existingVoucher.setRemarks(contraVoucher.getRemarks());
        return contraVoucherRepository.save(existingVoucher);
    }

    private ContraVoucherDTO convertToDTO(ContraVoucher contraVoucher) {
        ContraVoucherDTO dto = new ContraVoucherDTO();
        dto.setVoucherId(contraVoucher.getVoucherId());
        dto.setTxnDate(contraVoucher.getTxnDate());
        dto.setCrLedger(contraVoucher.getCrLedger());
        dto.setDrLedger(contraVoucher.getDrLedger());
        dto.setAmount(contraVoucher.getAmount());
        dto.setRemarks(contraVoucher.getRemarks());
        return dto;
    }

    private ContraVoucher convertToEntity(ContraVoucherDTO dto) {
        ContraVoucher contraVoucher = new ContraVoucher();
        contraVoucher.setVoucherId(dto.getVoucherId());
        contraVoucher.setTxnDate(dto.getTxnDate());
        contraVoucher.setCrLedger(dto.getCrLedger());
        contraVoucher.setDrLedger(dto.getDrLedger());
        contraVoucher.setAmount(dto.getAmount());
        contraVoucher.setRemarks(dto.getRemarks());
        return contraVoucher;
    }
}
