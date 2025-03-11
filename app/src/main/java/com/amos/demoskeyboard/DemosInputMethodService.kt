package com.amos.demoskeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.view.LayoutInflater

class DemosInputMethodService : InputMethodService() {
    override fun onCreateInputView(): View {
        return LayoutInflater.from(this).inflate(R.layout.keyboard_view, null)
    }
}
