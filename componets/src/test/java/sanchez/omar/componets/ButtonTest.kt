package sanchez.omar.componets

import org.junit.Test

class ButtonTest : PaparazziTest() {
    
    @Test
    fun `Button test`() = paparazzi.snapshot {
        OmarButtonPreview()
    }
}