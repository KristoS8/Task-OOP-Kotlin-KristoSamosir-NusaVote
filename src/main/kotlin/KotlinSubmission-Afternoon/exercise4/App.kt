package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
     println( contohTryCatch(20, 2))
     println( contohTryCatch(30, 0))

}
fun contohTryCatch(entitas1 : Int, entitas2 : Int) : Int {
    try {
        var hasil= entitas1 / entitas2
        return hasil
    }catch (e : ArithmeticException){
        println("Terjadi kesalahan : ${e.message}")
    }
    return 0
}
/**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

