package br.com.minhaempresa.infrastructure.ws;

public class RecebimentoProcessoEletronicoFault extends RuntimeException {

    public RecebimentoProcessoEletronicoFault() {
        super();
    }

    public RecebimentoProcessoEletronicoFault(String message) {
        super(message);
    }

    public RecebimentoProcessoEletronicoFault(String message, Throwable cause) {
        super(message, cause);
    }
}
