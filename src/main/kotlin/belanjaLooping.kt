fun daftarBelanja(){
    println("=================Menu Toko=================")
    println("1. Fanta     : 7.000      4. Coca-Cola : 7.500")
    println("2. Mie sedap : 3.500      5. Indomie   : 3.500")
    println("3. Nutrisari : 2.000      6. GoodDay   : 2.500")
    println("7. Selesai")
    println("===========================================")
}
fun main() {
    daftarBelanja()
    var totalHarga = mutableListOf<Int>()
    var total = 0
    var x = 0
    var harga = 0
    do {
        print("Masukan Menu : ")
        var pilih = readln()
        when (pilih) {
            "1" -> { println("Anda Membeli Fanta dengan harga @7.000")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 7000
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "2" -> { println("Anda Membeli Mie sedap dengan harga 3.500")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 3500
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "3" -> { println("Anda Membeli Nutrisari dengan harga 2.000")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 2000
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "4" -> { println("Anda Membeli Coca-Cola dengan harga 7.500")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 7500
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "5" -> { println("Anda Membeli Indomie dengan harga 3.500")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 3500
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "6" -> { println("Anda Membeli GoodDay dengan harga 2.500")
                print("Masukan Jumlah beli : ")
                var jumlahBeli = readln().toInt()
                harga = 2500
                totalHarga.add(jumlahBeli * harga)
                total += totalHarga[x]
                x++ }
            "7" -> println("Terima kasih Sudah belanja di sini")
        }
    }
        while (pilih != "7")
        println("====barang yang anda beli adalah=====")
        for (b in totalHarga){
            var nomer = totalHarga.indexOf(b) + 1
            println("harga barang ke $nomer adalah $b")
        }
        println("Total yang harus anda bayar : $total")

}

