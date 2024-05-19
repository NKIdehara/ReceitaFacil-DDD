package br.edu.infnet.receitafacil.ReceitaFacil.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.receitafacil.ReceitaFacil.model.Receita;

public class ReceitaRepository {
    private static List<Receita> receitas;

    public ReceitaRepository() {
        if(receitas == null){
            receitas = new ArrayList<>();

            // TESTES
            receitas.add(new Receita(0, "Arroz", "Lavar o arroz; colocar sal; cozinhar por 30 minutos.", "- 1 xícara de arroz\\n- 1/2 colher de sal"));
            receitas.add(new Receita(1, "Carne", "Temperar a carne; assar até dourar.", "- 1 bife\\n- tempero a gosto"));
            receitas.add(new Receita(2, "Macarrão", "Cozinhar o macarrão; escorrer e colocar o molho.", "- 500g de macarrão\\n- 1 lata de molho de tomate"));
        }
    }

    public List<Receita> getAll(){
        return receitas;
    }

    public Receita getById(int id){
        return receitas.stream().filter(receita -> receita.getId() == id).findFirst().orElse(null);
    }

    public void add(Receita receita){
        receitas.add(receita);
    }

    public void update(int id, Receita receita){
        int i = 0;
        for(Receita r: receitas){
            if(id == r.getId()){
                receitas.set(i, receita);
                break;
            }
            i++;
        }
    }

    public void delete(int id){
        int i = 0;
        for(Receita r: receitas){
            if(id == r.getId()){
                receitas.remove(i);
                break;
            }
            i++;
        }
    }
}
