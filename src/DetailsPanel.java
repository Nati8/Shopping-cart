import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel{
    public DetailsPanel(){
        Dimension size = getPreferredSize();
        size.width = 600;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("Foodland"));

        JComboBox products = new JComboBox();
        products.addItem("Select product");
        products.addItem("Banana");
        products.addItem("Apple");
        products.addItem("Watermelon");
        products.addItem("Cucumber");


        DefaultListModel modelSelectedProducts = new DefaultListModel();
        JList selectedProducts = new JList(modelSelectedProducts);

        selectedProducts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        selectedProducts.setLayoutOrientation(JList.VERTICAL);
        selectedProducts.setVisibleRowCount(-1);

        modelSelectedProducts.addElement("Apple");
        modelSelectedProducts.addElement("App,lewle");
        modelSelectedProducts.addElement("Aldql;pple");

        DefaultListModel modelBill = new DefaultListModel();
        JList bill = new JList(modelBill);

        bill.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        bill.setLayoutOrientation(JList.VERTICAL);
        bill.setVisibleRowCount(-1);

        modelBill.addElement(5.5);
        modelBill.addElement(6.5);
        modelBill.addElement(4);

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

//        JLabel nameLabel = new JLabel("Name: ");
//        JLabel occupationLabel = new JLabel("Occupation: ");
//        JTextField nameField = new JTextField(10);
//        JTextField occupationField = new JTextField(10);
//        JButton addButton = new JButton("ADD2");
//
//        gc.gridx = 0;
//        gc.gridy = 1;
//        add(occupationLabel, gc);
//
//
//
//        gc.gridx = 1;
//        gc.gridy = 1;
//        add(occupationField, gc);
    }
}
