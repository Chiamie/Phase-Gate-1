public class MakingADifference1 {
public static void main(String[] args){

int password = 4567;
getEncryptedFormOf(password);
int password1 = 3412;

reverseEncryptedFormOf(password1);

}


public static void getEncryptedFormOf(int fourDigitNumber){
	int unitDigit = ((fourDigitNumber % 10) + 7) % 10;
	int tensDigit = (((fourDigitNumber % 100) / 10) + 7) % 10;
	int hundredsDigit = (((fourDigitNumber / 100) % 10) + 7) % 10;
	int thousandsDigit = ((fourDigitNumber / 1000) + 7) % 10;
	int temp = thousandsDigit;
	thousandsDigit = tensDigit;
	tensDigit = temp;
	temp = hundredsDigit;
	hundredsDigit = unitDigit;
	unitDigit = temp;
	int encryptedInteger = (thousandsDigit * 1000) + (hundredsDigit * 100) + (tensDigit * 10) + (unitDigit * 1);
	System.out.println(encryptedInteger);	
}


public static void reverseEncryptedFormOf(int encryptedInteger){
	int unitDigit = encryptedInteger % 10;
	int tensDigit = encryptedInteger % 100 / 10;
	int hundredsDigit = encryptedInteger / 100 % 10;
	int thousandsDigit = encryptedInteger / 1000;
	int temp = thousandsDigit;
	thousandsDigit = tensDigit;
	tensDigit = temp;
	temp = hundredsDigit;
	hundredsDigit = unitDigit;
	unitDigit = temp;
	int fourDigitNumber = (thousandsDigit * 1000) + (hundredsDigit * 100) + (tensDigit * 10) + (unitDigit * 1);
	System.out.println(fourDigitNumber);
	thousandsDigit = (thousandsDigit - 7 + 10) % 10;
    	hundredsDigit = (hundredsDigit - 7 + 10) % 10;
    	tensDigit = (tensDigit - 7 + 10) % 10;
    	unitDigit = (unitDigit - 7 + 10) % 10;
    	fourDigitNumber = (thousandsDigit * 1000) + (hundredsDigit * 100) + (tensDigit * 10) + (unitDigit * 1);
    	System.out.println(fourDigitNumber);

}







}







