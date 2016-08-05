
class SubscribingUser(val email: String) {
    val nickname: String
        get() {
            return email.substringBefore("@")
        }
    /*
    or
        get() = email.substringBefore("@")
     */
}

/* Changing Accessor Visibility */
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}


fun main(args: Array<String>) {
    val user = SubscribingUser("user@mail.com")
    println(user.nickname)

    val counter = LengthCounter()
    // counter.counter = 10 [error]
    counter.addWord("hello")
    println(counter.counter)
}