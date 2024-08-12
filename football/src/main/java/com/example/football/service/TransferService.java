package com.example.football.service;

import com.example.football.model.Transfer;
import com.example.football.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    public List<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }

    public Optional<Transfer> getTransferById(Long id) {
        return transferRepository.findById(id);
    }

    public Transfer createTransfer(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public Transfer updateTransfer(Long id, Transfer transfer) {
        transfer.setId(id);
        return transferRepository.save(transfer);
    }

    public void deleteTransfer(Long id) {
        transferRepository.deleteById(id);
    }
}
