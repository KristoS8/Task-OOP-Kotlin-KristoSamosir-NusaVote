package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    var namaDepan: String = "Kristo"
    var namaBelakang: String = "Samosir"
    var umur: Int = 20
    var status: Boolean = true

    if (status){
        println("Nama Saya Adalah $namaDepan $namaBelakang, Umur Saya $umur, Saya Berstatus Single")
    }else{
        println("Nama Saya Adalah $namaDepan $namaBelakang, Umur Saya $umur, Saya Berstatus sudah ada yang punya")
    }

}
/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val myGrup = "=====Group Detail======\n" +
            "Id Grup : $groupId, groupMember : $groupMember , Session : $session"
    return println(myGrup)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    var anggotaGrup = listOf("Alfian Diva Awangga", "Kristo Samosir", "Linda Erlinda Sari", "Muhammad Fachrizal Akbar", "Birrul Hasibuan")
    return listOf(anggotaGrup[1])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak peja", "Kak Ilham")
    val countOfGroup = arrayOf<String>("Alfian Diva Awangga", "Kristo Samosir", "Linda Erlinda Sari", "Muhammad Fachrizal Akbar", "Birrul Hasibuan")

    var total = mentor.count() + countOfGroup.count()

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("10", groupMember = listOf("Alfian Diva Awangga", "Kristo Samosir", "Linda Erlinda Sari", "Muhammad Fachrizal Akbar", "Birrul Hasibuan"), "Afternoon")

}