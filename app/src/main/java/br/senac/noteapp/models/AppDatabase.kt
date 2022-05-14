package br.senac.noteapp.models

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Note::class), version = 1)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}
