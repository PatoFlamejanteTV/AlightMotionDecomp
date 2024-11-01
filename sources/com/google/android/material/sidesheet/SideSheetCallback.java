package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class SideSheetCallback implements SheetCallback {
    /* JADX INFO: Access modifiers changed from: package-private */
    public void onLayout(@NonNull View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@NonNull View view, float f8);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@NonNull View view, int i8);
}
