package org.example;

/*Aqui puedo agregar todos los metodos que necesite que mi mediador ejecute*/
public interface Mediator {
    void notify(Component sender, String event);
    void setButton(Button button);
    void setTextBox(TextBox textBox);
}
