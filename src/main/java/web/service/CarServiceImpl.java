package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car(1, "Car1", 1, 2001));
            carList.add(new Car(2, "Car2", 2, 2002));
            carList.add(new Car(3, "Car3", 3, 2003));
            carList.add(new Car(4, "Car4", 4, 2004));
            carList.add(new Car(5, "Car5", 5, 2005));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}