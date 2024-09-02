package org.example;

/*Este mediador simula solo un modo de edición, pero con los mismos componentes que manejar el otro mediador*/
public class ViewModeMediator implements Mediator {
    private Button button;
    private TextBox textBox;

    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")) {
            System.out.println("Botón pulsado en modo visualización. Cambiando al modo edición...");
            textBox.enable();
        } else if (sender == textBox && event.equals("input")) {
            System.out.println("El Cuadro de texto esta desactivado porque esta en modo visualización");

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
