/**
 * AirCraft.scala
 * Compiled on 11th Nov 2017
 * @author :Chhaya Yadav
 */
//package declaration

package mypack1511

//parent class declaration

class AirCraft(brandName :String ,fuelCapacity: Float) {
   
//method declaration in parent class
  
  def show()={
    
    println("Displaying the Generic AirCraft Details")
    
    println("AirCraft Brand Name :"+brandName)
    
    println("AirCraft fuelCapacity :"+fuelCapacity)
  }
  
}