package scmoure;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import scmoure.orikatraining.MyEntity;
import scmoure.orikatraining.MyEntityDto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(MyEntityDto.class, MyEntity.class)
                .mapNulls(false)
                .field("libelle","libelle")
                .byDefault()
                .register();

        MyEntity myEntity = new MyEntity();
        myEntity.setId(1L);
        myEntity.setVersion(0L);
        myEntity.setCode("CODE1");
        myEntity.setDescription("My Entity");
        myEntity.setLibelle("My Libelle");
        myEntity.setOtherData("Other data");

        MyEntityDto myEntityDto = new MyEntityDto();
        myEntityDto.setId(1L);
        myEntityDto.setVersion(0L);
        myEntityDto.setDescription("My description 2");
        myEntityDto.setLibelle(null);

        MapperFacade mapper = mapperFactory.getMapperFacade();

        mapper.map(myEntityDto, myEntity);
        System.out.println(myEntity);
    }
}
