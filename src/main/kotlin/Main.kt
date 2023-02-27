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
//    var number1 = 5
//    var number2 = 7
//
//    var result = ++number1 - --number2 + number1++ - number2++ + number2--
    // 6 - --number2 + number1++ - number2++ + number2--; a + 6, b = 7
    // 6 - 6 + number1++ - number2++ + number2--; a = 6, b = 6
    // 6 - 6 + 6 - number2++ + number2--; a = 7, b = 6
    // 6 - 6 + 6 - 6 + number2--; a = 7, b = 7
    // 6 - 6 + 6 - 6 + 7; a = 7, b = 6

    // number1 = 7, number2 = 6, result = 7

//    println("Number1: $number1")
//    println("Number2: $number2")
//    println("Result: $result")

    // Toán tử variable++
    // Thực hiện phép gán
    // Thực hiện tăng giá trị variable lên thêm 1

    // number1 =6, number2 = 6, result = 6
    // number1: 7  ; number 2:6  ; number:7
    // number1 = 5, number2 = 7, result = 7

//    4: Câu điều kiện => Đưa ra các trường hợp để có thể giải quyết

    // So sanh 2 số nếu
    // a > b => in ra la 1
    // a < b => in ra -1
    // a == b => in ra 0

//    var a = 5
//    var b = 5

    // magic number

//    if (a > b) {
//        print("A lon hon b")
//    } else if (a < b) {
//        print("A be hon b")
//    } else {
//        print("A bang b")
//    }

    // Tính bmi : cân nặng / chiều cao * chiều cao

    var weight = 74.5f
    var height = 1.75f

    var bmi = ??

    // In
    // Chỉ số cơ thể: ?
    // Tình trạng sức khỏe: ?

}

