package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNote (
    private val repository: NoteRepository
        ) {


    //por lo que entiendo cumple el mismo papel que el init. Como su nombre lo dice, es una invocacion
    //lo relaciono con el useEffect de react, y seria lo que retorna la clase GetNote
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}