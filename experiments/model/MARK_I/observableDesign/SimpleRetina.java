package model.MARK_I.observableDesign;

import java.util.Observable;
import model.MARK_I.VisionCell;

public class SimpleRetina extends Observable {
    private VisionCell visionCell;

    public SimpleRetina() {
	this.visionCell = new VisionCell();
    }

    public VisionCell getVisionCells() {
	return this.visionCell;
    }

    public void seeBMPImage(String blackOrWhite) {
	if (blackOrWhite.equals("black")) {
	    this.visionCell.setActiveState(true);
	    System.out.println("set visionCell to true in SimpleRetina");
	} else {
	    this.visionCell.setActiveState(false);
	    System.out.println("set visionCell to false in SimpleRetina");
	}
	this.setChanged();
	this.notifyObservers(blackOrWhite);
    }
}
