# Car park JPA DB application

![Java 1.8](https://img.shields.io/badge/Java-1.8-blue)
![EclipseLink 2.7.10](https://img.shields.io/badge/EclipseLink-2.7.10-green)
[![Public domain](https://img.shields.io/badge/License-Unlicense-lightgray)](https://unlicense.org)


## Entities

Application works with these entities:

- **Car park** - has attributes name, address, price per hour of parking
- **Car park floor** - contains the identification mark of the floor
- **Parking spot** - contains the identification mark of the place
- **Car** - contains attributes brand, model, VAT number, color
- **User** - contains attributes name, surname, email

### Associations

The following relationships exist between the implemented entities:

* The car park contains several floors.
* The floor of the car park contains several parking spaces.
* The parking space serves several cars, but a maximum of one for the given time.
* Each car has exactly one owner/user.
* The car can only be parked in one parking spot at a given time.
* Which car is parked in which parking spot is defined by the reservation, which includes the start time, time
   parking terminations and the total price for parking. The maximum length of parking is not determined. Every start is charged
   lesson.

## Functionality

The application provides CRUD operations on all entities mentioned above. It must also enable the user
reserve a parking spot for your own car. A reservation can only be made for a specific time. After leaving the
parking spot, the reservation is terminated and the time of termination of the reservation is entered and the total price for the reservation is calculated
parking spot.

The application must allow the user to display a list of reservations for a specific day and parking spot, a list of his
of active reservations and must also include the possibility of checking the occupancy of the car park.

When deleting a car park, all its floors and parking spots must also be deleted. Same as deleted
the users's cars must also be deleted.

## Car types

The application contains the functionality **types of cars** that can park in the parking garage (e.g. electric, LPG, etc.). Individual
parking spaces contain the attribute for which type of car they are intended, and also each car has a defined type. A car type is a separate entity. When creating a reservation, there is a check where only a car of the same type as the one specified in the parking space can park in it, otherwise the reservation will
rejected.

