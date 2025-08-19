function getAverageOf(score1, score2, score3){
	let average = (score1 + score2 + score3) / 3;
	if (average >= 90 && average <= 100)
		return 'A';
	else if (average >= 80 && average < 90)
		return 'B';
	if (average >= 70 && average < 80)
		return 'C';
	if (average >= 60 && average < 70)
		return 'D';
	if (average >= 0 && average < 60)
		return 'F';
}



console.log(getAverageOf(90, 97, 86));



