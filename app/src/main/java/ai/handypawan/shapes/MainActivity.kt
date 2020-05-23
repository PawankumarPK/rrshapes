package ai.handypawan.shapes

import ai.handypawan.bitmapimage.Shapes
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val shapes = Shapes()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val bitmap = BitmapFactory.decodeResource(resources,R.drawable.pawan)
        mImageview.setImageBitmap( shapes.getCroppedBitmap(bitmap))*/
    }
}
