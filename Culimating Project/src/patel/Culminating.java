package patel;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Culminating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Behavior b1 = new EndProgram();
				Behavior b2 = new DriveForward();
				Behavior b3 = new IsRedBall();
				Behavior b4 = new DriveForward();
				
				Behavior[] bs = {b1, b2, b3, b4};
				Arbitrator ab = new Arbitrator(bs);
				ab.start();

			}

		}