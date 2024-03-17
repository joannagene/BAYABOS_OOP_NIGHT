package labactivity2.pkg3;

import java.util.Scanner;
public class LabActivity23 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();

        TextEditor editor;
     switch (editorType) {
         case 1 -> editor = new PrintTextEditor(initialText);
         case 2 -> editor = new AdvancedTextEditor(initialText);
         default -> {
             System.out.println("Invalid editor type.");
             return;
         }
     }

        System.out.print("Enter code: ");
        int code = scanner.nextInt();

        if (code == 2) {
            editor.append("New Text");
        } else if (code == 2 && editor instanceof AdvancedTextEditor) {
            ((AdvancedTextEditor) editor).undo();
        } else {
            System.out.println("SUCCESS");
            return;
        }

        if (editor instanceof PrintTextEditor printTextEditor) {
            printTextEditor.print();
        } else {
            System.out.println(editor.getText());
        }

        System.out.println("SUCCESS");
    }
}