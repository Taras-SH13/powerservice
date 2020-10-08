package application.rest;

import application.model.Laptop;
import application.repos.LaptopRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private LaptopRepos laptopRepos;

    @GetMapping("/admin")
    public String main(Map<String, Object> model) {
        Iterable<Laptop> laptops = laptopRepos.findAll();
        model.put("laptops", laptops);
        return "admin";
    }

    @PostMapping("/admin")
    public String add(@RequestParam String fullName, @RequestParam String vendor, @RequestParam String series, @RequestParam String laptopsModel, Map<String, Object> model) {
        Laptop laptop = new Laptop(fullName, vendor, series, laptopsModel);
        laptopRepos.save(laptop);
        Iterable<Laptop> laptops = laptopRepos.findAll();
        model.put("laptops", laptops);
        return "admin";
    }

    @PostMapping("/filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Laptop> laptops;
        if (filter != null && !filter.isEmpty()) {
            laptops = laptopRepos.findByVendor(filter);
        } else laptops = laptopRepos.findAll();
        model.put("laptops", laptops);
        return "admin";
    }
}
