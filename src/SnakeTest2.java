import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SnakeTest2 {
	String direccion = "RIGHT";
	boolean gameOver = false;
	 
	@Test
	void test() {
		class Teclas extends java.awt.event.KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {

				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {

					if(direccion != "LEFT") {
	                    direccion = "RIGHT";

					}
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					if(direccion != "RIGHT") {
	                    direccion = "LEFT";
					}
				} else if(e.getKeyCode() == KeyEvent.VK_UP) {
					if(direccion != "DOWN") {
	                    direccion = "UP";
					}
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(direccion != "UP") {
	                    direccion = "DOWN";
					}				
				
				} else if(e.getKeyCode() == KeyEvent.VK_N) {
	                gameOver = false;
	                startGame();				
				}
			}

		
			 public void startGame() {
					        
			    }
}
	}



@Test
void test1() {
	
}

public class Momento extends Thread {
		
		private long last = 0;
		
		public Momento() {
			
		}
		

		
	public void  run() {
		int longitud = 2;

	    int width = 640;
	    int height = 480;
		 Point snake = (1,0);
		 int widthPoint = 10;
		   int heightPoint = 10;
		long frequency = 30;
		while(true) {
			if((java.lang.System.currentTimeMillis() - last) > frequency) {
				if(!gameOver) {

                    if(direccion == "RIGHT") {
                        snake.x = snake.x + widthPoint;
                        if(snake.x > width) {
                            snake.x = 0;
                        }
                    } else if(direccion == "LEFT") {
                        snake.x = snake.x - widthPoint;
                        if(snake.x < 0) {
                            snake.x = width - widthPoint;
                        }                        
                    } else if(direccion == "UP") {
                        snake.y = snake.y - heightPoint;
                        if(snake.y < 0) {
                            snake.y = height;
                        }                        
                    } else if(direccion == "DOWN") {
                        snake.y = snake.y + heightPoint;
                        if(snake.y > height) {
                            snake.y = 0;
                        }                        
                    }
                }
                actualizar();
				
				last = java.lang.System.currentTimeMillis();
			}
		}
	}
			public void actualizar() {

		        

			}
		}
		
		
		
		public static void main(String[] args) {
			Snake snake1 = new Snake();
		}
	
}



