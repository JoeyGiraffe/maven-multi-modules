package orz.joey.web.controller;

import orz.joey.service.HomeService;
import orz.joey.service.dto.GirlDto;

public class HomeController {

    public GirlDto index() {
        return HomeService.showLove("Jelly");
    }
}
