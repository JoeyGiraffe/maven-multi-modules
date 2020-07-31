package orz.joey.web;

import orz.joey.web.controller.HomeController;

public class Main {
    public static void main(String[] args) {
        System.out.println(new HomeController().index());
    }
}
