package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    var nilaiAnda = 98

    if (nilaiAnda>=90){
        println("Selamat! Anda mendapatkan nilai A.")
    }else if(nilaiAnda>=80 && nilaiAnda<=89){
        println("Anda mendapatkan nilai B.")
    }else if(nilaiAnda>=70 && nilaiAnda<=79){
        println("Anda mendapatkan nilai C.")
    }else if (nilaiAnda>=60 && nilaiAnda<=69){
        println("Anda mendapatkan nilai D.")
    }else if (nilaiAnda<60){
        println("Anda mendapatkan nilai E.")
    }

}