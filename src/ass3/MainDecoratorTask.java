package ass3;

// Base interface
interface TextEditor {
    String write();
}
// Concrete component (plain text)
class SimpleText implements TextEditor {
    public String write() {
        return "This is plain text.";
    }
}
// Abstract decorator
abstract class TextDecorator implements TextEditor {
    protected TextEditor editor;
    public TextDecorator(TextEditor editor) {
        this.editor = editor;
    }
    public String write() {
        return editor.write();
    }
}
// Bold decorator
class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextEditor editor) {
        super(editor);
    }
    public String write() {
        return "<b>" + super.write() + "</b>";
    }
}
// Italic decorator
class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextEditor editor) {
        super(editor);
    }
    public String write() {
        return "<i>" + super.write() + "</i>";
    }
}
// Client code
public class MainDecoratorTask {
    public static void main(String[] args) {
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);
        System.out.println(plainText.write()); // Output: This is plain text.
        System.out.println(boldText.write()); // Output: <b>This is plain text.</b>
        System.out.println(italicBoldText.write()); // Output: <i><b>This is plain text.</b></i>
    }
}
