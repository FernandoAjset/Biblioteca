from car import Car
if __name__=="__main__":
    print("Hola mundo")
    car = Car()
    car.license="AMS234"
    car.driver="Andres Herrera"
    car.passengers=4
    print(vars(car))

    car2= Car()
    car2.license="AMD123"
    car2.driver="Juan Perez"
    car2.passengers=3
    print(vars(car2))