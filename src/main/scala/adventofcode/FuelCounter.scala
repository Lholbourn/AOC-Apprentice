package adventofcode

object FuelCounter {
  def shipFuelMass(mass: String): Int = {
    val fuelMass = mass.toInt / 3 - 2
    if (fuelMass > 0) fuelMass else 0
  }
//  def getFuel2(fuel: Int) : Int = {
//    var finalFuel = if(fuel > 0){
//      var fuelForThatFuel = FuelCounter.shipFuelMass(fuel.toString)
//      fuel + getFuel2(fuelForThatFuel)
//    }
//    else {
//      0
//    }
//    finalFuel
//  }
  def getFuel3(shipMass: Int): Int = {
    var fuel: Int = shipFuelMass(shipMass.toString)
    var totalFuelReq = fuel
    while(fuel > 0) {
    fuel = shipFuelMass(fuel.toString)
    totalFuelReq += fuel
    }
    totalFuelReq
  }
}
