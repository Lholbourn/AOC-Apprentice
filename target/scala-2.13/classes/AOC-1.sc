import adventofcode.FuelCounter

import scala.annotation.tailrec

/*
FUEL IS REQUIRED TO LAUNCH A GIVEN MODULE BASED ON ITS MASS.
TO FIND FUEL REQUIRED FOR A SINGLE MODULE, DO MASS/3, ROUND DOWN THEN SUBTRACT 2 FROM IT
THE FUEL COUNTER-UPPER NEEDS TO KNOW THE TOTAL FUEL REQUIREMENTS (RUNNING TOTAL - COUNTER?)
TO FIND IT, CALCULATE INDIVIDUAL FUEL NEEDS THEN ADD TOGETHER
 */

val input: String = "118868 88841 133680 148066 70887 93213 124243 92767 71322 86793 53650 102703 146958 53031 148282 124989 74375 122044 122693 74204 74869 81803 124436 68495 74865 70765 81537 61376 145342 137159 115230 119293 147126 130191 131330 122891 135407 116334 130325 138521 71955 53806 122260 102573 70032 75981 111555 135654 50805 122186 138172 96422 124781 55894 54337 149926 63809 146163 55131 55796 92771 80288 111619 134602 82245 72505 117209 92383 149101 135399 112166 134000 88771 63963 103731 74915 146347 125390 126249 131534 142038 55327 58784 85003 65909 89879 128715 138559 146209 145040 116032 130046 131664 125899 141918 88426 50488 67943 79677 94858"

class CounterUpper() {

  def splitMass(string: String) = {
    val numArray: Array[String] = string.split(" ")
    numArray
  }

  def addUp(str: String): Int = {
    val numArray: Array[String] = splitMass(str)
    val fuelMasses: Int = numArray.foldLeft(0)(
      (runningTotal, shipMass) => FuelCounter.getFuel2(FuelCounter.shipFuelMass(shipMass)) + runningTotal
    )
    fuelMasses
  }



  //  def getFuel(fuel: Int) : Int = {
  //    var endFuel: Int = fuel
  //      while (fuel > 0) {
  //      var fuelForThatFuel = FuelCounter.shipFuelMass(fuel.toString)
  //      endFuel += getFuel(fuelForThatFuel)
  //    }
  //    endFuel
  //  }




//  def extraFuel(shipMasses: String): Int = {
//    val numArray: Array[String] = splitMass(shipMasses)
//
//    var total = 0
//
//    def x(shipFuel: String): Unit = {
//      var e = FuelCounter.shipFuelMass(shipFuel)
//      total += e
//      if(e > 0) {
//        x(e.toString)
//      }
//      println(total)
//    }
//    var i = 0
//    while(i < numArray.length){
//      x(numArray(i))
//      i += 1
//    }
//    total
//
//  def addedFuel(initialFuel: Int) = {
//  }
//
//  def overallFuel(numArray: Array[String]) = {
//    val shipFuel = numArray.map(x => FuelCounter.shipFuelMass(x))
//    for
//  }


    //  def addedFuel(initialFuel: Int): Unit = {
    //    initialFuel.
    //  }

    //val totalAddFuel: Int = 0
    //    def r() = {
    //      val shipTotal = 0
    //      while (FuelCounter.shipFuelMass(shipFuel) > 0) {
    //        +=
    //        val x = FuelCounter.shipFuelMass(shipMass)
  //        r(x)
  //      }
  //    }
//    val initialFuelReq: Array[Int] = numArray.map(num => FuelCounter.shipFuelMass(num))
//    val addedFuel: Int = initialFuelReq.foldLeft(0)(totalFuel, shipFuel) => initialFuelReq
}


val n = new CounterUpper()
println(n.addUp(input))
