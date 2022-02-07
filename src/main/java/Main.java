import com.fasterxml.jackson.databind.ObjectMapper;
import model.Car;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        //objectMapper.writeValue(new File("target/car.json"), car);

        System.out.println(objectMapper.writeValueAsString(car));
    }

}
