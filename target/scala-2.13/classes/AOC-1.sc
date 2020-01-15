import adventofcode.FuelCounter

import scala.annotation.tailrec
import scala.collection ._


/*
//FUEL IS REQUIRED TO LAUNCH A GIVEN MODULE BASED ON ITS MASS.
//TO FIND FUEL REQUIRED FOR A SINGLE MODULE, DO MASS/3, ROUND DOWN THEN SUBTRACT 2 FROM IT
//THE FUEL COUNTER-UPPER NEEDS TO KNOW THE TOTAL FUEL REQUIREMENTS (RUNNING TOTAL - COUNTER?)
//TO FIND IT, CALCULATE INDIVIDUAL FUEL NEEDS THEN ADD TOGETHER
// */
//
//val input: String = "118868 88841 133680 148066 70887 93213 124243 92767 71322 86793 53650 102703 146958 53031 148282 124989 74375 122044 122693 74204 74869 81803 124436 68495 74865 70765 81537 61376 145342 137159 115230 119293 147126 130191 131330 122891 135407 116334 130325 138521 71955 53806 122260 102573 70032 75981 111555 135654 50805 122186 138172 96422 124781 55894 54337 149926 63809 146163 55131 55796 92771 80288 111619 134602 82245 72505 117209 92383 149101 135399 112166 134000 88771 63963 103731 74915 146347 125390 126249 131534 142038 55327 58784 85003 65909 89879 128715 138559 146209 145040 116032 130046 131664 125899 141918 88426 50488 67943 79677 94858"
//
//class CounterUpper() {
//
//  def splitMass(string: String) = {
//    val numArray: Array[String] = string.split(" ")
//    numArray
//  }
//
//  def addUp(str: String): Int = {
//    val numArray: Array[String] = splitMass(str)
//    val fuelMasses: Int = numArray.foldLeft(0)(
//      (runningTotal, shipMass) => FuelCounter.getFuel2(FuelCounter.shipFuelMass(shipMass)) + runningTotal
//    )
//    fuelMasses
//  }
//}
//
//
//val n = new CounterUpper()
//println(n.addUp(input))
//
////
////  Big file of nums (0,1,2)'S
////  WITH THIS -> DIVIDE BY 150 (25PX WIDE & 6PX TALL)
////  TRACK EACH LAYER OF 150, THEN FIND OUT WHICH ONE HAS THE FEWEST 0 DIGITS
////  WITH THIS -> FIND NUM OF 1 DIGITS * HOW MANY 2 DIGITS THERE ARE
//  def getZeroSum(encoded: String): Int = {
//  val zeroSum = layers.map(layer => layer.count(e => e == '0'))
//
//  var lowest = Array(0, Int.MaxValue)
//  var index = 0
//  for (element <- zeroSum) {
//    if (element < lowest(1)) {
//      lowest = Array(lowest(0), element)
//    }
//    lowest(0) += 1
//  }
//  lowest(0)
//}
//}
//
//// Map with index as key & zero sum as value?!
//
//val x = new ImageDecoder()
//println(x.getZeroSum(encoded))



class ImageDecoder(input: String, width: Int, height: Int) {

  val imageSize: Int = width * height
  val layers: List[String] = input.grouped(imageSize).toList

  def get(): Int = {
    val encoded: String  = input
    var index = 0

    val layersAndZeroes = mutable.Map[Int, List[Int]]()
    while (index < layers.length) {
      val layer = layers(index)
      val numberOfZeroes: Int = layer.count(x => x == '0')
      val numberOfOnesTimesTwos = layer.count(x => x == '1') * layer.count(x => x == '2')
      layersAndZeroes += index -> List(numberOfZeroes, numberOfOnesTimesTwos)
      index += 1
    }
    val sortedSeq: scala.Seq[(Int, List[Int])] =   layersAndZeroes.toSeq.sortWith((_._2.head < _._2.head))

    sortedSeq(0)._2(1)
  }
  def getImage: List[String] = {
    var pixels = ""

    for(i <- 0 to 99) {
     println(i) 
    }

    val firstPixel: List[Char] = layers.map(x => x.charAt(0))
    val firstAnswer = firstPixel.find(num => num < '2').get
    println("=>" + firstAnswer + "<=")






    for (layer <- layers) {
      val pixelColour = layer.find(num => num < '2').get
      pixels += pixelColour
    }

    pixels.grouped(25).toList
  }
}


val x = new ImageDecoder("0222112222120000", 2, 2)
val y = x.getImage

