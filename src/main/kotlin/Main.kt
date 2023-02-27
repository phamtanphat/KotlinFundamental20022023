fun main(args: Array<String>) {
//     Dấu // gọi comment
//     1: Khai báo biến
//     mutable, immutable
//
//     Từ khóa khai báo biến là var
//    var name = "Phạm Tấn Phát"
//    name = "Phạm Tấn Phát 1"
//    print(name)
//     Từ khóa khai báo val
//    val pi = 3.14
//    val address = "199 Lý thường kiệt"

//     2: Kiểu dữ liệu
//     Kiểu String: Chuỗi
//    var text: String = "Hello"
//     Kiểu số nguyên: Int, Long
//    var age: Int = 29
//     Kiểu số thực: Float, Double
//    var weight: Float = 74.9f
//    var query = """
//        SELECT * FROM TableName
//        WHERE ID = 1
//        ORDER BY DESC
//    """.trimIndent()
//    print(query)
//    Kiểu lý luận: Boolean
//     var isMale: Boolean = true

//    3: Toán tử
    // Dấu + mà xử lý với chuỗi thì mang tính chất là phép nối chuỗi
    // String interpolation: Dùng để truyền biến vào 1 chuỗi
    var number1 = 5
    var number2 = number1++
    var number3 = ++number1

    print("Number2 : " + number2)
    print("Number2 : $number2")
//    number1 = number1 + 1
//    number1 += 1
//    ++number1
//    number1++
}
