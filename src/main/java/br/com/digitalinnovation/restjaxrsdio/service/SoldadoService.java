package br.com.digitalinnovation.restjaxrsdio.service;

import br.com.digitalinnovation.restjaxrsdio.dto.Soldado;
import br.com.digitalinnovation.restjaxrsdio.request.SoldadoEditRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Flecha");

        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void editarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {
    }

    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flecha");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("987654321");
        soldado2.setNome("Paloma");
        soldado2.setRaca("Elfa");
        soldado2.setArma("Arco e Flecha");

        return Arrays.asList(soldado1, soldado2);
    }
}
