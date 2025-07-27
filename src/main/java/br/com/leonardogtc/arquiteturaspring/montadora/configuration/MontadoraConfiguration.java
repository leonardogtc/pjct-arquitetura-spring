package br.com.leonardogtc.arquiteturaspring.montadora.configuration;

import br.com.leonardogtc.arquiteturaspring.montadora.Motor;
import br.com.leonardogtc.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Configuração da Montadora.
 * Esta classe é responsável por definir as configurações específicas da montadora.
 * Pode incluir beans, propriedades e outras configurações necessárias para o funcionamento da montadora.
 * A anotação @Configuration indica que esta classe contém definições de beans que serão gerenciados pelo Spring.
 */
@Configuration
public class MontadoraConfiguration {
    /**
     * Cria um bean do tipo Motor.
     * Este método é anotado com @Bean, o que indica ao Spring que ele deve
     * gerenciar a instância retornada como um bean dentro do contexto da aplicação.
     * O bean Motor pode ser injetado em outras classes que necessitam de um motor
     * para funcionar corretamente, como os carros da montadora.
     * @return Uma instância do tipo Motor.
     */
    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setModelo("XPTO-01");
        motor.setCilindrada(5);
        motor.setCavalos(100);
        motor.setTipoMotor(TipoMotor.FLEX);
        motor.setLitragem(1.0);
        return motor;
    }

    @Bean
    public Motor motorEletico() {
        var motor = new Motor();
        motor.setModelo("XPTO-02");
        motor.setCilindrada(5);
        motor.setCavalos(100);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setLitragem(1.0);
        return motor;
    }

    @Bean
    public Motor motorDiesel() {
        var motor = new Motor();
        motor.setModelo("XPTO-03");
        motor.setCilindrada(5);
        motor.setCavalos(100);
        motor.setTipoMotor(TipoMotor.DIESEL);
        motor.setLitragem(1.0);
        return motor;
    }
}
