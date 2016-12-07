package pokedex;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    //atributos
    private String nome;
    private double healthPoints;
    private String tipo;
    private double peso;
    private double altura;
    private List listaDeHabilidades;
    
    //construtor
public Pokemon(String nome, double HP, String tipo, double peso,double altura) {
    this.nome = nome;
    this.healthPoints = HP;
    this.tipo = tipo;
    this.peso = peso;
    this.altura = altura;
    listaDeHabilidades = new ArrayList();
}
    //metodos
public String getNome(){
    return this.nome;
}

public double gethealthPoints(){
    return this.healthPoints;
}

public String getTipo(){
    return this.tipo;
}

public double getPeso(){
    return this.peso;
}

public double getAltura(){
    return this.altura;
}

public void addHabilidade(Habilidade abilityToAdd){
        listaDeHabilidades.add(abilityToAdd);
    }

public Habilidade getHabilidade (int i){
        Habilidade habilidadeParaDevolver = (Habilidade) listaDeHabilidades.get(i);
        return habilidadeParaDevolver; 
    }

public List getListaDeHabilidades(){
        return listaDeHabilidades;
    }

public int getNumeroDeHabilidades(){
        return listaDeHabilidades.size();
    }

public void removeHabilidade(String abilityToRemove){
        for (int i=0 ; i <= this.getNumeroDeHabilidades(); i++){
            Habilidade habilidadeParaRemover = this.getHabilidade(i);
            if (abilityToRemove.equals(habilidadeParaRemover.getNome())){
                boolean remove = listaDeHabilidades.remove(habilidadeParaRemover);
            }
        } 
    }
    
    public boolean contemHabilidade (String abilityToSearch){
        for (int i=0 ; i < this.getNumeroDeHabilidades(); i++){
            Habilidade habilidadeParaVerificar = this.getHabilidade(i);
            if (abilityToSearch.equals(habilidadeParaVerificar.getNome())){
                return true;
            }
        } return false;
    } 


}
