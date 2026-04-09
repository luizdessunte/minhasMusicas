package br.com.alura.minhasMusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricão;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricão() {
        return descricão;
    }

    public void setDescricão(String descricão) {
        this.descricão = descricão;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() >500) {
            return 10;

        } else {
            return 8;
        }
    }


}
