package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {


	private CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/{count}")
	public String getCars(@PathVariable("count") int count, Model model) {
		model.addAttribute("cars", carService.getCars(count));
		return "cars";
	}
}