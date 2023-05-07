package org.designPatterns.behavioral.memento;
// Редактор текста
public class DemoMemento {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello world!");
        TextEditorMemento memento = textEditor.save(); // Сохраняем состояние

        textEditor.setText("Goodbye world!"); // Редактируем текст
        System.out.println(textEditor.getText()); // Выводит "Goodbye world!"

        textEditor.restore(memento); // Восстанавливаем состояние
        System.out.println(textEditor.getText()); // Выводит "Hello world!"

    }
}
