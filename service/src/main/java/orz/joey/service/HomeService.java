package orz.joey.service;

import orz.joey.repository.Girl;

public class HomeService {

    public static String showLove(String name) {
        return "Joey loves " + Girl.findTrueLove(name);
    }

}
