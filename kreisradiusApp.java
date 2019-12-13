/*
This is a Open-Source-Software.
This open source software was released on 13.12.2019 by Uwe Hellmann and is subject to the MIT License.
You can download this Open-Source-Software from here: https://github.com/uweDev/java-circle-radius-calculator
*/

import javax.swing.JOptionPane;

public class kreisradiusApp {
	public static void main(String[] args) {
		
		// Set the data types
		String unitString, circleRadiusString, scopeString, surfaceString;
		double circleRadiusDouble, scopeDouble, surfaceDouble;
		
		// Input windows
		unitString			= JOptionPane.showInputDialog("Einheit eingeben: ");
		circleRadiusString	= JOptionPane.showInputDialog("Kreisradius eingeben: ");

		// Replaces comma with period and change the data type
		circleRadiusString	= circleRadiusString.replace(',', '.');
		circleRadiusDouble	= Double.valueOf(circleRadiusString);
		
		// Calculate the result
		scopeDouble			= 2.0 * 3.1415926 * circleRadiusDouble;
		surfaceDouble		= 3.1415926 * circleRadiusDouble * circleRadiusDouble;
		
		// Change the data types and replaces period with comma
		scopeString			= String.valueOf(scopeDouble);
		surfaceString		= String.valueOf(surfaceDouble);
		scopeString			= scopeString.replace('.', ',');
		surfaceString		= surfaceString.replace('.', ',');
		
		// Results output
		JOptionPane.showMessageDialog(
			null, "Ihr Ergebnis lautet: \n"
			+ "Umfang: " + scopeString + " " + unitString + "\n"
			+ "Fläche: " + surfaceString + " " + unitString + '\u00b2');
	}
}