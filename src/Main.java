//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Hlavní metoda aplikace.
     * <p>
     * This method prints "Hello world!" to the console and demonstrates
     * basic usage of comments and a loop.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world!");

        //main(args);

        // komentář - řádkový

        System.out.println(/*komentář*/"Ahoj");
        /*
         * komentář - blokový
         *
         * další řádek
         */

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}