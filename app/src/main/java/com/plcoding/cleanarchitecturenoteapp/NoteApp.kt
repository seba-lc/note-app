package com.plcoding.cleanarchitecturenoteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//A ESTA CLASE LA REGISTRA EN EL MANIFEST. SEGUN YO TIENE QUE VER CON LAS VARIABLES DE CONTEXTO LAS MISMAS DE JS
@HiltAndroidApp
class NoteApp : Application() {
}