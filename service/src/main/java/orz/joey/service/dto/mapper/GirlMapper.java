package orz.joey.service.dto.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import orz.joey.repository.Girl;
import orz.joey.service.dto.GirlDto;

public class GirlMapper extends ConfigurableMapper {
    private GirlMapper() {}

    private static class GirlMapperHolder {
        private static final GirlMapper MAPPER = new GirlMapper();
    }

    public static GirlMapper getMapper() { return GirlMapperHolder.MAPPER; }

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(Girl.class, GirlDto.class).mapNulls(false).mapNullsInReverse(false).byDefault().register();
    }
}
