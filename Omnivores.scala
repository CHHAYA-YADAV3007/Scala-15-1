/**
 * Omnivores.scala
 * Compiled on 11th Nov 2017
 * @author :Chhaya Yadav
 */
//package declaration
package mypack1511

//Scala Trait Declaration and inheriting Mammal parent Scala Trait

trait Omnivores extends Mammal{
  
  override def eat() = println("Omnivores eat honey")
}