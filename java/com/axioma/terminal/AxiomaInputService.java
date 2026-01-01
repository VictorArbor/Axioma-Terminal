package com.axioma.terminal;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.inputmethod.InputConnection;
public class AxiomaInputService extends InputMethodService {
    @Override
    public View onCreateInputView() { return null; }
    public void onText(CharSequence text) {
        InputConnection ic = getCurrentInputConnection();
        if (ic != null) { ic.commitText(text, 1); }
    }
}

