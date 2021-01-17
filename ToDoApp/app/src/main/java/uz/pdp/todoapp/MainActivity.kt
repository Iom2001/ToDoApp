package uz.pdp.todoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.pdp.todoapp.database.MyDbHelper


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyDbHelper.getHelper(this)
        var list  = MyDbHelper.getHelper(this)?.getToDos()
        var list2  = MyDbHelper.getHelper(this)?.getComments()

    }
}
