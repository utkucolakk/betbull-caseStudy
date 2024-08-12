package com.example.football.dto;

public class TransferDTO {
    private Long id;
    private Long playerId;
    private Long fromTeamId;
    private Long toTeamId;
    private double transferFee;
    private String transferDate;

    public TransferDTO() {
    }

    public TransferDTO(Long id, Long playerId, Long fromTeamId, Long toTeamId, double transferFee, String transferDate) {
        this.id = id;
        this.playerId = playerId;
        this.fromTeamId = fromTeamId;
        this.toTeamId = toTeamId;
        this.transferFee = transferFee;
        this.transferDate = transferDate;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getFromTeamId() {
        return fromTeamId;
    }

    public void setFromTeamId(Long fromTeamId) {
        this.fromTeamId = fromTeamId;
    }

    public Long getToTeamId() {
        return toTeamId;
    }

    public void setToTeamId(Long toTeamId) {
        this.toTeamId = toTeamId;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
}
