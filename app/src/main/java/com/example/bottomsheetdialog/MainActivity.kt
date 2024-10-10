package com.example.bottomsheetdialog

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Recebe o ID do bottom sheet e o passa para a variável bottomSheet
        val bottomSheet = findViewById<FrameLayout>(R.id.sheet)
        // Cria uma instância de BottomSheetBehavior a partir do bottomSheet
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        // Configura a altura inicial visível do Bottom Sheet
        bottomSheetBehavior.peekHeight = 200
        // Define o estado inicial do Bottom Sheet como colapsado
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }
}