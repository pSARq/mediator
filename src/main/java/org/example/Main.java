package org.example;

public class Main {
    public static void main(String[] args) {
        /*El patron de diseño se usa para desacoplar clases que están anidadas fuertemente y que se ve beneficioso
        * separarlas. He tratado de buscar varios ejemplos, pero por lo general veo que se usa el patron
        * cuando hay varios componentes de tipo GUI entonces ayuda a gestionar mejor la comunicación de estos.
        * Pero en ejemplo de Back casi no he encontrado, se puede usar igualmente para reducir el acoplamiento
        * entre clases */

//      Modo edición
        Mediator editModeMediator = new EditModeMediator();
        Button editButton = new Button(editModeMediator);
        TextBox editTextBox = new TextBox(editModeMediator);

        editModeMediator.setButton(editButton);
        editModeMediator.setTextBox(editTextBox);

//      Simulando una entrada de texto
        editTextBox.setText("Editando texto...");
        editButton.click();

        System.out.println("");

//      Modo visualización
        Mediator viewModeMediator = new ViewModeMediator();
        Button viewButton = new Button(viewModeMediator);
        TextBox viewTextBox = new TextBox(viewModeMediator);

        viewModeMediator.setButton(viewButton);
        viewModeMediator.setTextBox(viewTextBox);

        viewTextBox.disable();
        viewTextBox.setText("Intentando editar en modo visualización...");
        viewButton.click();

    }
}