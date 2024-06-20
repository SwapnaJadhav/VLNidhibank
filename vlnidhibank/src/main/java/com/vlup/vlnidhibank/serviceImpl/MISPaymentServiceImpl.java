package com.vlup.vlnidhibank.serviceImpl;

import com.BankingApp.entities.MISPayment;
import com.BankingApp.repositories.MISPaymentRepository;
import com.BankingApp.services.MISPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MISPaymentServiceImpl implements MISPaymentService {

    private final MISPaymentRepository misPaymentRepository;

    @Autowired
    public MISPaymentServiceImpl(MISPaymentRepository misPaymentRepository) {
        this.misPaymentRepository = misPaymentRepository;
    }

    @Override
    public List<MISPayment> getAllMISPayments() {
        return misPaymentRepository.findAll();
    }

    @Override
    public Optional<MISPayment> getMISPaymentById(Long id) {
        return misPaymentRepository.findById(id);
    }

    @Override
    public MISPayment createMISPayment(MISPayment misPayment) {
        return misPaymentRepository.save(misPayment);
    }

    @Override
    public MISPayment updateMISPayment(Long id, MISPayment misPayment) {
        return misPaymentRepository.findById(id)
                .map(existingMISPayment -> {
                    existingMISPayment.setPolicyNo(misPayment.getPolicyNo());
                    existingMISPayment.setApplicantName(misPayment.getApplicantName());
                    existingMISPayment.setPolicyDate(misPayment.getPolicyDate());
                    existingMISPayment.setPolicyAmt(misPayment.getPolicyAmt());
                    existingMISPayment.setInterestAmount(misPayment.getInterestAmount());
                    existingMISPayment.setSchemeName(misPayment.getSchemeName());
                    existingMISPayment.setPolicyBranch(misPayment.getPolicyBranch());
                    existingMISPayment.setMemberCode(misPayment.getMemberCode());
                    existingMISPayment.setPayAmount(misPayment.getPayAmount());
                    existingMISPayment.setPayBranch(misPayment.getPayBranch());
                    existingMISPayment.setPayDate(misPayment.getPayDate());
                    existingMISPayment.setPaymentBy(misPayment.getPaymentBy());
                    return misPaymentRepository.save(existingMISPayment);
                }).orElseThrow(() -> new RuntimeException("MIS Payment not found"));
    }

    @Override
    public void deleteMISPayment(Long id) {
        misPaymentRepository.deleteById(id);
    }
}
