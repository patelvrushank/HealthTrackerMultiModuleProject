package com.vrushank.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.vrushank.core_ui.LocalSpacing

@Composable
fun ActionButton(text:String,
                 onClick: () -> Unit,
                 modifier: Modifier = Modifier,
                 isEnable:Boolean =true,
                 ) {
    Button(onClick = onClick, modifier = modifier, enabled = isEnable, shape = RoundedCornerShape(100.dp)) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(LocalSpacing.current.spaceSmall)
        )
    }

}