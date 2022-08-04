package stramprojec;

import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremPac {
    @SpringBootApplication
    public static class StreamapiApplication {

        public static String MAKE_SUZUKI = "SUZUKI MOTORS";
        public static String MAKE_HONDA = "HONDA MOTORS";
        public static String MAKE_TOYOTA = "TOYOTA MOTORS";
        public static String MAKE_KIA = "KIA MOTORS";
        public static String MAKE_HUNDYIA = "HUNDYIA MOTORS";
        public static String MAKE_MG = "MG MOTORS";
        public static String MAKE_PROTON = "PROTON MOTORS";


        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @Builder(toBuilder = true)
        private static class Car {
            private int id;
            private String make;
            private BigDecimal price;
            private boolean imported;
            private String colour;

        }

        @Data
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder(toBuilder = true)
        private static class ShowRoom {
            private int id;
            private String name;
            private List<Car> carList;
        }

        public static void main(String[] args) {
            Car c1 = Car.builder().make(MAKE_SUZUKI).price(BigDecimal.valueOf(10000)).imported(false).build();
            Car c2 = Car.builder().make(MAKE_SUZUKI).price(BigDecimal.valueOf(15000)).imported(true).build();
            Car c3 = Car.builder().make(MAKE_TOYOTA).price(BigDecimal.valueOf(12000)).imported(false).build();
            Car c4 = Car.builder().make(MAKE_TOYOTA).price(BigDecimal.valueOf(16000)).imported(true).build();
            Car c5 = Car.builder().make(MAKE_HONDA).price(BigDecimal.valueOf(2600000)).imported(false).build();
            Car c6 = Car.builder().make(MAKE_HONDA).price(BigDecimal.valueOf(17000)).imported(true).build();
            Car c7 = Car.builder().make(MAKE_SUZUKI).price(BigDecimal.valueOf(25000)).imported(false).build();
            Car c8 = Car.builder().make(MAKE_TOYOTA).price(BigDecimal.valueOf(26000)).imported(false).build();
            Car c9 = Car.builder().make(MAKE_HONDA).price(BigDecimal.valueOf(27000)).imported(false).build();

            ShowRoom showRoom1 = ShowRoom.builder().name("A Car Dealers").carList(Arrays.asList(c1, c2, c3)).build();
            ShowRoom showRoom2 = ShowRoom.builder().name("B Car Dealers").carList(Arrays.asList(c4, c5)).build();
            ShowRoom showRoom3 = ShowRoom.builder().name("C Car Dealers").carList(Arrays.asList(c6, c7, c8)).build();
            ShowRoom showRoom4 = ShowRoom.builder().name("D Car Dealers").carList(Arrays.asList(c9)).build();
            ShowRoom showRoom5 = ShowRoom.builder().name("D Car Dealers").carList(Arrays.asList(c9)).build();

          /*  List<ShowRoom> showRoomList = Arrays.asList(showRoom1, showRoom2, showRoom3, showRoom4, showRoom5);
            List<Car> higherThan14KCarList = showRoomList.stream().map(showRoom -> showRoom.getCarList())
                    .flatMap(Collection::stream).filter(c -> c.getPrice().compareTo(BigDecimal.valueOf(14000l)) >= 0).collect(Collectors.toList());
            higherThan14KCarList.forEach(c -> System.out.println(c));

        }*/

            Stream<Car> streamCar=Stream.of(c1,c2,c3,c4,c5,c6,c7,c8);
            List<Car> carList=streamCar.collect(Collectors.toList());
        }
    }

}