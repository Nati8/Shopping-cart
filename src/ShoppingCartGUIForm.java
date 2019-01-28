import javax.swing.*;

public class ShoppingCartGUIForm extends JFrame{
    private JButton add;
    private JTextArea myTextArea;
    private JPanel rootPanel;

    public ShoppingCartGUIForm(){
        add(rootPanel);
        setTitle("Shopping Cart");
        setSize(600, 400);
        setDefaultCloseOperation(ShoppingCartGUIForm.EXIT_ON_CLOSE);
    }
}
