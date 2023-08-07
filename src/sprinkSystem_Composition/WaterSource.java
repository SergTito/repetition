package sprinkSystem_Composition;

public class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Сконструрирован";

    }

    public String toString() {
        return s;
    }
}

