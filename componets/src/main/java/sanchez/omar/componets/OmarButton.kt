package sanchez.omar.componets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OmarButton(
    loading: Boolean = false,
    enabled: Boolean = true,
    content: @Composable () -> Unit,
    onClick: () -> Unit,
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        onClick = onClick,
        enabled = enabled,
        content = {
            if (loading) {
                CircularProgressIndicator(
                    color = MaterialTheme.colorScheme.onTertiary
                )
            } else {
                content()
            }
        })
}

@Composable
@Preview(showBackground = true)
private fun OmarButtonPreview() = Box(modifier = Modifier.fillMaxSize()) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        OmarButton(content = { Text(text = "Click button") }) {}
        OmarButton(enabled = false, content = { Text(text = "Click button") }) {}
        OmarButton(loading = true, content = { Text(text = "Click button") }) {}
        OmarButton(loading = true, enabled = false, content = { Text(text = "Click button") }) {}
    }
}