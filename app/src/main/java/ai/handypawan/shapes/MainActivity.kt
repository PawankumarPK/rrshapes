package ai.handypawan.shapes

import ai.handypawan.bitmapimage.Shapes
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.mImageview)
        val sh = BitmapFactory.decodeResource(this.resources, R.drawable.pawan)
        imageView.setImageBitmap(Shapes.getCroppedBitmap(sh))

    }
}
