package semana6;

public class PessoaJuridica {

    private String nomeFantasia;
    private String cnpj;
    private String endereco;
    private String telefone;

    public PessoaJuridica(String nomeFantasia, String cnpj, String endereco, String telefone) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private boolean isCnpjValido(String cnpj){
        return true;
    }
}
