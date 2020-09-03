package model;

public class Localidade {
    private Long id;
    private String nome;
    private String UF;
    
    public Localidade(Long id, String nome, String uF) {
        this.id = id;
        this.nome = nome;
        UF = uF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

}
