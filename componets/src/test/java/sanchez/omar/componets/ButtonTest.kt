package sanchez.omar.componets

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
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
    fun `Button enabled and not loading`() = paparazzi.snapshot {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            OmarButton(
                enabled = true,
                loading = false,
                content = { Text(text = "Click button") }) {}
        }
    }

    @Test
    fun `Button not enabled and not loading`() = paparazzi.snapshot {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            OmarButton(
                enabled = false,
                loading = false,
                content = { Text(text = "Click button") }) {}
        }
    }

    @Test
    fun `Button enabled and loading`() = paparazzi.snapshot {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            OmarButton(
                enabled = true,
                loading = true,
                content = { Text(text = "Click button") }) {}
        }
    }

    @Test
    fun `Button not enabled and loading`() = paparazzi.snapshot {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            OmarButton(
                enabled = false,
                loading = true,
                content = { Text(text = "Click button") }) {}
        }
    }
}