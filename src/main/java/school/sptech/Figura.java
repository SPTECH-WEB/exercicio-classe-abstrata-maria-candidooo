package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;


    public abstract Double calcularArea();

    @Override
    public String toString(){
        return "Cor: " + cor + "Espessura: " + espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
