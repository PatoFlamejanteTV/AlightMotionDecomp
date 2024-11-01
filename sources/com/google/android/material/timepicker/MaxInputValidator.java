package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes3.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i8) {
        this.max = i8;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i10, i11, charSequence.subSequence(i8, i9).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i8) {
        this.max = i8;
    }
}
