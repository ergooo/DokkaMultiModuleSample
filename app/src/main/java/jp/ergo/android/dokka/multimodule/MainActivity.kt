package jp.ergo.android.dokka.multimodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.ergo.android.dokka.lib1.Lib1
import jp.ergo.android.dokka.lib2.Lib2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lib1().doLib1()
        Lib2().doLib2()
    }
}
