package org.example;

/*Dentro de cada componente es donde se agrega la logica y una vez que termine de ejecutar la logica llama al mediador
* para notificarle que ya termino de ejecutar su logica, asi el mediador decide cual es el siguiente paso*/
public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
