public class Program12 {
        // Inner class for arithmetic processes
        public class ArithmeticProcessor {
            public int add(int a, int b) {
                return a + b;
            }
    
            public int subtract(int a, int b) {
                return a - b;
            }
    
            public int multiply(int a, int b) {
                return a * b;
            }
    
            public int divide(int a, int b) {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            }
        }
    
        // Inner class for logical processes
        public class LogicalProcessor {
            public boolean and(boolean a, boolean b) {
                return a && b;
            }
    
            public boolean or(boolean a, boolean b) {
                return a || b;
            }
    
            public boolean not(boolean a) {
                return !a;
            }
        }
    
        public static void main(String[] args) {
            Program12 P12 = new Program12();
            ArithmeticProcessor AP = P12.new ArithmeticProcessor();
            LogicalProcessor LP = P12.new LogicalProcessor();
    
            System.out.println("Arithmetic Processes:");
            System.out.println("Add: " + AP.add(5, 3));
            System.out.println("Subtract: " + AP.subtract(5, 3));
            System.out.println("Multiply: " + AP.multiply(5, 3));
            System.out.println("Divide: " + AP.divide(5, 2));
    
            System.out.println("Logical Processes:");
            System.out.println("And: " + LP.and(true, false));
            System.out.println("Or: " + LP.or(true, false));
            System.out.println("Not: " + LP.not(true));
        }
    }

