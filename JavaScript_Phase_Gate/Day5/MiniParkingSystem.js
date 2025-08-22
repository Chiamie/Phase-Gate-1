const prompt = require('prompt-sync')();

let parkingLot = [[1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 1, 1]];
let parkingLotNumber = [1, 0];

let parkingLotOptions = true;
while(parkingLotOptions) {
	const displayOptions = `
		1. See if there is available space
		2. See all available spaces
		3. See the first available space	 position
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
			console.log(removeThisGrocery(nameOfGrocery1)); 
			break;
		case '3':
			console.log(displayAllGroceries()); break;
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



























