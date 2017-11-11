/**
 * DomesticAirCraft.scala
 * Compiled on 11th Nov 2017
 * @author :Chhaya Yadav
 */
//package declaration

package mypack1511

//DomesticAirCraft child class declaration inheriting parent class AirCraft

class DomesticAirCraft(fuelCapacity :Float,passengerCapacity :Int, brandName :String )
    extends AirCraft(brandName ,fuelCapacity){

//overriding the method of parent class
  
    override def show() = {
     
      println("Displaying the Domestic AirCraft Details")
   
      println("Domestic AirCraft brand Name :" +brandName)
    
      println("Domestic AirCraft Passenger Capacity :"+passengerCapacity)
    
      println("Domestic AirCraft Fuel Capacity :"+fuelCapacity)
  }
}