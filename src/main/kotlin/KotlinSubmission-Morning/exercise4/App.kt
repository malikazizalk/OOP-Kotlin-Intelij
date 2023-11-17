package id.infinitelearning.KotlinSubmission.exercise4


/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

//custom exeption
//class ValidationExeption(message : String) : Throwable (message)
//fun ValidationAndSayHello(name: String){
//    if (name.isBlank()) {
//        throw ValidationExeption("Silahkan Masukkan Nama anda")
//    } else {
//        println("hello $name")
//    }
//}

fun main() {
//    try {
//        ValidationAndSayHello("aziz")
//        ValidationAndSayHello("")
//    } catch (error: ValidationExeption){
//        println("terjadi error ${error.message}")
//    }
//}
    print("Masukkan angka: ")
    val userInput = readLine()

    try {
        // Mengonversi input menjadi Int
        val number = userInput?.toInt()

        // Menampilkan hasil
        if (number != null) {
            println("Angka yang dimasukkan adalah: $number")
        } else {
            println("Input tidak valid.")
        }
    } catch (error: NumberFormatException) {
        // return error jika input tidak dapat diubah menjadi Int
        println("Error: Input tidak dapat diubah menjadi angka.")
    }
}

