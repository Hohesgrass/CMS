public class ArrayHelper {

    public ArrayHelper(){

    }

    public double calculateAverage(double[] numbers) {

        double sum = 0;

        for (double i : numbers) {
            sum += i;
        }

        return (sum / numbers.length);
    }

    public double calculateStandartDeviation(double[] numbers) {

        double average = calculateAverage(numbers);
        double sum = 0;
        double solution = 0;

        for (double i : numbers) {
            i = Math.pow(i - average, 2);
            sum += i;
        }
        solution = Math.sqrt(sum / numbers.length);

        return solution;
    }

    public double findMaxValue(double[] numbers) {
        double max = numbers[0];
        for (double i: numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public double findMinValue(double[] numbers) {
        double min = numbers[0];
        for (double i: numbers) {
            if (i > min) {
                min = i;
            }
        }
        return min;
    }

    public double[] deleteValueInArray(double[] numbers, int index){
        double[] newNumbers = new double[numbers.length - 1];
        int newIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if (i != index) {
                newNumbers[newIndex] = numbers[i];
                newIndex++;
            }
        }
        return newNumbers;
    }

    public double[] createValueAtIndex(double[] numbers, int index, double elementToAdd){
        if (index < 0 || index > numbers.length){
            return numbers;
        }
        double[] newNumbers = new double[numbers.length + 1];

        for (int i = 0, j = 0; i < newNumbers.length; i++){
            if (i == index){
                newNumbers[i] = elementToAdd;
            } else {
                newNumbers[i] = numbers[j];
                j++;
            }
        }
        return newNumbers;
    }

    public int getIndexByValue(double[] numbers, int value) {
        int counter = 0;
        for (double i : numbers) {
            if (i == value){
                return counter;
            } else {
                counter++;
            }
        }
        return -1;
    }
}
