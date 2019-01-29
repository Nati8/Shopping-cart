import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailsPanel extends JPanel{
    public DetailsPanel(){
        Dimension size = getPreferredSize();
        size.width = 600;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("Foodland"));


        final String[][] productsString = {{"Select product", "Apple", "Banana", "Cucumber", "Watermelon"}};
        JComboBox products = new JComboBox(productsString[0]);

        DefaultListModel modelSelectedProducts = new DefaultListModel();
        JList selectedProducts = new JList(modelSelectedProducts);

        selectedProducts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        selectedProducts.setLayoutOrientation(JList.VERTICAL);
        selectedProducts.setVisibleRowCount(-1);

        JLabel billLabel = new JLabel();

        JButton addProducts = new JButton("Add");
        final double[] bill = {0};
        addProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String product = (String)products.getSelectedItem();

                switch (product){
                        case "Apple":modelSelectedProducts.addElement("Apple"); break;
                        case "Banana":modelSelectedProducts.addElement("Banana"); break;
                        case "Cucumber":modelSelectedProducts.addElement("Cucumber"); break;
                        case "Watermelon":modelSelectedProducts.addElement("Watermelon"); break;
                    }

                switch (product){
                    case "Apple": bill[0] = bill[0] + 2.5; break;
                    case "Banana":
                        bill[0] = bill[0] + 3.5; break;
                    case "Cucumber":
                        bill[0] = bill[0] + 2.5; break;
                    case "Watermelon":
                        bill[0] = bill[0] + 2.5; break;
                }
                billLabel.setText(String.valueOf(bill[0]));
            }
        });

        JButton removeProducts = new JButton("Remove");

        removeProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = (String)selectedProducts.getSelectedValue();
                switch (selectedProduct){
                    case "Apple":modelSelectedProducts.removeElement("Apple"); break;
                    case "Banana":modelSelectedProducts.removeElement("Banana"); break;
                    case "Cucumber":modelSelectedProducts.removeElement("Cucumber"); break;
                    case "Watermelon":modelSelectedProducts.removeElement("Watermelon"); break;
                }
                switch (selectedProduct){
                    case "Apple": bill[0] = bill[0] - 2.5; break;
                    case "Banana":
                        bill[0] = bill[0] - 3.5; break;
                    case "Cucumber":
                        bill[0] = bill[0] - 2.5; break;
                    case "Watermelon":
                        bill[0] = bill[0] - 2.5; break;
                }
                billLabel.setText(String.valueOf(bill[0]));
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 0.5;
        gc.weighty = 0.5;

        gc.gridx = 0;
        gc.gridy = 0;
        add(products, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        add(selectedProducts, gc);

        gc.gridx = 2;
        gc.gridy = 0;
        add(billLabel, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 0;
        gc.gridy = 1;
        add(addProducts, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(removeProducts, gc);

    }
}
