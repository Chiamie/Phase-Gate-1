function isPossible(gallonLeft){
	const distance = 50;
	let milesPerGallon = 25;
	if (milesPerGallon * gallonLeft == distance)
		return true;
	else
		return false;
}


let gallonAvailable = 2
console.log(isPossible(gallonAvailable));