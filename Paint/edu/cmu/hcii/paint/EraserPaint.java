package edu.cmu.hcii.paint;
import java.awt.*;

public class EraserPaint extends PencilPaint {

    public void setColor(Color color) {
        this.color = Color.white;
        
    }
    
    public void setThickness(int thickness) {
    	// Respect requested thickness instead of forcing a fixed size
    	this.thickness = thickness;
    	
    }
  
}
