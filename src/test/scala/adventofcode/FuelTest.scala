package adventofcode


import org.scalatest.funspec.AnyFunSpec

//For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
//For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
//For a mass of 1969, the fuel required is 654.
//For a mass of 100756, the fuel required is 33583.

//A module of mass 14 requires 2 fuel. This fuel requires no further fuel (2 divided by 3 and rounded down is 0, which would call for a negative fuel)
// so the total fuel required is still just 2.

//At first, a module of mass 1969 requires 654 fuel.
// Then, this fuel requires 216 more fuel (654 / 3 - 2).
// 216 then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel, which requires no further fuel.
// So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.

//The fuel required by a module of mass 100756 and its fuel is: 33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.

class FuelTest extends AnyFunSpec {
  it("Calculates the fuel for a ship mass of 12") {
    val fuelMass = FuelCounter.shipFuelMass("12")
    assert(fuelMass == 2)
  }
  it("Calculates the fuel for a ship mass of 14") {
    val fuelMass = FuelCounter.shipFuelMass("14")
    assert(fuelMass == 2)
  }
  it("calculates the fuel for a mass of 100756") {
    val fuelMass = FuelCounter.shipFuelMass("100756")
    assert(fuelMass == 33583)
  }
  it("Calculates the fuel for mass of 14") {
    val input = 14
    val expectedOutput = 2
    assert(FuelCounter.getFuel3(14) == expectedOutput)
  }
  it("Calculates the total fuel for a mass of 1969") {
    val shipMass: Int = 1969
    val expectedTotalFuel: Int = 966
    assert(FuelCounter.getFuel3(shipMass) == expectedTotalFuel)

  }
  it("Calculates the total fuel for a mass of 1") {
    val shipMass: Int = 1
    val expectedTotalFuel: Int = 0
    assert(FuelCounter.getFuel3(shipMass) == expectedTotalFuel)

  }
  it("Calculates the total fuel for a mass of 100756") {
    val expectedTotalFuel = 50346
    val shipMass = 100756
    assert(FuelCounter.getFuel3(shipMass) == 50346 )
  }



//  it("Calculates fuel for a fuel mass of 2") {
//    val extraFuel = FuelCounter.extraFuel(2)
//    assert(extraFuel == 2)
//  }
//  it("calculates total fuel for all modules and fuel weight") {
//    val totalFuel = FuelCounter.shipFuelMass(input)
//  }

}
//  it("Has a function called FuelCalculation") {
//    val fuelCalc = FuelCounter.getClass.getMethods.map(_.getName)
//    println(fuelCalc)
//  }
