import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;

    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());

        JButton addProducts = new JButton("Add");

        detailsPanel = new DetailsPanel();

        Container cont = getContentPane();
        cont.add(addProducts, BorderLayout.SOUTH);
        cont.add(detailsPanel);


//        addProducts.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
    }
}
