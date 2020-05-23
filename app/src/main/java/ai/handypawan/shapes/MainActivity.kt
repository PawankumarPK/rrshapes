package ai.handypawan.shapes

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    /*    val sh = BitmapFactory.decodeResource(this.resources, R.drawable.pawan)
        val bm: Bitmap = Shapes.getCroppedBitmap(sh)
        imageView.setImageBitmap(bm)*/
    }
}
