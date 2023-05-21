import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("GAZ", 2023);
    }
    @Bean
    public Transport getBusBean() {
        return new Bus("LIAZ", 2020);
    }
    @Bean
    public Transport getPickupBean() {
        return new Pickup("UAZ", 2022);
    }
    @Bean(name = "driver_1")
    public Driver getDriverBean() {
        return new Driver("driver_1", getCarBean());
    }
    @Bean(name = "driver_2")
    public Driver getDriver2Bean() {
        return new Driver("driver_2", getBusBean());
    }
    @Bean(name = "driver_3")
    public Driver getDriver3Bean() {
        return new Driver("driver_3", getPickupBean());
    }
/*@Bean
public Truck getTruckBean() {
    return new Truck("BMW");
}

    @Bean(name = "vodila")
    public Vodila getVodila() {
        return new Vodila("ZZZ", getTruckBean());
    }*/
}
