class SensorExecutor{
public static void main(String args[]){

Sensor sensor = new Sensor();
sensor.brandName = "TRÅDFRI";
sensor.materialUsed = "ABS plastic";
sensor.cost = 999;
sensor.usesFor = "Tested and approved for bathroom use";
sensor.typeOfSensor = "Motion Type";


System.out.println("Name of sensor is "+ sensor.brandName);
System.out.println("materialUsed is "+ sensor.materialUsed);
System.out.println("cost of sensor is "+ sensor.cost);
System.out.println("usesFor "+ sensor.usesFor);
System.out.println("typeOfSensor is "+ sensor.typeOfSensor);
sensor.toSenseThings();
}
}