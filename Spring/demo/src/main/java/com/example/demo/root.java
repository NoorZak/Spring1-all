package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class root {
    @RequestMapping("/")
    public String home() {

        return "index.jsp";
    }

    @RequestMapping("/date")

    public String date(Model model) {
        String datePattern = "dd MMMM, yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        String date = dateFormat.format(new Date());
        model.addAttribute("date", date);
        return "date.jsp";
    }


    @RequestMapping("/time")

    public String time(Model model) {
        String datePattern = "h:mm a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        String time = dateFormat.format(new Date());
        model.addAttribute("time", time);
        return "time.jsp";
    }
}