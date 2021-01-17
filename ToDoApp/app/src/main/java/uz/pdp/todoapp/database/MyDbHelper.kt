package uz.pdp.todoapp.database

import android.content.Context
import uz.pdp.todoapp.db.DBHelper
import uz.pdp.todoapp.models.Comment
import uz.pdp.todoapp.models.ToDo
import uz.pdp.todoapp.service.ToDoService
import uz.pdp.todoapp.utils.DATABASE_NAME
import uz.pdp.todoapp.utils.TABLE_COMMENT
import uz.pdp.todoapp.utils.TABLE_TODO

class MyDbHelper private constructor(context: Context) :
    DBHelper(context, DATABASE_NAME), ToDoService {

    companion object {

        private var helper: MyDbHelper? = null

        fun getHelper(context: Context): MyDbHelper? {
            if (helper == null) {
                helper = MyDbHelper(context)
            }
            return helper
        }
    }

    override fun getToDos(): List<ToDo>{
        var todoList:ArrayList<ToDo> = ArrayList()
        var allTodoQuery = "select * from $TABLE_TODO"
        var cursor = mDatabase.rawQuery(allTodoQuery,null)

        if (cursor.moveToFirst()){
            do {
                var todo = ToDo(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5)
                )
                todoList.add(todo)
            }while (cursor.moveToNext())
        }
        return todoList
    }

    override fun getComments(): List<Comment>{
        var commentList:ArrayList<Comment> = ArrayList()
        var allCommentQuery = "select * from $TABLE_COMMENT"
        var cursor = mDatabase.rawQuery(allCommentQuery,null)

        if (cursor.moveToFirst()){
            do {
                var comment = Comment(
                    cursor.getInt(0),
                    cursor.getInt(1),
                    cursor.getString(2)
                )
                commentList.add(comment)
            }while (cursor.moveToNext())
        }
        return commentList
    }


}