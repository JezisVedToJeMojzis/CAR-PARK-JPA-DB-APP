package sk.stuba.fei.uim.vsa.pr1b.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sk.stuba.fei.uim.vsa.pr1b.entities.CarPark;
import sk.stuba.fei.uim.vsa.pr1b.entities.CarParkFloor;
import sk.stuba.fei.uim.vsa.pr1b.entities.CarType;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-04-06T19:33:38")
@StaticMetamodel(ParkingSpot.class)
public class ParkingSpot_ { 

    public static volatile SingularAttribute<ParkingSpot, CarParkFloor> floorIdentifier;
    public static volatile SingularAttribute<ParkingSpot, CarType> carType;
    public static volatile SingularAttribute<ParkingSpot, CarPark> carParkId;
    public static volatile SingularAttribute<ParkingSpot, Long> id;
    public static volatile SingularAttribute<ParkingSpot, String> spotIdentifier;

}