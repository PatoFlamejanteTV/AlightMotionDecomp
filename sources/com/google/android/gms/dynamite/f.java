package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        int i8 = 0;
        int a9 = aVar.a(context, str, false);
        c0377b.f16200b = a9;
        if (a9 != 0) {
            i8 = 1;
        }
        c0377b.f16201c = i8;
        return c0377b;
    }
}
