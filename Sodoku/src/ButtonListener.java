import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton)e.getSource();
//        switch(clickedButton.getText()) {
//            case "Solve":
//
//        }

        if (clickedButton.getText().equals("Solve")) {
            new Thread(()->{
            	MainWindow.game.solve(MainWindow.game.getGrid(), 0, 0);
            }).start();
        }
    }
}
