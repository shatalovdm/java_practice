/**
 * Created by Дмитрий Шаталов on 5/10/2015.
 */
public abstract class Building {
    //здание (название, назначение, адрес, площадь, форма собственности)
    private String name;
    private String address;
    private Double area;
    private Integer storeys;

    public Building(String name, String address, Double area, Integer storeys) {
        this.name = name;
        this.address = address;
        this.area = area;
        this.storeys = storeys;
    }
}

class Office extends Building {
    int offices;
    OfficeClass officeClass;

    public Office(String name, String address, Double area, Integer storeys, int offices, OfficeClass officeClass) {
        super(name, address, area, storeys);
        this.offices = offices;
        this.officeClass = officeClass;
    }

    enum OfficeClass {
        A, B, C, D
    }
}

class StateBuildings extends Building {
    int rooms;
    Purpose purpose;

    public StateBuildings(String name, String address, Double area, Integer storeys) {
        super(name, address, area, storeys);
    }

    public enum Purpose {
        kindergarten, school, university, library, academy, court, hospital
    }

}

class LivingBuildings extends Building {
    int numberOfApartments;
    LivingType livingType;

    public LivingBuildings(String name, String address, Double area, Integer storeys) {
        super(name, address, area, storeys);
    }

    enum LivingType {
        apartment("многоквартирный дом"), townhouse(""), cottege(""), chalet("");

         LivingType(String s) {
        }
    }
}
