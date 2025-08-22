let groceries = [];
const prompt = require('prompt-sync')();
 
let listOfMenuFunctions = true;
while(listOfMenuFunctions) {
	const menu = `
		1. Add Grocery
		2. Remove Grocery
		3. Show All Groceries
		0. Exit
		`;
	console.log(menu);
	let optionSelected = prompt("Select and option: ");
	switch(optionSelected){
		case '1':
			let nameOfGrocery = prompt("Add a Grocery: ");
			console.log(addThisGrocery(nameOfGrocery)); 
			break;
		case '2':
			let nameOfGrocery1 = prompt("Add a Grocery: ");
			console.log(removeThisGrocery(nameOfGrocery1)); 
			break;
		case '3':
			console.log(displayAllGroceries()); break;
		case '0':
			listOfMenuFunctions = exit();

	}
}





function addThisGrocery(name){
		
	groceries.push(name);
	return "Added successfully";
}
function removeThisGrocery(name){
	
	groceries.splice(groceries.indexOf(name), 1);
	return "Removed successfully";
}

function displayAllGroceries(){
	return groceries;
}

function exit(){
	return false;
}


























