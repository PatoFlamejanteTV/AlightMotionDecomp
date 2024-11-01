package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        int a9 = aVar.a(context, str, true);
        c0377b.f16200b = a9;
        if (a9 != 0) {
            c0377b.f16201c = 1;
        } else {
            int b9 = aVar.b(context, str);
            c0377b.f16199a = b9;
            if (b9 != 0) {
                c0377b.f16201c = -1;
            }
        }
        return c0377b;
    }
}
