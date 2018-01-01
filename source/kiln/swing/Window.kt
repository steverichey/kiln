package kiln.swing

import javax.swing.JFrame

class Window(val width: Int, val height: Int) {
  private val frame = JFrame()

  var defaultCloseOperation = CloseOperation.Nothing
    get() = field
    set(value) {
      if (value != field) {
        frame.setDefaultCloseOperation(value.rawValue)
      }
    }

  var title: String? = null
    get() = field
    set(value) {
      frame.setTitle(value)
    }

  init {
    frame.setSize(width, height)
  }

  fun show() {
    frame.setVisible(true)
  }
}

enum class CloseOperation(val rawValue: Int) {
  Hide(JFrame.HIDE_ON_CLOSE),
  Dispose(JFrame.DISPOSE_ON_CLOSE),
  Nothing(JFrame.DO_NOTHING_ON_CLOSE),
  Exit(JFrame.EXIT_ON_CLOSE)
}
