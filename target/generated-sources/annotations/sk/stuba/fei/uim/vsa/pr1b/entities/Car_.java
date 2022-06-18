package sk.stuba.fei.uim.vsa.pr1b.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sk.stuba.fei.uim.vsa.pr1b.entities.CarType;
import sk.stuba.fei.uim.vsa.pr1b.entities.User;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-04-06T19:33:38")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile SingularAttribute<Car, String> colour;
    public static volatile SingularAttribute<Car, CarType> carType;
    public static volatile SingularAttribute<Car, String> model;
    public static volatile SingularAttribute<Car, Long> id;
    public static volatile SingularAttribute<Car, String> vehicleRegistrationPlate;
    public static volatile SingularAttribute<Car, User> userId;
    public static volatile SingularAttribute<Car, String> brand;

}