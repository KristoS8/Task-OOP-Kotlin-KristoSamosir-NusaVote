package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    println("List Bilangan Genap Dari 1 hingga 100")
    val listOfNumber = mutableListOf<Int>()
    var indexNumber = 0


    for (i in 1..100){
        if (i%2==0){
            listOfNumber.add(indexNumber++, i)
        }
    }

    print("$listOfNumber ")
    println("\n")


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
     */
    // Buat di bawah sini


    val month = mapOf(
    "Jane" to "January",
    "Feby" to "February",
    "Mar" to "March",
    "Apr" to "April",
    "Mei" to "May",
    "Jun" to "June",
    "Jul" to "July",
    "Agus" to "August",
    "Septian" to "September",
    "Oktin" to "October",
    "Nova" to "November",
    "Desi" to "December"
    )
    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    */
    // Buat di bawah sini
    month.forEach{index, value-> println(index +"->" +  value) }
    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
    */
    // Buat di bawah sini
    var monthNow = month.get("Nova")
    var birthMonth = month.get("Oktin")
    println("It's {$monthNow} now, I was born in {$birthMonth}")


}