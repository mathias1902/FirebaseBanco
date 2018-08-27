package com.example.opet.firebasebanco;

import java.sql.Array;

/**
 * Created by opet on 27/08/2018.
 */

public class User {
    private String Nome;
    private String DataNasc;
    private Array[] NivelGrad;
    private String IdiomaNativo;

    public User(String nome) {

    }

    public User(String nome, String dataNasc, Array[] nivelGrad, String idiomaNativo) {
        Nome = nome;
        DataNasc = dataNasc;
        NivelGrad = nivelGrad;
        IdiomaNativo = idiomaNativo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public Array[] getNivelGrad() {
        return NivelGrad;
    }

    public void setNivelGrad(Array[] nivelGrad) {
        NivelGrad = nivelGrad;
    }

    public String getIdiomaNativo() {
        return IdiomaNativo;
    }

    public void setIdiomaNativo(String idiomaNativo) {
        IdiomaNativo = idiomaNativo;
    }
}