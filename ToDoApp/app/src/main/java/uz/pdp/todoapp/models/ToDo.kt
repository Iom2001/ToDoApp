package uz.pdp.todoapp.models

import android.database.Cursor

class ToDo{

    var id:Int
    var name:String
    var description:String
    var degree:String
    var date:String
    var dedline:String

    constructor(
        id: Int,
        name: String,
        description: String,
        degree: String,
        date: String,
        dedline: String
    ) {
        this.id = id
        this.name = name
        this.description = description
        this.degree = degree
        this.date = date
        this.dedline = dedline
    }
}