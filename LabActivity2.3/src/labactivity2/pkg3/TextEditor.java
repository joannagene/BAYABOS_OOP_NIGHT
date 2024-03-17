
package labactivity2.pkg3;

import java.util.Stack;
import java.util.Scanner;

class TextEditor {
    private String text;

    public TextEditor(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String newText) {
        this.text += newText;
    }

    public void delete(int n) {
        if (n <= text.length()) {
            this.text = this.text.substring(0, this.text.length() - n);
        }
    }
}
