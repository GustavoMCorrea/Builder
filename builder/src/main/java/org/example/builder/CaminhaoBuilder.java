package org.example.builder;

import java.util.Date;

public class CaminhaoBuilder {

    private Caminhao caminhao;

    public CaminhaoBuilder(){
        caminhao = new Caminhao();
    }

    public Caminhao build(){
        if(caminhao.getChassi().equals("")){
            throw new IllegalArgumentException("Numeração do Chassi inválida");
        }
        if(caminhao.getPlaca().equals("")){
            throw new IllegalArgumentException("Numeração da Placa inválida");
        }
        return caminhao;
    }

    public CaminhaoBuilder setModelo(String modelo) {
        caminhao.setModelo(modelo);
        return this;
    }

    public CaminhaoBuilder setMarca(String marca) {
        caminhao.setMarca(marca);
        return this;
    }

    public CaminhaoBuilder setAnoFabricacao(Date anoFabricacao) {
        caminhao.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public CaminhaoBuilder setCor(String cor) {
        caminhao.setCor(cor);
        return this;
    }

    public CaminhaoBuilder setCargaMaxima(double cargaMaxima) {
        caminhao.setCargaMaxima(cargaMaxima);
        return this;
    }

    public CaminhaoBuilder setPlaca(String placa) {
        caminhao.setPlaca(placa);
        return this;
    }

    public CaminhaoBuilder setChassi(String chassi) {
        caminhao.setChassi(chassi);
        return this;
    }

    public CaminhaoBuilder setTipoCombustivel(String tipoCombustivel) {
        caminhao.setTipoCombustivel(tipoCombustivel);
        return this;
    }

    public CaminhaoBuilder setProprietario(String proprietario) {
        caminhao.setProprietario(proprietario);
        return this;
    }

    public CaminhaoBuilder setEnderecoProprietario(String enderecoProprietario) {
        caminhao.setEnderecoProprietario(enderecoProprietario);
        return this;
    }



}
