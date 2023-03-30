
import java.time.*
import java.util.Scanner
import kotlin.math.ln


fun main() {
    var tanggal = LocalDate.now()
    println(tanggal)

    print("Inputkan Nama : ")
    val nama = readLine()
    print("Inputkan Usia : ")
    val usia = readln()
    if ( usia.toInt() >= 15){
        println("Sekarang tanggal $tanggal Nama Saya $nama , usia saya $usia dan saya sudah dewasa")
    }
    else{
        println("Sekarang tanggal $tanggal Nama Saya $nama , usia saya $usia dan saya masih anak-anak")

    }

//    val localDate = LocalDate.now()
//    println("Tanggal hari ini: "+localDate)
//
//    val range = 0..1000
//    println(range.contains(10))
//    println(range.contains(10000))
//
//    var Segitiga : Double = 0.5 * 10 * 4
//    println(Segitiga)
}


