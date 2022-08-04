package testpar;

import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Test4 {
    public static String make_Suzuki = "Suzuki";
    public static String make_Honda = "Honda";
    public static String make_Kia = "Kia";
    public static String make_Hundia = "Hundia";
    public static String make_Toyota = "Toyota";

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder(toBuilder = true)
    private static class Car {
        private String make;
        private BigDecimal price;
        private Boolean imported;

        public String toString() {
            return this.getMake() + " --- " + this.getPrice() + " --- " + this.getImported();
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder(toBuilder = true)
    @ToString
    private static class ShowRoom {
        private String name;
        private List<Car> carList;
    }

    public static void main(String[] args) {
        Car c = Car.builder().make(make_Suzuki).price(BigDecimal.valueOf(18000)).imported(true).build();
        Car c1 = Car.builder().make(make_Honda).price(BigDecimal.valueOf(13000)).imported(true).build();
        Car c2 = Car.builder().make(make_Suzuki).price(BigDecimal.valueOf(20000)).imported(false).build();
        Car c3 = Car.builder().make(make_Toyota).price(BigDecimal.valueOf(14000)).imported(true).build();
        Car c4 = Car.builder().make(make_Kia).price(BigDecimal.valueOf(12000)).imported(false).build();
        Car c5 = Car.builder().make(make_Honda).price(BigDecimal.valueOf(20000)).imported(true).build();
        Car c6 = Car.builder().make(make_Toyota).price(BigDecimal.valueOf(20000)).imported(true).build();
        Car c7 = Car.builder().make(make_Honda).price(BigDecimal.valueOf(10000)).imported(false).build();
        Car c8 = Car.builder().make(make_Hundia).price(BigDecimal.valueOf(16000)).imported(true).build();

        ShowRoom showRoom1 = ShowRoom.builder().name("Ahmed Cars Dealers").carList(Arrays.asList(c,c1,c2)).build();
        ShowRoom showRoom2 = ShowRoom.builder().name("Ali Cars Dealers").carList(Arrays.asList(c3,c4,c5)).build();
        ShowRoom showRoom3 = ShowRoom.builder().name("Asad Cars Dealers").carList(Arrays.asList(c6,c7,c8)).build();
        Stream<Car>carStream=Stream.of(c,c1,c3,c4,c5,c6,c7,c8);
        Predicate<Car>carPredicate=car -> make_Honda.equals(c.getMake())&&car.getImported();
        List<ShowRoom>showRoomList=Arrays.asList(showRoom1,showRoom2,showRoom3);
        List<Car>carList=showRoomList.stream().map(showRoom -> showRoom.getCarList())
                .flatMap(Collection::stream).filter(car -> car.getPrice().compareTo(BigDecimal.valueOf(15000))<=0).collect(Collectors.toList());
        carList.forEach(ca-> System.out.println(ca));
    }
}
