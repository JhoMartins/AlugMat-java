/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugmat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public int procurarMarcaID(String nome) {
        int id = 0;
        try {
            Connection con = Conexao.Conectar();
            
            String sql = "SELECT id FROM MARCA WHERE DESCRICAO = ? LIMIT 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                id =  rs.getInt("id");
            } 
            return id;
        }
        catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        return id;
    }
    
    public String procurarMarcaNome() {
        String descricao = "";
        try {
            Connection con = Conexao.Conectar();
            
            String sql = "SELECT descricao FROM MARCA WHERE ID = ? LIMIT 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cd_marca);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                descricao =  rs.getString("descricao");
            } 
            return descricao;
        }
        catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        return descricao;
    }
    
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
