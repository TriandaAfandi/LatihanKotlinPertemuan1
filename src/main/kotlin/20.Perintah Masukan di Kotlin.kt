fun main(args: Array<String>) {
    //Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!. Secara default perintah masukkan di Kotlin akan mengembalikan nilai String ke dalam variabel penampung.

    //Parrot program
    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}

