import javax.swing.*;

public class ShoppingCart {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ShoppingCartGUIForm shoppingCartGUIForm = new ShoppingCartGUIForm();
                shoppingCartGUIForm.setVisible(true);
            }
        });


    }
}
