package pokedex;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Pokedex {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Pokedex, para começar escolha uma das opções abaixo:");
        int opcao;
        
        Cadastro meuCadastro;
        meuCadastro = new Cadastro();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("1 - Cadastrar Pokemon");
            System.out.println("2 - Listar Pokemons");
            System.out.println("3 - Consultar dados de um pokemon");
            System.out.println("4 - Excluir um pokemon");
            System.out.println("5 - Criar uma pokebola");
            System.out.println("6 - Excluir uma pokebola");
            System.out.println("7 - Cadastrar uma nova habilidade");
            System.out.println("8 - Associar uma habilidade a um pokemon");
            System.out.println("9 - Excluir uma habilidade existente");
            System.out.println("10 - Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: 
                    System.out.println("Digite um nome para o pokemon:");
                    String nomePokemon;
                    nomePokemon = entrada.next();
                    System.out.println("Digite uma quantidade de pontos de vida para o pokemon:");
                    double healthPoints;
                    healthPoints = entrada.nextDouble();
                    System.out.println("Digite um tipo para o pokemon:");
                    String tipo;
                    tipo = entrada.next();
                    System.out.println("Digite peso para o pokemon:");
                    double peso;
                    peso = entrada.nextDouble();
                    System.out.println("Digite uma altura para o pokemon:");
                    double altura;
                    altura = entrada.nextDouble(); 
                    Pokemon meuPokemon = new Pokemon(nomePokemon, healthPoints, tipo, peso, altura); 
                    meuCadastro.addPokemon(meuPokemon);
                    break; 
                    
                case 2: 
                    for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                        List listaParaPercorrer = meuCadastro.getListaDePokemons();
                        Pokemon pokemonParaImprimir = (Pokemon) listaParaPercorrer.get(i);
                        System.out.println(pokemonParaImprimir.getNome());
                    }
                    break;
                    
                case 3 : 
                    System.out.println("Digite o nome do pokemon que deseja consultar os dados");
                    nomePokemon = entrada.next();
                    if (meuCadastro.contemPokemon(nomePokemon)){ 
                    for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                      Pokemon pokemonParaImprimir = (Pokemon) meuCadastro.getPokemon(i);
                      if (nomePokemon.equals(pokemonParaImprimir.getNome())){
                            System.out.println("Pokemon Encontrado. Dados:");
                            System.out.print("Nome:");
                            System.out.println(pokemonParaImprimir.getNome());
                            System.out.print("HP:");
                            System.out.println(pokemonParaImprimir.gethealthPoints());
                            System.out.print("Tipo:");
                            System.out.println(pokemonParaImprimir.getTipo());
                            System.out.print("Peso:");
                            System.out.println(pokemonParaImprimir.getPeso());
                            System.out.print("Altura:");
                            System.out.println(pokemonParaImprimir.getAltura());
                            System.out.println("Habilidades:");
                            
                            
                            for (int u=0; u < pokemonParaImprimir.getNumeroDeHabilidades(); u++){
                                Habilidade habilidadeParaImprimir = pokemonParaImprimir.getHabilidade(u);
                                System.out.println(habilidadeParaImprimir.getNome());
                                
                                
                            }
                        } 
                    }    
                    } else {
                            System.out.println("Este pokemon não existe no cadastro.");
                            }   
                    break;
                case 4 : 
                    System.out.print("Digite o nome do pokemon que deseja remover:");
                    nomePokemon = entrada.next();
                    if (meuCadastro.contemPokemon(nomePokemon)){
                      for (int i=0 ; i <= meuCadastro.getNumeroDePokemons(); i++){
                        Pokemon pokemonParaRemover = (Pokemon) meuCadastro.getPokemon(i);
                        if (nomePokemon.equals(pokemonParaRemover.getNome())){
                            meuCadastro.removePokemon(nomePokemon); 
                        }  
                    } 
                    } else {
                            System.out.println("Este pokemon não existe no cadastro.");
                            } 
                    
                    break;
                case 5 : 
                    System.out.println("Digite o tipo de pokebola a ser inserido");
                    String tipoDePokebola = entrada.next();
                    System.out.println("Digite o nivel maximo de Pokemon que esta pokebola pode conter");
                    int nivelMaximo = entrada.nextInt();
                    
                    Pokebola novaPokebola = new Pokebola(tipoDePokebola, nivelMaximo);
                    
                    
                    
                    
                    System.out.println("Pokebola criada com sucesso!");
                    
                    
                    
                    
                    
                    
                    
                    break;
                case 6 : 
                    
                    break;
                case 7 : 
                    System.out.println("Digitar um nome para a habilidade a ser cadastrada:");
                    String nomeHabilidade;
                    nomeHabilidade = entrada.next();
                    System.out.println("Digite um tipo para esta habilidade:");
                    String tipoHabilidade;
                    tipoHabilidade = entrada.next();
                    System.out.println("Digite um dano base para esta habilidade:");
                    int danoBase;
                    danoBase = entrada.nextInt();
                    Habilidade novaHabilidade = new Habilidade (nomeHabilidade, tipoHabilidade, danoBase);
                    meuCadastro.addHabilidade(novaHabilidade);
                    System.out.println("Habilidade adicionada com sucesso");
                    break;
                case 8 :
                    System.out.println("Escolha o pokemon ao qual deseja adicionar a habilidade:");
                    for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                        List listaParaPercorrer = meuCadastro.getListaDePokemons();
                        Pokemon pokemonParaImprimir = (Pokemon) listaParaPercorrer.get(i);
                        System.out.println(pokemonParaImprimir.getNome());
                    }
                    String pokemonEscolhido = entrada.next();
                    System.out.println("Escolha a habilidade que deseja adicionar à este pokemon:");
                    for (int i=0 ; i < meuCadastro.getNumeroDeHabilidades(); i++){
                        List listaParaPercorrer = meuCadastro.getListaDeHabilidades();
                        Habilidade habilidadeParaImprimir = (Habilidade) listaParaPercorrer.get(i);
                        System.out.println(habilidadeParaImprimir.getNome());
                    }
                    String habilidadeEscolhida = entrada.next();
                    
                    meuCadastro.associarPokemonComHabilidade(pokemonEscolhido, habilidadeEscolhida);
                    
                    
                    
                    
                    
                    
                    break;
                    
                case 9 : 
                    
                    System.out.print("Digite o nome da habilidade que deseja remover:");
                    nomeHabilidade = entrada.next();
                    if (meuCadastro.contemHabilidade(nomeHabilidade)){
                      for (int i=0 ; i <= meuCadastro.getNumeroDeHabilidades(); i++){
                        Habilidade habilidadeParaRemover = (Habilidade) meuCadastro.getHabilidade(i);
                        if (nomeHabilidade.equals(habilidadeParaRemover.getNome())){
                            meuCadastro.removeHabilidade(nomeHabilidade); 
                        }  
                    } 
                    } else {
                            System.out.println("Esta habilidade não existe no cadastro.");
                            } 
                    
                    
                    
                    
                    
                    
                    
                    break;

            } 
        } while (opcao != 10);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
