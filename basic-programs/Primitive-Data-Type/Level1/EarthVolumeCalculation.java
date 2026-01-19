public class EarthVolumeCalculation {
   public static void main(String[] args){
       double RadiusInKm = 6378;
       double miles = 0.6213;
       double volume = (4.0/3.0)*Math.PI*Math.pow(RadiusInKm,3);
       double VolumeInMiles = volume*Math.pow(miles,3);
       System.out.println("The volume of earth in cubic kilometers is "+volume+" and cubic miles is "+VolumeInMiles);
    }
}
