package com.mbridge.msdk.out;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public interface OnImageLoadListener {
    void loadError(String str);

    void loadSuccess(Drawable drawable, int i8);
}
