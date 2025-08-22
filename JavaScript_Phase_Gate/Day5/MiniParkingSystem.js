/**
=> This program represents a car park as rows and columns.
=> Each of the row is the line for parking car while the column is the specific position where the car is parked in a specific line.
=> In the car park, an empty space is 0 while a space parked with a car is 1.
=> Create a function to check if there is space in the car park or not.
=> Create a function that displays all the available spaces in the car park.
=> A user can specify the specific position they want, and if the position is available: The car is parked; else: "This space is not available."
=> A car can enter the parking lot if there’s a free slot. The car enters at the first available space from the right. If there is no free space, it should display: "There is no vailable space."
=> Also a car can leave the parking lot by specifying the specific slot position.
=> There should also be a function that allows the user to exit the program.
=> Arrange all the functions into cases to ensure easy navigation for the user.
**/



const prompt = require('prompt-sync')();

let parkingLot = [[1, 1, 1, 1, 1], [0, 1, 1, 1, 1], [0, 1, 1, 1, 1], [1, 1, 1, 1, 1]];
let parkingLotNumber = [1, 1];

let parkingLotOptions = true;
while(parkingLotOptions) {
	const displayOptions = `
		1. See if there is available space
		2. See all available spaces
		3. Enter a specific space position in the park lot
		4. Enter the park lot
		5. Leave the park lot
		0. Exit
		`;
	console.log(displayOptions);
	let optionSelected = prompt("Select an option: ");
	switch(optionSelected){
		case '1':
			console.log(isAvailable(parkingLot)); 
			break;
		case '2':
			console.log(displayAllAvailableSpaces(parkingLot)); break;
		case '3':
			console.log(enterThisSpacePosition(parkingLotNumber, parkingLot)); break;
		case '4':
			console.log(enterTheParkingLot(parkingLot)); break;
		case '5':
			console.log(getOffThePark(parkingLotNumber, parkingLot)); break;
		case '0':
			parkingLotOptions = isExit(); break;


	}
}





function isAvailable(parkingLot){
	for(let rowNumber = 0; rowNumber < parkingLot.length; rowNumber++){
		for(let columnNumber = 0; columnNumber < parkingLot[rowNumber].length; columnNumber++){
			if (parkingLot[rowNumber][columnNumber] == 0)
				return true;
		}
	}
	return false;

}

function displayAllAvailableSpaces(parkingLot){
	return parkingLot;
}
					
function enterThisSpacePosition(parkingLotNumber, parkingLot){
	if (parkingLot[0][1] == 0){
		parkingLot[0][1] = 1;
		return "Parked successfully";
	} 		
	else if (parkingLot[0][1] == 1){

	return "This space is not available.";
	}
}

function enterTheParkingLot(parkingLot){
	if (isAvailable(parkingLot) == true){
		for(let rowNumber = 0; rowNumber < parkingLot.length; rowNumber++){
			for(let columnNumber = 0; columnNumber < parkingLot[rowNumber].length; columnNumber++){
				if (parkingLot[rowNumber][columnNumber] == 0){
					parkingLot[rowNumber][columnNumber] = 1;
					return "Parked successfully";
				}
			}
		}
	}
	return "There is no available space";
}

function getOffThePark(parkingLotNumber, parkingLot){
	parkingLot[parkingLotNumber[0]][parkingLotNumber[1]] = 0;
	return "Left successfully";
	
}

function isExit(){
	return false;
}



























