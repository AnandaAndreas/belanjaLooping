fun penjumlahan(angka1:Int, angka2:Int): Int{

    print("Masukan angka 1 : ")
    var angka1 = readln().toInt()
    print("Masukan angka 2 : ")
    var angka2 = readln().toInt()

    var hasilPenjumlahan = angka1 + angka2
    return hasilPenjumlahan

}

fun pembagian(angkaBagi:Int): Int{
    print("Masukan pembagian : ")
    var angkaBagi = readln().toInt()
    return angkaBagi
}

fun main() {
//    println("hasil penjumlahan dari angka 1 dan angka 2 = " $)
    var jumlah = penjumlahan(1,1)
    print("Hasil dari penjumlahan = ")
    println(jumlah)

    var bagi = pembagian(1)
    var hasilBagi= jumlah / bagi
    print("Hasil $jumlah / $bagi = ")
    println(hasilBagi)
}