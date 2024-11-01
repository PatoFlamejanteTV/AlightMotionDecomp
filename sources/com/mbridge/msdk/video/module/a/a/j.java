package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ac;

/* loaded from: classes4.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    private int f23779a;

    public j(ImageView imageView, int i8) {
        super(imageView);
        this.f23779a = i8;
    }

    @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a9;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f23773b != null && !bitmap.isRecycled() && (a9 = ac.a(bitmap, 1, this.f23779a)) != null) {
                this.f23773b.setImageBitmap(a9);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
