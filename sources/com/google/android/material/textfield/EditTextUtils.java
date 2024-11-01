package com.google.android.material.textfield;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isEditable(@NonNull EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }
}
