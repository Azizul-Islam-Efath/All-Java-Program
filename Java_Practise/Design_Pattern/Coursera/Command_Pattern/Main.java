public class Main {
    public static void main(String[] args) {
        // Create receiver
        TextEditor editor = new TextEditor();

        // Create commands
        Command bold = new BoldCommand(editor);
        Command italic = new ItalicCommand(editor);

        // Create invoker
        TextEditorInvoker invoker = new TextEditorInvoker();

        // Execute Bold
        invoker.setCommand(bold);
        invoker.pressButton();

        // Execute Italic
        invoker.setCommand(italic);
        invoker.pressButton();
    }
}
