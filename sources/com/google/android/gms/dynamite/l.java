package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l implements DynamiteModule.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f16203a;

    public l(int i8, int i9) {
        this.f16203a = i8;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z8) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return this.f16203a;
    }
}
