package StreamsAPI;

public class Produto {
    private String produto;
    private int quantidade;
    private double preco;
    private boolean qualidadeAnuncio;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isQualidadeAnuncio() {
        return qualidadeAnuncio;
    }

    public void setQualidadeAnuncio(boolean qualidadeAnuncio) {
        this.qualidadeAnuncio = qualidadeAnuncio;
    }


    public Produto(String produto, int quantidade, double preco, boolean qualidadeAnuncio) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.qualidadeAnuncio = qualidadeAnuncio;
    }
}
