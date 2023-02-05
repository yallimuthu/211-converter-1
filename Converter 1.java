class FahrenheitToCelsius {

    public static void main(String [] args) {
    double fahrenheiDegrees;
    double celsiusDegrees;

    fahrenheitDegrees = 99.0;

    // convert F to C
    celsiusDegrees = (fahrenheiDegrees - 32) * 5 / 9;

    System.out.print(
        fahrenheiDegrees + "degrees in Fahrenheit is"
        + celsiusDegrees + "degrees in Celsius");
    
}
}