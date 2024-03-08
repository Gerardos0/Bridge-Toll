import java.lang.Math;

import java.util.Random;

import java.util.Scanner;

public class bridgeToll{

    public static void main(String[] args){

	//Set Scanner
	Scanner scan = new Scanner(System.in);

	//Set Random
	Random rand =new Random();

	//Create a random value for the number of vehicles
	int n_cars = rand.nextInt(3)+1;

	//initializing i and all_passengers
	int i, all_passengers;

	//initialize car_type_fee and car_size_fee
	double car_type_fee, car_size_fee;

	//initializing total as 0 for the end of the for loop
	double total=0;

	//Prompt user to enter the value for passenger_fee
	System.out.println("Enter a value for passenger fee: ");
	int passenger_fee = scan.nextInt();

	//Validate that the value is positive
	while(passenger_fee<0){
		System.out.println("Enter a positive value for passenger fee: ");
		passenger_fee=scan.nextInt();
	}

	//Prompt user to input car size fee for a small vehicle
	System.out.println("Enter a value for car size fee for a small sized vehicle: ");
	int car_size_fee_small = scan.nextInt();

	//Validate that the car_size_fee_small is positve
	while(car_size_fee_small<0){
		System.out.println("Enter a positive value for a small sized vehicle, car size fee: ");
		car_size_fee_small=scan.nextInt();
	}
	//Prompt user to input car size fee for a medium vehicle
	System.out.println("Enter a value for car size fee for a medium sized vehicle: ");
	int car_size_fee_medium = scan.nextInt();

	//Validate that the car_size_fee_medium is positve
	while(car_size_fee_medium<0){
		System.out.println("Enter a positive value for a medium sized vehicle, car size fee: ");
		car_size_fee_medium=scan.nextInt();
	}

	//Prompt user to input car size fee for a large vehicle
	System.out.println("Enter a value for car size fee for a large sized vehicle: ");
	int car_size_fee_large = scan.nextInt();

	//Validate that the car_size_fee_large is positve
	while(car_size_fee_large<0){
		System.out.println("Enter a positive value for a large sized vehicle, car size fee: ");
		car_size_fee_large=scan.nextInt();
	}

	//Prompt user to input car size fee for a extra-large vehicle
	System.out.println("Enter a value for car size fee for a extra-large sized vehicle: ");
	int car_size_fee_el = scan.nextInt();

	//Validate that the car_size_fee_el is positve
	while(car_size_fee_el<0){
		System.out.println("Enter a positive value for a extra-large sized vehicle, car size fee: ");
		car_size_fee_el=scan.nextInt();
	}

	//Prompt user to input car type fee for a commercial vehicle
	System.out.println("Enter a value for car type fee for a commercial vehicle: ");
	int car_type_fee_commercial = scan.nextInt();

	//Validate that the car_type_fee_commercial is positve
	while(car_type_fee_commercial<0){
		System.out.println("Enter a positive value for a commercial vehicle, car type fee: ");
		car_type_fee_commercial=scan.nextInt();
	}

	//Prompt user to input car type fee for a passenger vehicle
	System.out.println("Enter a value for car type fee for a passenger vehicle: ");
	int car_type_fee_passenger = scan.nextInt();

	//Validate that the car_type_fee_passenger is positve
	while(car_type_fee_passenger<0){
		System.out.println("Enter a positive value for a passenger vehicle, car type fee: ");
		car_type_fee_passenger=scan.nextInt();
	}

	//For loop to prompt user for values for each vehicle, and then to find total for each fast pass, then add all fast pass together.
	for(i=0;i<n_cars;i++){

		//Prompt user to put what car they have
		System.out.println("Enter a car type in a numeric form. Small car (1), medium car (2), large car (3), extra-large car (4): ");
		int car_size = scan.nextInt();

		//Validate that the value give is betwee 1-4
		while(car_size <1 || car_size >4){
			System.out.println("Enter a valid number for what car size you have.  Small car (1), medium car (2), large car (3), extra-large car (4): ");
			car_size = scan.nextInt();
		}

		if(car_size==1){

			//Establish if the car_type is a commercial vehicle or passenger vehicle
			System.out.println("Enter car type, commercial vehicle(1) or passenger vehicle (2): ");
			int car_type=scan.nextInt();

			//Validate input
			while(car_type<1 || car_type>2){
				System.out.println("Enter a valid car type, commercial vehicle(1) or passenger vehicle (2): ");
				car_type=scan.nextInt();
			}

			//Assign the proper fee for the car type
			if(car_type==1){
				car_type_fee=car_type_fee_commercial;
			}

			else{
				car_type_fee=car_type_fee_passenger;
			}	
		
			//Set car_size_fee as the values of car_size_fee_small
			car_size_fee=car_size_fee_small;
			System.out.println("Enter number of passengers: ");
			all_passengers = scan.nextInt();

			while(all_passengers <1 || all_passengers> 5){
				System.out.println("Enter a number between 1-5: ");
				all_passengers = scan.nextInt();
			}

			//Prompt user to enter the number of passengers under 18 
			System.out.println("Enter number of passengers under 18: ");
			int under_18 = scan.nextInt();

			//Validate that the value is positive and does not supass the amount of passengers
			while(under_18<0 || under_18 >all_passengers-1){
				System.out.println("Enter a valid number of passengers under 18: ");
				under_18=scan.nextInt();
			}
			//Prompt user to enter the weight of the vehicle
			System.out.println("Enter the weight of your vehicle: ");
			int weight = scan.nextInt();

			//I was unsure what the minimum value for the weight should be so i made it 0 so that weight is positive
			while(weight<0){
				System.out.println("Enter a valid weight for your vehicle: ");
				weight=scan.nextInt();
			}

			//Setting passengers under as 0.75 of a person accounts for the discout they have.
			//Finding the total cost for a fast pass per car
			double each_car_cost =((all_passengers-under_18)*passenger_fee +((under_18*passenger_fee)*(25/100)))/car_size_fee_large + Math.pow(weight,(.5))+car_type_fee;

			//Finding the total cost of all the fast passes.
			total =total+each_car_cost;

		}
		if(car_size==2){
			//Establish if the car_type is a commercial vehicle or passenger vehicle
			System.out.println("Enter car type, commercial vehicle(1) or passenger vehicle (2): ");
			int car_type=scan.nextInt();
			//Validate input
			while(car_type<1 || car_type>2){
				System.out.println("Enter a valid car type, commercial vehicle(1) or passenger vehicle (2): ");
				car_type=scan.nextInt();
			}
			//Assign the proper fee for the car type
			if(car_type==1){
				car_type_fee=car_type_fee_commercial;
			}
			else{
				car_type_fee=car_type_fee_passenger;
			}
			//Set car_size_fee as the values of car_size_fee_medium
			car_size_fee=car_size_fee_medium;
			System.out.println("Enter number of passengers: ");
			all_passengers = scan.nextInt();
			while(all_passengers <1 || all_passengers >8){
				System.out.println("Enter a number between 1-8: ");
				all_passengers = scan.nextInt();
			}
				//Prompt user to enter the number of passengers under 18 
			System.out.println("Enter number of passengers under 18: ");
			int under_18 = scan.nextInt();
			//Validate that the value is positive and does not supass the amount of passengers
			while(under_18<0 || under_18 >all_passengers-1){
				System.out.println("Enter a valid number of passengers under 18: ");
				under_18=scan.nextInt();
			}
			//Prompt user to enter the weight of the vehicle
			System.out.println("Enter the weight of your vehicle: ");
			int weight = scan.nextInt();
			//I was unsure what the minimum value for the weight should be so i made it 0 so that weight is positive
			while(weight<0){
				System.out.println("Enter a valid weight for your vehicle: ");
				weight=scan.nextInt();
			}
			//Setting passengers under as 0.75 of a person accounts for the discout they have.
			//Finding the total cost for a fast pass per car
			double each_car_cost =((all_passengers-under_18)*passenger_fee +((under_18*passenger_fee)*(25/100)))/car_size_fee_large + Math.pow(weight,(.5))+car_type_fee;
			//Finding the total cost of all the fast passes.
			total =total+each_car_cost;
		}
		if(car_size==3){
			//Establish if the car_type is a commercial vehicle or passenger vehicle
			System.out.println("Enter car type, commercial vehicle(1) or passenger vehicle (2): ");
			int car_type=scan.nextInt();
			//Validate input
			while(car_type<1 || car_type>2){
				System.out.println("Enter a valid car type, commercial vehicle(1) or passenger vehicle (2): ");
				car_type=scan.nextInt();
			}
			//Assign the proper fee for the car type
			if(car_type==1){
				car_type_fee=car_type_fee_commercial;
			}
			else{
				car_type_fee=car_type_fee_passenger;
			}
			//Set car_size_fee as the values of car_size_fee_large
			car_size_fee=car_size_fee_large;
			System.out.println("Enter number of passengers: ");
			all_passengers = scan.nextInt();
			while(all_passengers <1 || all_passengers >30){
				System.out.println("Enter a number between 1-30: ");
				 all_passengers = scan.nextInt();
			}
			//Prompt user to enter the number of passengers under 18 
			System.out.println("Enter number of passengers under 18: ");
			int under_18 = scan.nextInt();
			//Validate that the value is positive and does not supass the amount of passengers
			while(under_18<0 || under_18 >all_passengers-1){
				System.out.println("Enter a valid number of passengers under 18: ");
				under_18=scan.nextInt();
			}
			//Prompt user to enter the weight of the vehicle
			System.out.println("Enter the weight of your vehicle: ");
			int weight = scan.nextInt();
			//I was unsure what the minimum value for the weight should be so i made it 0 so that weight is positive
			while(weight<0){
				System.out.println("Enter a valid weight for your vehicle: ");
				weight=scan.nextInt();
			}
			//Setting passengers under as 0.75 of a person accounts for the discout they have.
			double each_car_cost =((all_passengers-under_18)*passenger_fee +((under_18*passenger_fee)*(25/100)))/car_size_fee_large + Math.pow(weight,(.5))+car_type_fee;
			//Finding the total cost of all the fast passes.
			total =total+each_car_cost;
		}
		if(car_size==4){
			//Establish if the car_type is a commercial vehicle or passenger vehicle
			System.out.println("Enter car type, commercial vehicle(1) or passenger vehicle (2): ");
			int car_type=scan.nextInt();
			//Validate input
			while(car_type<1 || car_type>2){
				System.out.println("Enter a valid car type, commercial vehicle(1) or passenger vehicle (2): ");
				car_type=scan.nextInt();
			}
			//Assign the proper fee for the car type
			if(car_type==1){
				car_type_fee=car_type_fee_commercial;
			}
			else{
				car_type_fee=car_type_fee_passenger;
			}
			//Set car_size_fee as the values of car_size_fee_el
			car_size_fee=car_size_fee_el;
			System.out.println("Enter number of passengers: ");
			all_passengers = scan.nextInt();
			while(all_passengers<1 || all_passengers>3){
				System.out.println("Enter a number between 1-3: ");
				 all_passengers = scan.nextInt();
			}
			//Prompt user to enter the number of passengers under 18 
			System.out.println("Enter number of passengers under 18: ");
			int under_18 = scan.nextInt();
			//Validate that the value is positive and does not supass the amount of passengers
			while(under_18<0 || under_18 >all_passengers-1){
				System.out.println("Enter a valid number of passengers under 18: ");
				under_18=scan.nextInt();
			}
			//Prompt user to enter the weight of the vehicle
			System.out.println("Enter the weight of your vehicle: ");
			int weight = scan.nextInt();
			//I was unsure what the minimum value for the weight should be so i made it 0 so that weight is positive
			while(weight<0){
				System.out.println("Enter a valid weight for your vehicle: ");
				weight=scan.nextInt();
			}
			//Setting passengers under as 0.75 of a person accounts for the discout they have.
			//Finding the total cost for a fast pass per car
			double each_car_cost =((all_passengers-under_18)*passenger_fee +((under_18*passenger_fee)*(25/100)))/car_size_fee_large + Math.pow(weight,(.5))+car_type_fee;
			//Finding the total cost of all the fast passes.
			total =total+each_car_cost;
		}	
		
	}
	//Print the total revenue
	System.out.println("The total revenue for the fast pass is: "+ total);
    }
}
