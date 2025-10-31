package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List <Figura> figuras;

    public Imagem(){
        this.figuras = new ArrayList<Figura>();
    }
    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras){
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasEncontradas= new ArrayList<>();
        for (Figura f : figuras){
            if (f.calcularArea() > 20){
                figurasEncontradas.add(f);
            }
        }
        return figurasEncontradas;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<Figura>();

        for (Figura figura : figuras){

            if (figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }
        return quadrados;
    }

}
