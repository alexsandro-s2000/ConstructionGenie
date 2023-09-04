package com.genie.construction.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Alvenaria {
    private int codTipoConstrucao;

    private String Espessura;
    private String Comprimento;
    private String Altura;
/*
    private float Espessura;
    private float Comprimento;
    private float Altura;
*/

    public Alvenaria (JSONObject jp) {
        try {
            //id
            Integer numero = (int) jp.get("codTipoConstrucao");
            this.setCodTipoConstrucao(numero);
            //nome
            this.setAltura((String) jp.get("Altura"));
            //nome
            this.setEspessura((String) jp.get("Espessura"));
            //nome
            this.setComprimento((String) jp.get("Comprimento"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Alvenaria () {
        this.setCodTipoConstrucao(0);
        this.setEspessura("0");
        this.setAltura("0");
        this.setComprimento("0");
    }


    public JSONObject toJsonObject() {
        JSONObject json = new JSONObject();
        try {
            json.put("codTipoConstrucao", this.codTipoConstrucao);
            json.put("Espessura", this.Espessura);
            json.put("Comprimento", this.Comprimento);
            json.put("Altura", this.Altura);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json;
    }

//metodos
    void setCodTipoConstrucao(int tc){
        this.codTipoConstrucao = tc;
    }

    int getCodTipoConstrucao(){
        return this.codTipoConstrucao;
    }

    public String getEspessura(){return this.Espessura;}
    public String getComprimento(){return this.Comprimento;}
    public String getAltura(){return this.Altura;}



    public void setAltura(String alt){
        if (alt.length() < 3){ this.Altura = "A definir"; }
        else { this.Altura = alt; }
    }
    public void setEspessura(String espess){
        if (espess.length() < 3){ this.Espessura = "A definir"; }
        else { this.Espessura = espess; }
    }
    public void setComprimento(String compr){
        if (compr.length() < 3){ this.Comprimento = "A definir"; }
        else { this.Comprimento = compr; }
    }
    /*
    void setEspessura(float espe){
        if (espe < 0.001){
            this.espe = (float)0.001;
        }
        else {
            this.espe = espe;
        }
    }
    float getEspessura(){
        return this.Espessura;
    }
    void setAltura( altu){
        if (altu < 0.001){
            this.altu = (float)0.001;
        }
        else {
            this.altu = altu;
        }
    }
    float getAltura(){
        return this.Altura;
    }
*/

}
