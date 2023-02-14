package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1,"BMW", 7));
        carList.add(new Car(2, "Mazda", 6));
        carList.add(new Car(3, "Lada", 5));
        carList.add(new Car(4, "Nissan", 4));
        carList.add(new Car(5, "VW Golf", 3));
        carList.add(new Car(6,"ВАЗ",2109));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 || count < 4) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
