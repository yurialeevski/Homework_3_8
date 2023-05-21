import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    private String name;

    private Transport transport;

    public Driver(String name) {
        this.name = name;
    }

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    public void startTheCar() {
        System.out.println(name + " включил двигатель " + transport.getBrand());
        transport.makeReady();
    }
}
