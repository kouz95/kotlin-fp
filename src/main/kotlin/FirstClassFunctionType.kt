import java.util.*

typealias Converter<T> = (T) -> T

fun <T> convert(value: T, converter: Converter<T>): T = converter(value)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val value = input.nextDouble()
    println(convert(value) { it * 10 })
}