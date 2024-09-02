package org.example;

public class TextBox extends Component {
    private String text;
    private boolean enabled = true;

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    /*En este otro componente se agrega una logica adicional, como validar de que el cuadro de texto este
    * habilitado para permitir insertar el texto y luego notifica al mediador. En caso de estar desabilitado
    * simplemente no deja insertar el texto*/
    public void setText(String text) {
        if (enabled) {
            this.text = text;
            mediator.notify(this, "input");
        } else {
            System.out.println("El Cuadro de texto está deshabilitado");
        }
    }

    public String getText() {
        return text;
    }

    public void enable() {
        this.enabled = true;
        System.out.println("Cuadro de texto habilitado");
    }

    public void disable() {
        this.enabled = false;
        System.out.println("Cuadro de texto deshabilitado");
    }

}
