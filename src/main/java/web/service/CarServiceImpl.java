package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    public List<Car> getCars(int size) {
        return carDao.getCars(size);
    }
    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}