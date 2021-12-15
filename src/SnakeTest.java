import static org.junit.jupiter.api.Assertions.*;



import javax.swing.JFrame;

import org.junit.jupiter.api.Test;
import javax.swing.*;


class SnakeTest {

	@Test
	void testJFrame() {
class Snake extends JFrame{
	    int width = 640;
	    int height = 480;

	 
	 public Snake() {
			
	    setTitle("Snake");
        setSize(width,height);
		 setVisible(true);
	     
	    }
	
	 public void main (String[] args) throws Exception {
		 
		 Snake s = new Snake();
	 }
   } 
	}
}



