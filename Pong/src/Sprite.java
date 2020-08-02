public class Sprite {

	private int xPosition, yPosition, xVelocity, yVelocity, width, height, initialXPosition, initialYPosition;
	
	public int getXPosition() { return xPosition; }
	public int getYPosition() { return yPosition; }
	public int getXVelocity() { return xVelocity; }
	public int getYVelocity() { return yVelocity; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	      
	
	public void setInitialPosition(int initialX, int initialY) {
	       initialXPosition = initialX;
	       initialYPosition = initialY;
	 }
	       
	 public void resetToInitialPosition() {
	       setXPosition(initialXPosition);
	       setYPosition(initialYPosition);
	 }
	
	
	public void setXPosition(int newX, int panelWidth) {
	          if (xPosition<0) {
	        	  newX = 0;
	          }
	          else if(xPosition + width > panelWidth) {
	              xPosition = panelWidth - width;
	          }
	}
	
	public void setYPosition(int newY, int panelHeight) {
		 	  if (yPosition<0) {
		 		  	newY = 0;
         }
         else if(yPosition + height > panelHeight) {
             yPosition = panelHeight - height;
         } 
	}
	      
	public void setXVelocity(int newXVelocity) {
	          xVelocity = newXVelocity;
	}
	      
	public void setYVelocity(int newYVelocity) {
	          yVelocity = newYVelocity;
	}
	      
	public void setWidth(int newWidth) {
	          width = newWidth;
	}
	      
	public void setHeight(int newHeight) {
	          height = newHeight;
	}

}
