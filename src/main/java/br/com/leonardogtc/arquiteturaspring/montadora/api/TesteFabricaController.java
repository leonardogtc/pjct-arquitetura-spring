package br.com.leonardogtc.arquiteturaspring.montadora.api;

import br.com.leonardogtc.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller para testes da fábrica de carros.
 *
 * Este controller pode ser usado para expor endpoints REST que interajam com a
 * lógica de criação de carros, motores, chaves, etc.
 * A anotação @RestController indica que esta classe é um controlador Spring
 * que manipula requisições HTTP e retorna respostas diretamente no corpo da
 * resposta, geralmente em formato JSON.
 */
@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        // Lógica para ligar o carro
        // Aqui você pode chamar os serviços necessários para ligar o carro
        // Exemplo: carroService.ligar(carroId);
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
