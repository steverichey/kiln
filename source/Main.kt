import kiln.swing.Window
import kiln.swing.CloseOperation

// start here
fun main(args: Array<String>) {
  val window = Window(640, 480)
  window.title = "KilnDemo"
  window.defaultCloseOperation = CloseOperation.Exit
  window.show()
}
