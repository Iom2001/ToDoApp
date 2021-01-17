package uz.pdp.todoapp.models

class Comment {
    var id:Int
    var task_id:Int
    var comment_text:String

    constructor(id: Int, task_id: Int, comment_text: String) {
        this.id = id
        this.task_id = task_id
        this.comment_text = comment_text
    }
}