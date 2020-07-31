package orz.joey.service;

import orz.joey.repository.Girl;
import orz.joey.service.dto.GirlDto;
import orz.joey.service.dto.mapper.GirlMapper;

public class HomeService {

    public static GirlDto showLove(String name) {
        return GirlMapper.getMapper().map(Girl.findTrueLove(name), GirlDto.class);
    }

}
