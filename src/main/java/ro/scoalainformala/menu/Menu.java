package ro.scoalainformala.menu;

public class Menu {
    public static String createMenu() {
        return """
        Select a geometrical shape:
                        
        1 Triangle
        2 Rectangle
        3 Square
        4 Circle
        5 Exit
                        
        Please select one of the available options ( 1 - 5 ):
        """;
    }
}
