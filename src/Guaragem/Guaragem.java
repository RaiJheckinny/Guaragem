package Guaragem;

import java.util.LinkedList;
import java.util.List;

public class Guaragem<T extends Veiculo>{
    private String nome;
    private Integer cordenada;
    T guaragem;
    private List<T> veiculos;
    public Guaragem(String nome, Integer cordenada){
        veiculos = new LinkedList<>();
        this.nome = nome;
        this.cordenada = cordenada;
    }
    public void addGuaragem(T ... elements){
        for(T element : elements){
            veiculos.add(element);
        }
    }
    public void removeFistListGuaragem(){
        veiculos.removeFirst();
    }
    public void imprimirListGuaragem(){
        System.out.println("__________________________________________________ ");
        for(T element : veiculos){
            System.out.println(element.getMarca());
        }
        System.out.println("__________________________________________________ ");
    }
}
