package sanchez.omar.componets

import android.annotation.SuppressLint
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import org.junit.Rule
import org.junit.Test

class ButtonTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_6,
        renderingMode = SessionParams.RenderingMode.V_SCROLL,
    )

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Test
    fun `Button test`() = paparazzi.snapshot {
        OmarButtonPreview()
    }
}