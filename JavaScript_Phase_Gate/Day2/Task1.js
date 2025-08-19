function getFatherAge(currentFatherAge, currentSonAge){
	let twiceSonAge = currentSonAge * 2;
	let result = currentFatherAge - twiceSonAge;
	if (result < 0)
		return `The father will be twice as old in ${result * -1} years time`;
	else if (result == 0)
		return `The father is currently twice the son's age`;
	else
		return `The father was twice as old  ${result} years ago`
}

let fatherAge = 40;
let sonAge = 18;
console.log(getFatherAge(fatherAge, sonAge));

console.log(getFatherAge(50, 25));

console.log(getFatherAge(50, 35));

