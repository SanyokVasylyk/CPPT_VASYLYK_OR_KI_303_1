package KI303.Vasylyk.Lab5;

import java.io.*;

public class ResultIO {

    public static void writeText(String filename, double x, double result) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("x = " + x + "\n");
            writer.write("y = " + result + "\n");
        }
    }

    public static String readText(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader r = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }

    public static void writeBinary(String filename, double x, double result) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            out.writeDouble(x);
            out.writeDouble(result);
        }
    }

    public static double[] readBinary(String filename) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            double x = in.readDouble();
            double y = in.readDouble();
            return new double[]{x, y};
        }
    }
}
