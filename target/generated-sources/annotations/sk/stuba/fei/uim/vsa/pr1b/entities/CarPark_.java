package sk.stuba.fei.uim.vsa.pr1b.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sk.stuba.fei.uim.vsa.pr1b.entities.CarParkFloor;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-04-06T19:33:38")
@StaticMetamodel(CarPark.class)
public class CarPark_ { 

    public static volatile SingularAttribute<CarPark, String> address;
    public static volatile ListAttribute<CarPark, CarParkFloor> floors;
    public static volatile SingularAttribute<CarPark, String> name;
    public static volatile SingularAttribute<CarPark, Integer> pricePerHour;
    public static volatile SingularAttribute<CarPark, Long> id;

}