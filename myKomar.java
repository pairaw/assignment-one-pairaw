package kustUniversity;

import java.util.Scanner;

public class myKomar {

	public static void main(String[] args) {
		//first we call student class
		student a=new student();
		student b=new student();
		student c=new student();
		student d=new student();
		student w=new student();
		//I created scanner in order the person can add his/her information
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name ");
		a.setName(input.nextLine());
		System.out.println("enter your komar ID");
		a.setID(input.nextLine());
		System.out.println("enter your department ");
		a.setDepartment(input.nextLine());
		System.out.println("write the money you want to pay for this semester in dollar $");
		a.setBalance(input.nextInt());
		
		System.out.println("add the corsess \t"+"maximum corses to take is \"4\"");
		
		Scanner inp=new Scanner(System.in);
		System.out.println("write the frist corse");
		w.setCourse(inp.nextLine());
		System.out.println("write the 2nd corse"+"if you do not want to take press  enter");
		b.setCourse(inp.nextLine());
		System.out.println("write the 3rd corse"+"if you do not want to take press  enter");
		c.setCourse(inp.nextLine());
		System.out.println("write the 4th corse"+"if you do not want to take press  enter");
		d.setCourse(inp.nextLine());
		
		
		//--------------------------------------------------
		//I printed the informations that given
		System.out.println("\n\n\t"+"-----------------------------"+"\n");
		System.out.println("\'your genaral infomation and added courses for this semester\'"
							+"\n"+ "your name is\t\t"+a.getName()
							+"\n"+ "your ID is\t\t"+a.getID()
							+"\n"+ "yourdepartment is\t"+a.getDepartment()
							+"\n"+  "your balance is\t\t"+a.getBalance()+"$"
							+"\n"+"\'your added corse\'\n" + w.getCourse()+"\t"+ "\t"+b.getCourse()+"\t"+ "\t" + c.getCourse()+"\t"+ "\t"+d.getCourse()
							+"\n");
		
		//--------------------------------------------------
		//by using if else concept I created program to drop 2 of privies courses
		
				System.out.println("\n\n\t"+"-----------------------------"+"\n");
				System.out.println("you able to drop only \"two\" courses");
				System.out.println("if you want to drop first course write name of the course ");
				Scanner in=new Scanner(System.in);
				String drop=in.nextLine();
				
				// since we have different objects, same value to comparing ,so we have to use  object.equals(object) not (object==object)
				
				if(drop.equals(w.getCourse()))
				{			System.out.println("drop 2nd course  , if you dont want press enter");
					        String drop2=in.nextLine();
							{
								if(drop2.equals(b.getCourse()))
									{
										System.out.println("your corsess is updated successfully");
										System.out.println( c.getCourse()+"\t"+ "\t"+d.getCourse());
							        }
									
									else if(drop2.equals(c.getCourse())) 
									{
										System.out.println("your corsess is updated successfully");
										System.out.println( b.getCourse()+"\t"+ "\t"+d.getCourse());
									}
									else if(drop2.equals(d.getCourse())) 
									{
										System.out.println("your corsess is updated successfully");
										System.out.println( "\t" + b.getCourse()+"\t"+ "\t"+c.getCourse());
									}
									else if (drop2.equals("")) {
										System.out.println("your corsess is updated successfully");
										System.out.println(b.getCourse()+"\t"+ "\t" + c.getCourse()+"\t"+ "\t"+d.getCourse());
										System.out.println("thanks");
									}
									else {
										System.out.println("you did not droped the added corse or you did not write it in a correct way");
									}};
				}
				else if(drop.equals(b.getCourse())) 
				{
					System.out.println("drop 2nd course  , if you don not want press enter");
			        String drop2=in.nextLine();
					{

							if(drop2.equals(w.getCourse()))
							{
								System.out.println("your corsess is updated successfully");
								System.out.println( c.getCourse()+"\t"+ "\t"+d.getCourse());
						    }
							
							else if(drop2.equals(c.getCourse())) 
							{
								System.out.println("your corsess is updated successfully");
								System.out.println( w.getCourse()+"\t"+ "\t"+d.getCourse());
							}
							else if(drop2.equals(d.getCourse())) 
							{
								System.out.println("your corsess is updated successfully");
								System.out.println( "\t" + w.getCourse()+"\t"+ "\t"+c.getCourse());
							}
							else if (drop2.equals("")) {
								System.out.println("your corsess is updated successfully");
								System.out.println(w.getCourse()+"\t"+ "\t" + c.getCourse()+"\t"+ "\t"+d.getCourse());
								System.out.println("thanks");
							}
							else {
								System.out.println("you did not droped the added corse or you did not write it in a correct way");
							}};
				}
				else if(drop.equals(c.getCourse())) 
				{
					System.out.println("drop 2nd course  , if you don not want press enter");
					String drop2=in.nextLine();
					
					{
								if(drop2.equals(b.getCourse()))
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( w.getCourse()+"\t"+ "\t"+d.getCourse());
								}
								
								else if(drop2.equals(w.getCourse())) 
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( b.getCourse()+"\t"+ "\t"+d.getCourse());
								}
								else if(drop2.equals(d.getCourse())) 
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( "\t" + w.getCourse()+"\t"+ "\t"+b.getCourse());
								}
								else if (drop2.equals("")) {
									System.out.println("your corsess is updated successfully");
									System.out.println(w.getCourse()+"\t"+ "\t" + b.getCourse()+"\t"+ "\t"+d.getCourse());
									System.out.println("thanks");
								}
								else {
									System.out.println("you did not droped the added corse or you did not write it in a correct way");
								}};
					
					
					
				}
				else if(drop.equals(d.getCourse())) 
				{		
					System.out.println("drop 2nd course  , if you don not want press enter");
					String drop2=in.nextLine();
					{
								if(drop2.equals(b.getCourse()))
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( w.getCourse()+"\t"+ "\t"+c.getCourse());
								}
								
								else if(drop2.equals(w.getCourse())) 
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( b.getCourse()+"\t"+ "\t"+c.getCourse());
								}
								else if(drop2.equals(c.getCourse())) 
								{
									System.out.println("your corsess is updated successfully");
									System.out.println( "\t" + w.getCourse()+"\t"+ "\t"+b.getCourse());
								}
								else if (drop2.equals("")) {
									System.out.println("your corsess is updated successfully");
									System.out.println(w.getCourse()+"\t"+ "\t" + b.getCourse()+"\t"+ "\t"+c.getCourse());
									System.out.println("thanks");
								}
								else {
									System.out.println("you did not droped the added corse or you did not write it in a correct way");
								}};
				}
				
			}

}