package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note


//ROOM ESTA RELACIONADO A SQLite, a SQL basicamente.
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() { //lo abstracto sigue la logica de las interfaces.

    abstract val noteDao: NoteDao

    companion object { //el companion object se utiliza para definir variables dentro de la clase
        const val DATABASE_NAME = "notes_db"
    }

}