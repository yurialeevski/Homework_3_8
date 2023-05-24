import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Transport transport = context.getBean(Car.class);
        transport.makeReady();
        transport = context.getBean(Bus.class);
        transport.makeReady();
        transport = context.getBean(Pickup.class);
        transport.makeReady();
        Driver carDriver = context.getBean("driver_1", Driver.class);
        carDriver.startTheCar();
        Driver busDriver = context.getBean("driver_2", Driver.class);
        busDriver.startTheCar();
        Driver pickupDriver = context.getBean("driver_3", Driver.class);
        pickupDriver.startTheCar();

        System.out.println(carDriver + " " + busDriver + " " + pickupDriver);
    }
}
