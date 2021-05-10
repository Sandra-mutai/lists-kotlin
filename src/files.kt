fun main(){
    println(isEven(90))
    println(isEven(95))

    anyProduct(Product("WashingPowder",60.5,205,"hygiene"))
    anyProduct(Product("table",607.7,950,"funiture"))
    anyProduct(Product("banana",20.0,10,"grocery"))
    println(fruit("mother"))
    println(name(arrayOf("shanizzi","Sandy","Mutana","tandale","kayole","aya")))


}
fun isEven(num: Int):Boolean {
    if (num % 2 == 0) {
        return true
    }
    else {
        if (num%2!=0){
            return false
        }
    }
    return false
}

data class Product(var name:String,var weight:Double,var price:Int,var category: String)

fun anyProduct(products:Product){
    //var  new_product=anyProduct(products)
    var hygieneList= mutableListOf<Product>()
    var gloceriesList= mutableListOf<Product>()
    var otherList= mutableListOf<Product>()
    when(products.category){

        "hygieme"-> hygieneList.add(products)
        "goceries"-> gloceriesList.add(products)
        else-> otherList.add(products)
    }

    println(hygieneList)
    println(gloceriesList)
    println(otherList)
}


fun fruit(name:String):String {
    var nam = ""
    for(i in name){
        if (name.indexOf(i)%2==0)
            nam+=i
    }
    return nam

}

fun name(names:Array<String>):MutableList<String>{
    var nameList = mutableListOf<String>()
    for (oneName in names)
        if(oneName.length%2==0){
            nameList.add(oneName)
        }
    return nameList
}
