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
    // Var string untuk menyimpan nilai nama depan
    val firstName: String = "Muhamad Malik"

    // Var string untuk menyimpan nilai nama belakang.
    val lastName: String = "Aziz Al Kutbi"

    // Var number untuk menyimpan nilai umur.
    val age: Int = 23

    // Var boolean untuk menyimpan nilai status (single atau tidak)
    val status: Boolean = false

    // Cetak setiap var saat func myProfile di panggil
    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: ${if (status) "Single" else "Tidak Single"}")
    println("")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    val groupId = "LogicLiberators"
    val groupMember = listOf("Diki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")
    val session = "Morning"

    // Cetak nilai dari tiap parameter
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }

    println("Session: $session")

    println("")

    // Mengembalikan nilai
    return " "
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    // Buat var yang berisi daftar anggota grup
    val myTeamMembers = listOf("Diki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")

    // Akses item yang berisi namaku dari variabel tersebut
    val myName = myTeamMembers[4]

    // Cetak namaku ke konsol
    println("Namaku: $myName")
    println("")

    // Mengembalikan daftar anggota grup sebagai nilai return
    return myTeamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    // Mengganti array mentor dengan nama mentor-mentor Anda
    val mentor = arrayOf<String>("Kak Shania", "Kak Kelfin", "Kak Ifan")

    // Mengganti array countOfGroup dengan anggota-anggota grup Anda
    val countOfGroup = arrayOf<String>("Diki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh")

    // Menghitung total dengan rumus total mentor + jumlah anggota group
    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {
    // Memanggil fungsi myProfile
    myProfile()

    // Memanggil fungsi myTeam
    val myTeam = myTeam()
    println("My team is: $myTeam")

    // Memanggil fungsi totalMember dan mencetak hasilnya
    val totalMember = totalMember()
    println("Total Member group: $totalMember")

    println("")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("LogicLiberators",
        listOf("Diki", "Fathiya", "Putu", "Fajar", "Aziz",
        "Tengku", "Marissa", "Farida", "Malik", "Hafizh"),
        "Morning")
}