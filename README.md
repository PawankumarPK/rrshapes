# rrshapes

![Screenshot from 2020-05-24 00-43-09](https://user-images.githubusercontent.com/32340284/82739139-c53dca80-9d5a-11ea-8737-689e1fc14a10.png)

**Create a circular ImageView in Android**

### USAGE
**Step 1. `Add it in your root build.gradle at the end of repositories:`**
```

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2. `Add the dependency`**

```
dependencies {
        implementation 'com.github.PawankumarPK:rrshapes:1.4'
}

```
### JAVA CLASS
In your Activity/Fragment class


        ImageView imageView = findViewById(R.id.mImageView);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pawan);
        imageView.setImageBitmap(Shapes.getCroppedBitmap(bitmap));


### KOTLIN CLASS

        val bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.pawan)
        mImageView.setImageBitmap(Shapes.getCroppedBitmap(bitmap))


### SUPPORT

Find this library useful? And [follow me](https://github.com/PawankumarPK) for my next creations 

### LICENSE
CircularImageView by [Pawan Kumar](https://github.com/PawankumarPK) is licensed under an [MIT License](https://github.com/PawankumarPK/rrshapes/blob/master/LICENSE)



