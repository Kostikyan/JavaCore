package additionalLessons;

public class AverageCoordinates {

    public static void main(String[] args) {

        double lat1 = 40.1787366; double lon1 = 44.5160389;
        double lat2 = 40.7926847; double lon2 = 43.8470783;

        //Bx = cos φ2 ⋅ cos Δλ
        //By = cos φ2 ⋅ sin Δλ
        //fm = atan2( sin φ1 + sin φ2, √(cos φ1 + Bx)² + By² )
        //lm = λ1 + atan2(By, cos(φ1)+Bx)

        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        lon1 = Math.toRadians(lon1);

        double Bx = Math.cos(lat2) * Math.cos(dLon);
        double By = Math.cos(lat2) * Math.sin(dLon);
        double lat3 = Math.atan2(Math.sin(lat1) + Math.sin(lat2), Math.sqrt((Math.cos(lat1) + Bx) * (Math.cos(lat1) + Bx) + By * By));
        double lon3 = lon1 + Math.atan2(By, Math.cos(lat1) + Bx);

        System.out.println(Math.toDegrees(lat3) + ", " + Math.toDegrees(lon3));

    }
}
