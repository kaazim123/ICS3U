package patel;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class IsRedBall implements Behavior {


	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S1);
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(light.readValue() <= 50){
			return true;
		}
		return false;
	}
	
	public void action(){
		Motor.A.stop();
		Motor.B.stop();
		Motor.C.rotate(90);
	}

}