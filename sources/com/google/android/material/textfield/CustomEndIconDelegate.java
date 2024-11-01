package com.google.android.material.textfield;

import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CustomEndIconDelegate extends EndIconDelegate {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}
