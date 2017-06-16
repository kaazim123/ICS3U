package patel;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior {
private boolean suppress = false;
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		suppress = false;
		Motor.B.forward();
		Motor.C.forward();
		while(!suppress){
			Thread.yield();

		}
		Motor.B.stop();
		Motor.C.stop();        

	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}
