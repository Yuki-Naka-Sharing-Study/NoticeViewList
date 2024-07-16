import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.noticeviewlist.R

@Preview(showBackground = true)
@Composable
fun NoticeViewList() {
    Row (
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween, Alignment.CenterVertically
    ){
        Text(text = "あいうえお、かきくけこ、さしすせそ、たちつてと、なにぬねの、",
            Modifier
                .padding(8.dp, 8.dp, 0.dp, 8.dp)
                .weight(1f, fill = false),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontSize = 12.sp
        )
        Image(painter = painterResource(id = R.drawable.close),
            contentDescription = "閉じるボタン",
            Modifier.padding(0.dp, 8.dp, 8.dp, 8.dp)
        )
    }
}