package org.example;

/*Este mediador simula una edición manejando los componentes boton y caja de texto*/
public class EditModeMediator implements Mediator {
    private Button button;
    private TextBox textBox;

    /*Dentro de cada mediator no debe ir logica de negocio, la única responsabilidad del mediator es coordinar el
    * llamado entre componente para que estos realicen la logica necesaria*/
    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")) {
            /*Aquí se puede hacer el llamado de un componente en donde realice la logica necesaria para guardar el texto
            * ya sea en una base de datos, un archivo .txt, etc. Lo importante es que el mediator no le interesa como hacerlo
            * sino que a quien llamar para que lo haga*/
            System.out.println("Botón pulsado en modo edición. Guardando texto...");
        } else if (sender == textBox && event.equals("input")) {
            System.out.println("Texto guardado: " + textBox.getText());
        }
    }

    @Override
    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }
}
