package Lab6;

import java.io.*;
import java.util.*;

public class SinToFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PrintWriter sinWriter = new PrintWriter("./Lab6/sin.txt");
        for (int i = 0; i < 361; i++) {
            sinWriter.println(Math.sin(i));
        }
        sinWriter.close();
        Vector<Double> data = new Vector<Double>();
        BufferedReader inputReader = new BufferedReader(new FileReader("./Lab6/input.txt"));
        int taget = Integer.parseInt(inputReader.readLine());
        inputReader.close();

        BufferedReader sinReader = new BufferedReader(new FileReader("./Lab6/sin.txt"));
        String line;
        while((line=sinReader.readLine())!=null){
            data.add(Double.parseDouble(line));
        }
        sinReader.close();
        System.out.println(data.get(taget));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./Lab6/sin.dat"));
        objectOutputStream.writeObject(data);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./Lab6/sin.dat"));
        Vector<Double> data_input = new Vector<Double>();
        Object readedValue = objectInputStream.readObject();
        objectInputStream.close();

        if (readedValue instanceof Vector<?>) {
            data_input = (Vector<Double>) readedValue;
            System.out.println(data_input);
        }
        else {
            System.out.println("Error, unable to convert data");
        }

        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("./Lab6/sin2.dat"));
        for (Double double1 : data) {
            objectOutputStream2.writeDouble(double1);
        }
        objectOutputStream2.close();

        Vector<Double> data_input2 = new Vector<Double>();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("./Lab6/sin2.dat"));
        while (objectInputStream2.available() > 0) {
            data_input2.add(objectInputStream2.readDouble());
        }
        objectInputStream2.close();
        System.out.println(data_input2);
    }
}
