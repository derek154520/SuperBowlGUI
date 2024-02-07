import java.awt.event.*;  
import javax.swing.*;  

public class GUI{

	public void runGUI() throws Exception{
    final GameList game2 = new GameList();
    
		JFrame f=new JFrame("Superbowl Data");  
		final JTextField tf=new JTextField();  
		tf.setBounds(225,55, 100,20);  

    JButton b1=new JButton("Number of wins:");
    b1.setBounds(50,50,150, 30);
		JButton b2=new JButton("Order by Year"); 
		b2.setBounds(50,100,200, 30); 
		JButton b3=new JButton("Order by Winning team");  
		b3.setBounds(50,150,200,30); 
    JButton b4=new JButton("Order by point Spread");
    b4.setBounds(50,200,200,30); 

		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String textFieldValue = tf.getText();
			  System.out.println(game2.numWins(textFieldValue));
			}
		}); 

    b2.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){
        game2.sortByYear();
        System.out.println(game2.getSuperBowls());
        }  
    });

    b3.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){
        game2.sortByWinningTeam();
        System.out.println(game2.getSuperBowls());
      }  
    });
    
    b4.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){
        game2.sortByPointDifferential();
        System.out.println(game2.getSuperBowls());
        }  
    });
    
		f.add(tf);
		f.add(b1);
		f.add(b2);  
    f.add(b3);
    f.add(b4);
		f.setSize(400,600);  
		f.setLayout(null);  
		f.setVisible(true); 
	}
}