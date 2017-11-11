/**
 * InheritanceDemo.scala
 * Compiled on 11th Nov 2017
 * @author :Chhaya Yadav
 */
//package declaration

package mypack1511

//Scala Object Declaration

object InheritanceDemo {
   
//main method declaration
  
  def main(xyz :Array[String]) :Unit  = {
    
//Inheritance Demo
    
   
  println("--------------------------------------------------------------")
  
  println("-----------------Implementation of Single Inheritance in Scala---------------------")

  println("Domestics AirCraft is a child class of AirCraft Class.")
  
  println("--------------------------------------------------------------")
  
  var da = new DomesticAirCraft(1999.69f , 350 ,"BOOEING 787");
  
  da.show
 
  println("---------------------------------------------------------------")
  
//Multiple Inheritance Demo
  
  println("-----------------Implementation of Multiple Inheritance in Scala---------------------")
  
  println("Scala Traits Carnivores,Chimpanzee & Omnivores have extended Scala Trait Mammal")
 
  println("Animal Scala Class have extended three Scala Traits Carnivores ,Chimpanzee & Omnivores respectively.")
  
   
  println("---------------------------------------------------------------")
  
//Child class Animal instantiation  
  
  var mammal = new Animal
  
  mammal.eat()
  
  }
  
}