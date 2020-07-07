package orz.joey.web;

import orz.joey.service.HomeService;

public class HomeController {

    public String index() {
        return HomeService.showLove("Jelly");
    }
}
