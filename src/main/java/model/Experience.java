package model;
public class Experience extends Localidade{
    private String cargo;
    private String nomeEmpresa;
    private boolean ocupacaoAtual;
    private String descricao;

    public Experience(Long id, String nome, String uF, String cargo, 
    String nomeEmpresa, boolean ocupacaoAtual, String descricao) {
        super(id, nome, uF);
        this.cargo = cargo;
        this.nomeEmpresa = nomeEmpresa;
        this.ocupacaoAtual = ocupacaoAtual;
        this.descricao = descricao;
    }
    public enum TipoEmprego{
    TEMPO_INTERGRAL,MEIO_PERIODO,AUTONOMO,
    FREELANCE,TEMPORARIO,ESTAGIARIO,APRENDIZ,INTERMITENTE,TERCEIRIZADO,TRAINEE;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(final String cargo) {
        this.cargo = cargo;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(final String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public boolean isOcupacaoAtual() {
        return ocupacaoAtual;
    }

    public void setOcupacaoAtual(final boolean ocupacaoAtual) {
        this.ocupacaoAtual = ocupacaoAtual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    
}