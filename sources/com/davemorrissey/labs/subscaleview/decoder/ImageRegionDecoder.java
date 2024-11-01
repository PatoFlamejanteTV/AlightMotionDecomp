package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface ImageRegionDecoder {
    @NonNull
    Bitmap decodeRegion(@NonNull Rect rect, int i8);

    @NonNull
    Point init(Context context, @NonNull Uri uri) throws Exception;

    boolean isReady();

    void recycle();
}
