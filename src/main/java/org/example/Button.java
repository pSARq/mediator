package org.example;

public class Button extends Component {

    public Button(Mediator mediator) {
        super(mediator);
    }

    /*Dentro del método iria la logica del botón, en este ejemplo simplemente se le notifica
    * al mediador de que este componente fue ejecutado*/
    public void click() {
        this.mediator.notify(this, "click");
    }
}
