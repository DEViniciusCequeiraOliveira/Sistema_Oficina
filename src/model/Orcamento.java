package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Orcamento {
    private int id_orcamento;
    private String CpfCliente;
    private String CpfMecanico;
    private String valor;
    private String serviços;

    /*public Orçamento(String CpfCliente, String CpfMecanico, Double valor, String serviços) {
        this.CpfCliente = CpfCliente;
        this.CpfMecanico = CpfMecanico;
        this.valor = valor;
        this.serviços = serviços;
    }*/

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente) {
        this.CpfCliente = CpfCliente;
    }

    public String getCpfMecanico() {
        return CpfMecanico;
    }

    public void setCpfMecanico(String CpfMecanico) {
        this.CpfMecanico = CpfMecanico;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getServiços() {
        return serviços;
    }

    public void setServiços(String serviços) {
        this.serviços = serviços;
    }
    
    public int getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(int id_orcamento) {
        this.id_orcamento = id_orcamento;
      }
}