//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  var car = Car("subaru","legacy","white",6)
    car.identify()
    car.carry(9)
    car.calculateParkingFees(6)
    var bus = Bus("Nissan","FWX","blue",27)
    bus.maxTripFare(500.00)
    bus.carry(35)
    bus.calculateParkingFees(6)


}
 open class Vehicle(var make:String, var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
        if (people == capacity){
            println("carrying $people passengers.")
        }
        else{
            println("Over capacity by $x people.")
        }
    }fun identify(){
        println("I am $color $make $model ")
    }
  open fun calculateParkingFees(hours:Int){
        println(hours*20)
    }

}
class Car( make:String,  model:String,color:String,capacity:Int):Vehicle(make, model, color, capacity){

}
class Bus( make:String,  model:String,color:String,capacity:Int):Vehicle(make, model, color, capacity){
    fun maxTripFare(fare:Double) {
        println(fare)

    }

    override fun calculateParkingFees(hours: Int) {
        println(hours * capacity)
    }

}
