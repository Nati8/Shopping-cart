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

        String[] productsString = {"Select product","Apple","Banana","Cucumber","Watermelon"};
        JComboBox products = new JComboBox(productsString);
        
        DefaultListModel modelSelectedProducts = new DefaultListModel();
        JList selectedProducts = new JList(modelSelectedProducts);

        selectedProducts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        selectedProducts.setLayoutOrientation(JList.VERTICAL);
        selectedProducts.setVisibleRowCount(-1);

        modelSelectedProducts.addElement("Apple");

        DefaultListModel modelBill = new DefaultListModel();
        JList bill = new JList(modelBill);

        bill.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        bill.setLayoutOrientation(JList.VERTICAL);
        bill.setVisibleRowCount(-1);

        modelBill.addElement(5.5);
        modelBill.addElement(6.5);
        modelBill.addElement(4);

        JButton addProducts = new JButton("Add");

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
        add(bill, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 0;
        gc.gridy = 1;
        add(addProducts, gc);

    }
}
