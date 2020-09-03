package model;

public class Cliente extends Experience{
    private String sobre;
    private String cargoAtual;
    private String email;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;    
    private boolean visibilidadePerfil;


    public Cliente(Long id, String nome, String uF, String cargo, String nomeEmpresa, boolean ocupacaoAtual,
            String descricao, String sobre, String cargoAtual, String email, String endereco, String complemento,
            String bairro, String cidade, boolean visibilidadePerfil) {
        super(id, nome, uF, cargo, nomeEmpresa, ocupacaoAtual, descricao);
        this.sobre = sobre;
        this.cargoAtual = cargoAtual;
        this.email = email;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.visibilidadePerfil = visibilidadePerfil;
    }
    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isVisibilidadePerfil() {
        return visibilidadePerfil;
    }

    public void setVisibilidadePerfil(boolean visibilidadePerfil) {
        this.visibilidadePerfil = visibilidadePerfil;
    }

    



}
