function displayTextOf(arrayOfNames){
	if (arrayOfNames.length == 1)
		return `${arrayOfNames[0]} likes this`;
	else if (arrayOfNames.length == 2)
		return `${arrayOfNames[0]} and ${arrayOfNames[1]} like this`;
	else if (arrayOfNames.length == 3)
		return `${arrayOfNames[0]}, ${arrayOfNames[1]} and ${arrayOfNames[2]} like this`;
	else if (arrayOfNames.length >= 4){
		let count = 0;
		for(let index = 2; index < arrayOfNames.length; index++){
			count++;
		}
		return `${arrayOfNames[0]}, ${arrayOfNames[1]} and ${count} others like this`;
	}else
		return 'No one likes this';
	
}


console.log(displayTextOf(['Peter']));
console.log(displayTextOf(['Peter', 'James']));
console.log(displayTextOf(['Peter', 'Feyi', 'Silver']));
console.log(displayTextOf(['Peter', 'Eloka', 'Amaka', 'Tosin']));
console.log(displayTextOf(['Peter', 'Eloka', 'Amaka', 'Tosin', 'Basit', 'Femi', 'Rita']));
console.log(displayTextOf([]));
