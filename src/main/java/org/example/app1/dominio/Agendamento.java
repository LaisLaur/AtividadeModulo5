package org.example.app1.dominio;

import java.time.LocalDate;

public class Agendamento {

    private String identificadorAgendamento;
    private LocalDate dataHoraAgendamento;

    public String getIdentificadorAgendamento() {
        return identificadorAgendamento;
    }

    public void setIdentificadorAgendamento(String identificadorAgendamento) {
        this.identificadorAgendamento = identificadorAgendamento;
    }

    public LocalDate getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(LocalDate dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }
}
