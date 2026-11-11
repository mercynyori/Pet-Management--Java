// this is an abstract class it cannot be instantiated
public abstract class Services {
    protected Pet pet;
    protected String name;
   // protected LocalDateTime serviceDate;
    protected  String description;
    protected String status;

    // constructor
    public Services(Pet pet, String name, String description,
                    String status) {
        this.pet = pet;
        this.name = name;
        this.description = description;
        //this.serviceDate = serviceDate;
        this.status = status;
    }

    public Services() {

    }

    // methods
    public void ScheduleService(){
        status = "Scheduled";
        System.out.println("Service scheduled!");
    }

    public void CancelService(){
        status = "Cancelled";
        System.out.println("Service Cancelled!");

    }
    // MUST across the related classes
    abstract void getServiceDetails();
    abstract void serviceStatus();



}
