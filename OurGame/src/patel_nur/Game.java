package patel_nur;

import java.io.File;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import hsa_new.Console;
public class Game {

	

public static void main(String[] args) {
	    
	String playAgain = "";
	Console c = new Console();
	String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S" };
	int random;
	int i = 1;
	String answer;
	int t = 1;
	// The 18 lines below load the images and gives it the name 
	BufferedImage aloneImage = null;
	BufferedImage benchImage = null;
	BufferedImage followguyImage = null;
	BufferedImage taserImage = null;
	BufferedImage homeImage = null;
	BufferedImage mcdonaldImage = null;
	BufferedImage heroImage = null;
	BufferedImage ripImage = null;
	BufferedImage escapeImage = null;
	BufferedImage pickImage = null;
	BufferedImage hoodImage = null;
	BufferedImage robbedImage = null;
	BufferedImage icecreamImage = null;
	BufferedImage hospitalImage = null;
	BufferedImage fireImage = null;
	BufferedImage insideImage = null;
	BufferedImage fire2Image = null;
	BufferedImage fire3Image = null;
	BufferedImage saveImage = null;
	try{
	do {
		c.clear();
		//output image
		aloneImage = ImageIO.read(new File("6577281447_511f94b248_b-1000x480.jpg"));
	    c.drawImage(aloneImage, 0, 0, c.getWidth(), c.getHeight(), null);
		//program introduction
	    c.println("It's 12 o'clock at night after a long day of work, your phone's dead and you're trying to get home. Your in a bad neighborhood. Do you A(Take the bus)OR B(Walk home). ");
		answer = c.readLine();
		//if user takes the bus
		if (letters[0].equalsIgnoreCase(answer)) {
			c.clear();
			//output image
			benchImage = ImageIO.read(new File("man-on-bench.jpg"));
			c.drawImage(benchImage, 0, 0, c.getWidth(), c.getHeight(), null);
			c.println("The bus driver wakes you up saying this is the last stop but you have no idea where you are. There are no cars in sight. You see a nice man on a bench, do you C(talk to the guy) OR D(go to the nearest McDonalds)");
			answer = c.readLine();
			//if user talks to guy
			if (letters[2].equalsIgnoreCase(answer)) {
				c.clear();
				//outputs image
				followguyImage = ImageIO.read(new File("169714017-56a89e325f9b58b7d0f3a8f9.JPG"));
				c.drawImage(followguyImage, 0, 0, c.getWidth(), c.getHeight(), null);
				c.println("He tells you he forgot his phone in his car. Do you G(Follow him) or H(Say it's ok and walk away)");
				answer = c.readLine();
                //if user follows guy
				if (letters[6].equalsIgnoreCase(answer)) {
					c.clear();
                   //outputs image
					taserImage = ImageIO.read(new File("sddefault.jpg"));
                    c.drawImage(taserImage, 0, 0, c.getWidth(), c.getHeight(), null);
                    c.println("The guy reaches into his car and pulls out a taser and attempts to taze you. Luckily you jump out of the way just in time! You run as fast as you can but still get tazed....You get kidnapped and NEVER get home");
                    c.println(".......Would you like to change your outcome? Type yes to play again");
					//allows user to decide whether to restart or end program
                    playAgain = c.readLine();
				}
                //if user does not follow he guy
				else {
					c.clear();
					//outputs image
					homeImage = ImageIO.read(new File("1158013-exterior.jpg"));
					c.drawImage(homeImage, 0, 0, c.getWidth(), c.getHeight(), null);
					c.println("You walk for one hour and you finally become familiar with where you are, and find you way home");
				    c.println("Would you like to change your outcome? Type yes to play again");
				   //Either ends or restarts game based on users answer
				    playAgain = c.readLine();
				}

			}
            // if user chooses to go to McDonalds
			else if (letters[3].equalsIgnoreCase(answer)) {
				c.clear();
				//outputs image
				mcdonaldImage = ImageIO.read(new File("bank_2244997b.jpg"));
				c.drawImage(mcdonaldImage, 0, 0, c.getWidth(), c.getHeight(), null);
				c.println("As you take a seat a guy in a mask BREAKS into the Mcdonalds with a gun. He tells you to stay put, then turns and walks away. As he walks away do you I(Be a hero and tackle him once he turns around) OR J(Do nothing and wait for him to come back");
				answer = c.readLine();
                //if user wants to tackle guy
				if (letters[8].equalsIgnoreCase(answer)) {
					c.clear();
					random = (int) (Math.random() * 2 + 1);
					//gives user 50% chance of tackling robber successfully
					//if the user successfully tackles the robber
					if (random == 1) {
						//outputs image
						heroImage = ImageIO.read(new File("images.jpg"));
						c.drawImage(heroImage, 0, 0, c.getWidth(), c.getHeight(), null);
						c.println("Congrats! You succesfully tackled him. The cops come and then give you a ride home");
						c.println("Would you like to change your outcome? Type yes to play again");
						playAgain=c.readLine();
                    //if user fails to tackle robber
					} else {
						//outputs image
						ripImage = ImageIO.read(new File("rip-786x305.jpg"));
						c.drawImage(ripImage, 0, 0, c.getWidth(), c.getHeight(), null);
						c.println("You fail and he kills you.");
						c.println("........Would you like to change your outcome? Type yes to play again");
						//allow player to decide to restart or end program
						playAgain = c.readLine();

					}
				// if user doesn't choose to tackle person
				} else if (letters[9].equalsIgnoreCase(answer)) {
					c.clear();
					//output image
					pickImage = ImageIO.read(new File("IVUyUAR.png"));
					c.drawImage(pickImage, 0, 0, c.getWidth(), c.getHeight(), null);
					c.println("He goes up to you and says pick a # between 1-10. I'll give you 4 tries. If you guess right I will let you go and we can forget all about of this but if your wrong.....well, don't guess wrong! HAHA");
                    //loads # 1-10
					random = (int) (Math.random() * 10 + 1);
					//does a loop so user gets 4 chances to guess right
					while (i <= 4 && random != 2) {
                        //reads number inputed by user
						random = Integer.parseInt(c.readLine());
						//if user guesses # correct
						if (random == 2) {
							 //outputs image
							 escapeImage = ImageIO.read(new File("9658485936_64a752632b_b.jpg"));
							 c.drawImage(escapeImage, 0, 0, c.getDrawWidth(), c.getHeight(), null);
							 c.println("Congrats! He lets you go and you find your way home");
							
							
						}
					     //if user guess wrong
						 else if(random != 2 || random !=7 ) {
							c.println("WRONG! HAHA ");
							i = i + 1;
                            //if user reaches 4 tries
							if (i==4){
                        	  c.println("LAST CHANCE.....*puts gun to your head*...choose wisely");
                          }
						
						 }
						 
						 	
					} 
					//allows user to restart
					c.println("....Would you like to change your outcome? Press yes to play again");
					playAgain=c.readLine();
						   
					
				
					}
					}
		}
		    //if you walk
			else if (letters[1].equalsIgnoreCase(answer)) {
				c.clear();
				//outputs image
				hoodImage = ImageIO.read(new File ("b76a29909d9c22f23c93d38e2f82c866.jpg"));
				c.drawImage(hoodImage, 0, 0, c.getWidth(), c.getHeight(), null);
				c.println("You see a group of hoodlums on your way home. Do you E(walk past them) OR F(take the long way home)");
                answer = c.readLine();
				//if you walk past them
                if(letters[4].equalsIgnoreCase(answer)){
					c.clear();
					//output image
					robbedImage = ImageIO.read(new File ("Being-Robbed-at-Gunpoint.jpg"));
					c.drawImage(robbedImage, 0, 0, c.getWidth(), c.getHeight(), null);
					c.println("You end up getting robbed.");	
					 c.println("Would you like to change your outcome? Type yes to play again");
					//allows user to restart or end program
					 playAgain = c.readLine();
				}  
		      //if you take long way
                else if (letters[5].equalsIgnoreCase(answer)){
		    	   c.clear();
		    	  //output image
		    	   icecreamImage = ImageIO.read(new File ("Strawberry_ice_cream_cone_(5076899310).jpg"));
		    	   c.drawImage(icecreamImage, 0, 0, c.getWidth(), c.getHeight(), null);
		    	   c.println("You see an icecream truck giving out free icecream on your way home. Do you K(take some) Or L(Don't take any)");
		    	   answer = c.readLine();
		    	  //if you eat the ice cream
		    	   if(letters[10].equalsIgnoreCase(answer)){
		    	   c.clear();
		    	  //output image
		    	   hospitalImage = ImageIO.read(new File("23743606-Doctor-with-clipboard-examining-patient-s-report-in-hospital-room-Stock-Photo.jpg"));
		    	   c.drawImage(hospitalImage, 0, 0, c.getWidth(), c.getHeight(), null);
		    	   c.println("You get food poisoning and end up in the hospital with your family surronding you.");
		    	   c.println("Would you like to change your outcome? Type yes to play again");
		    	  //if you want to play again
		    	   playAgain=c.readLine();
		    	   }	   
		    	   //if you do not eat ice cream
		    	   else if(letters[11].equalsIgnoreCase(answer)){
		    	  c.clear();
		    	  //output image
		    	  fireImage = ImageIO.read(new File("the_fire_takes_hold_of_the_house_in_glencoe_rd_cro_8556516564.JPG"));
		    	  c.drawImage(fireImage, 0, 0, c.getWidth(), c.getHeight(), null);
		    	   c.println("You get home but see your house on FIRE! Do you M(Go inside and look for your family) OR N(wait outside and call the firefighters)");
		    	   answer = c.readLine();
		    	   //if you go inside
		    	   if(letters[12].equalsIgnoreCase(answer)){
		    			c.clear();
		    	    	//upload image
		    			insideImage = ImageIO.read(new File("1.jpg"));
		    			c.drawImage(insideImage, 0, 0, c.getWidth(), c.getHeight(), null);
		    	    	c.println("You go inside the house and see no one inside. Do you O(check upstairs) OR P(Go to livingroom");
		    		    answer = c.readLine();
		    		   //if you go into living room
		    		    if (letters[15].equalsIgnoreCase(answer)){
		    		    random = (int) (Math.random() * 2 + 1);
		    			//gives 50% of making it out of the living room or collapse	
		    		    //if user makes it out the living room
		    		    if(random ==1){
		    				c.clear();
		    			 	//outputs image
		    				fire2Image = ImageIO.read(new File("2734612538_ac8b8b468f.jpg"));
		    			 	c.drawImage(fire2Image, 0, 0, c.getWidth(), c.getHeight(), null);
		    			 	c.drawImage(fire2Image, 0, 0, c.getWidth(), c.getHeight(), null);
		    				c.println("You walk inside the livingroom but the smoke is too much for you. You collapse and die....");
		    			    c.println("Would you like to change your outcome? Type yes to play again");
		    			   //allows user to restart or end program
		    			    playAgain =  c.readLine();
		    			}
		    			//if user does not make it out the living room
		    		    else {
		    				c.clear();
		    				//outputs image
		    				fire3Image = ImageIO.read(new File("maxresdefault.jpg"));
		    			 	c.drawImage(fire3Image, 0, 0, c.getWidth(), c.getHeight(), null);
		    				c.println("You go in but no one is there. The smoke was too much and you barely manage to get out of the house. The firefighters then save your Dad and Brother but they are severly injured.");
		    				c.println("Would you like to change your outcome? Press yes to play again");
		    				playAgain = c.readLine();
		    			}
		    			}		
		    			//if user goes upstairs
		    		    else if (letters[14].equalsIgnoreCase(answer)){
		    	        c.clear();
		    			c.println("You see no one but can here your dad and brother locked inside your room!You rush to your room! THE FIRE IS ABOUT TO CONSUME YOU AND YOU ONLY GRAB 2 ITEMS TO BREAK THE HANDLE AND SAVE YOUR DAD AND BROTHER. HURRY!");	
		    			c.println("(TYPElETTER>>P(key)");	
		    			c.println(">>Q(bat)");	
		    			c.println(">>R(lockpick)");
		    			c.println(">>S(paperclip)");
		    			//loops twice so user can get 2 tries
		    			while (t<=2) {
		    			answer = c.readLine();
		    			if (letters[15].equalsIgnoreCase(answer)){
		    			c.println("Turns out out the key didn't work.. ");
		    			c.println(">>P(key)");	
		    			c.println(">>Q(bat)");	
		    			c.println(">>R(lockpick)");
		    			c.println(">>S(paperclip)");
		    			}
		    			else if (letters[16].equalsIgnoreCase(answer)) {
		    			c.clear();
		    			c.println("You try to save everyone but the smoke was too strong and causes you to collapse and die.");
		    			c.println(">>P(key)");	
		    			c.println(">>Q(bat)");	
		    			c.println(">>R(lockpick)");
		    			c.println(">>S(paperclip)");
		    			}
		    			else if (letters[17].equalsIgnoreCase(answer)){
		    			c.clear();
		    			c.println("You just remembered, you don't know how to use a lockpick");
		    			c.println(">>P(key)");	
		    			c.println(">>Q(bat)");	
		    			c.println(">>R(lockpick)");
		    			c.println(">>S(paperclip)");
		    			}
		    			
		    			else if (letters[18].equalsIgnoreCase(answer)){
		    			c.clear(); 
		    			
		    			c.println("IT WORKS! Everyone escapes unharmed");
		    		
		    			t = t + 2;
		    			
		    			}
		    			
		    			
		    			}
		    			
		    			}
		    			//allows user to restart or end program
		    		    c.println("Would you like to change your outcome? Type yes to play again");
		    		    playAgain=c.readLine();
		    			
		    	    }  
		    	   //if you decide to stay outside of house 
		    	   else if(letters[13].equalsIgnoreCase(answer)) {
		    	   c.clear();
		    	   saveImage = ImageIO.read(new File("imgID65197412.jpg.gallery.jpg"));
    			 	c.drawImage(saveImage, 0, 0, c.getWidth(), c.getHeight(), null);
		    	    c.println("Your Dad and brother get saved by firefighters but still get severly injured. Luckily your sister and mother were gone at the time.");
		    	   c.println("Would you like to change your outcome? Type yes to play again");
		    		playAgain=c.readLine();
		    	    
		    	    }
		    	
		    	   }
		    		
		       }
		    		
		       
			}			
		    				
    //allows program to play again
	} while (playAgain.equalsIgnoreCase("yes"));
	//catches errors with pictures
	} catch (Exception e){
		e.printStackTrace();
	}
	}

}