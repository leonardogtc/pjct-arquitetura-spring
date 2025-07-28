package br.com.leonardogtc.arquiteturaspring.montadora.api;

import br.com.leonardogtc.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    /** A anotação @Autowired é usada para injetar dependências automaticamente pelo Spring.
        Neste caso, estamos injetando um bean do tipo Motor, que foi definido na
        configuração da montadora (MontadoraConfiguration).
    */
    @Autowired
    /**
     * O Qualifier é usado para especificar qual implementação do Motor deve ser
     * injetada quando há múltiplas implementações disponíveis.
     * Neste caso, estamos injetando o motor elétrico.
     */
    @Flex
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
