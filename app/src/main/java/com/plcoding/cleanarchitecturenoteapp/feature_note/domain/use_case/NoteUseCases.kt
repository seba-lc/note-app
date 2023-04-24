package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

//Dice que le parece mas limpio hacer una sola clase con todos los use cases
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
