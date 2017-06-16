package patel;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;


public class EndProgram implements Behavior {

		private boolean suppressed = false;
		
		public void suppress(){
			suppressed = true;
		}
		
		public boolean takeControl(){
			if(Button.ESCAPE.isDown()){
				return true;
			}
			return false;
		}
		
		public void action(){
			Motor.A.stop();
			Motor.B.stop();
		}

	}
