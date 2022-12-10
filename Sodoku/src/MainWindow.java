import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainWindow {
    public static SudokuGame game;
    private static Timer timer;
    public MainWindow()  {
    	game = new SudokuGame();
    }

    public static void main(String[] args) {
// Deceleration of components
    	new MainWindow();
        JFrame Frame = new JFrame();
        JPanel gamePanel = new JPanel();
        JPanel actionPanel = new JPanel();
        JLabel Label = new JLabel("/t/t/t/t/t/tWelcome to Game");
        JButton NewGame =  new JButton("New Game");
        JButton Rule =  new JButton("Rule");
        JButton Solve =  new JButton("Solve");


// Frame
        Frame.setTitle("Suduku Game");
        Frame.setSize(700,750);
        Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        Frame.setLocationRelativeTo(null);
        game.setSize(800, 800);




// Panel
        //ActionPanel

        actionPanel.setLayout(new GridLayout(1,3));
        actionPanel.setBackground(Color.GRAY);

        //GamePanel

        gamePanel.setLayout(new GridLayout(10,5));
        gamePanel.setBackground(Color.DARK_GRAY);


// Button
        NewGame.setFont(new Font("Arial", Font.BOLD, 18)); //NewGame

        Solve.setFont(new Font("Arial", Font.BOLD, 18));   //Solve

        Rule.setFont(new Font("Arial", Font.BOLD, 18));    //Rule


        Rule.addActionListener(new ButtonListener());

        NewGame.addActionListener(new ButtonListener());

        Solve.addActionListener(new ButtonListener());





// Adding components


        actionPanel.add(NewGame);
        actionPanel.add(Rule);
        actionPanel.add(Solve);
        Frame.add(actionPanel,BorderLayout.SOUTH);
        Frame.add(gamePanel, BorderLayout.CENTER);
        Frame.add(game);
        Frame.setVisible(true);

        // Refresh screen at approx 60Hz
        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                game.repaint();
            }
        });

//        new Thread(game).start();
//        game.solve(game.getGrid(), 0, 0);
    }


}


