package com.vlup.vlnidhibank.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.BankingApp.DTO.ContraVoucherDTO;
import com.BankingApp.services.ContraVoucherService;

@RestController
@RequestMapping("/contra-vouchers")
public class ContraVoucherController {

    @Autowired
    private ContraVoucherService contraVoucherService;

    @PostMapping
    public ContraVoucherDTO createContraVoucher(@RequestBody ContraVoucherDTO contraVoucherDTO) {
        return contraVoucherService.createContraVoucher(contraVoucherDTO);
    }

    @GetMapping("/{voucherId}")
    public ContraVoucherDTO getContraVoucher(@PathVariable Long voucherId) {
        return contraVoucherService.getContraVoucher(voucherId);
    }

    @GetMapping
    public List<ContraVoucherDTO> getAllContraVouchers() {
        return contraVoucherService.getAllContraVouchers();
    }

    @PutMapping("/{voucherId}")
    public ContraVoucherDTO updateContraVoucher(@PathVariable Long voucherId, @RequestBody ContraVoucherDTO contraVoucherDTO) {
        return contraVoucherService.updateContraVoucher(voucherId, contraVoucherDTO);
    }

    @DeleteMapping("/{voucherId}")
    public void deleteContraVoucher(@PathVariable Long voucherId) {
        contraVoucherService.deleteContraVoucher(voucherId);
    }
}
