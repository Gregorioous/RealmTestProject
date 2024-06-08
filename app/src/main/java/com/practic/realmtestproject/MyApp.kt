package com.practic.realmtestproject

import android.app.Application
import com.practic.realmtestproject.models.Address
import com.practic.realmtestproject.models.Course
import com.practic.realmtestproject.models.Student
import com.practic.realmtestproject.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp:Application() {
    companion object{
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}