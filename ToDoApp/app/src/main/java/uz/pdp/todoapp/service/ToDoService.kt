package uz.pdp.todoapp.service

import android.database.Cursor
import uz.pdp.todoapp.models.Comment
import uz.pdp.todoapp.models.ToDo

interface ToDoService {

    fun getToDos():List<ToDo>

    fun getComments():List<Comment>
}