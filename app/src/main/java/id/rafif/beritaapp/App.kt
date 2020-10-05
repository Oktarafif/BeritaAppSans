package id.rafif.beritaapp

import android.app.Application

/**
 * Created by Imam Fahrur Rofi on 03/06/2020.
 * https://stackoverflow.com/a/46938919
 */
class App : Application() {
    companion object {
        lateinit var context: App private set
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}
