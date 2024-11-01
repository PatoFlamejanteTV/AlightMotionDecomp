package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        int a9;
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        int b9 = aVar.b(context, str);
        c0377b.f16199a = b9;
        int i8 = 1;
        int i9 = 0;
        if (b9 != 0) {
            a9 = aVar.a(context, str, false);
            c0377b.f16200b = a9;
        } else {
            a9 = aVar.a(context, str, true);
            c0377b.f16200b = a9;
        }
        int i10 = c0377b.f16199a;
        if (i10 == 0) {
            if (a9 == 0) {
                i8 = 0;
                c0377b.f16201c = i8;
                return c0377b;
            }
        } else {
            i9 = i10;
        }
        if (a9 < i9) {
            i8 = -1;
        }
        c0377b.f16201c = i8;
        return c0377b;
    }
}
