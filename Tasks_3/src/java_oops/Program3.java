class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Addition of two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtraction of two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Multiplication of two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Division of two complex numbers
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Check equality of two complex numbers
    public boolean equals(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    // Compare the magnitudes of two complex numbers
    public int compareTo(ComplexNumber other) {
        double thisMagnitude = Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
        double otherMagnitude = Math.sqrt(other.real * other.real + other.imaginary * other.imaginary);
        return Double.compare(thisMagnitude, otherMagnitude);
    }

    // String representation of complex number
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        // Example usage
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        // Arithmetic operations
        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);
        ComplexNumber quotient = c1.divide(c2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Comparison
        System.out.println("Are c1 and c2 equal? " + c1.equals(c2));
        System.out.println("Comparing c1 and c2: " + c1.compareTo(c2));
    }
}
