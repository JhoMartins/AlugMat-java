/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugmat;

/**
 *
 * @author Jhonatan
 */
public class Produto {
    private int id;
    private String descricao;
    private int cd_interno;
    private float valor_diaria;
    private String caracteristicas;
    private int cd_marca;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the cd_interno
     */
    public int getCd_interno() {
        return cd_interno;
    }

    /**
     * @param cd_interno the cd_interno to set
     */
    public void setCd_interno(int cd_interno) {
        this.cd_interno = cd_interno;
    }

    /**
     * @return the valor_diaria
     */
    public float getValor_diaria() {
        return valor_diaria;
    }

    /**
     * @param valor_diaria the valor_diaria to set
     */
    public void setValor_diaria(float valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the cd_marca
     */
    public int getCd_marca() {
        return cd_marca;
    }

    /**
     * @param cd_marca the cd_marca to set
     */
    public void setCd_marca(int cd_marca) {
        this.cd_marca = cd_marca;
    }
}
