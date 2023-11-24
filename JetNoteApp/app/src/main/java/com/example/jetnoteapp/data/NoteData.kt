package com.example.jetnoteapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.jetnoteapp.model.Note

class NotesDataSource {
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "desc1"),
            Note(title = "Android Compose", description = "desc2"),
            Note(title = "Keep at it...", description = "desc3"),
            Note(title = "A movie day", description = "desc4")
        )
    }
}