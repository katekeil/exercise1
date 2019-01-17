/*Kate Keil, 1/17/19, Exercise 1, city/weather info*/
package com.kate.Week1;

public class Main {

    public static void main(String[] args) {
	String city="Columbus";
	int zip=43215;
	int highTemp[]={32,25,27,40,45};
	float sum=0;
	float average = 0;

	for(int i=0; i<=4; i++) {
		sum = sum + highTemp[i];
	}

	average = sum/5;

		System.out.println("City: " + city + " Zip code: " + zip + " Average High Temperature: " + average);

    }
}
