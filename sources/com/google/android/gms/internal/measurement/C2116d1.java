package com.google.android.gms.internal.measurement;

import Q.AbstractC1396p;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C2125e1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116d1 extends C2125e1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f16679e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f16680f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Context f16681g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f16682h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f16683i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2116d1(C2125e1 c2125e1, String str, String str2, Context context, Bundle bundle) {
        super(c2125e1);
        this.f16679e = str;
        this.f16680f = str2;
        this.f16681g = context;
        this.f16682h = bundle;
        this.f16683i = c2125e1;
    }

    @Override // com.google.android.gms.internal.measurement.C2125e1.a
    public final void a() {
        boolean D8;
        String str;
        String str2;
        String str3;
        P0 p02;
        boolean z8;
        P0 p03;
        String str4;
        String str5;
        try {
            D8 = this.f16683i.D(this.f16679e, this.f16680f);
            if (D8) {
                String str6 = this.f16680f;
                String str7 = this.f16679e;
                str5 = this.f16683i.f16693a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC1396p.l(this.f16681g);
            C2125e1 c2125e1 = this.f16683i;
            c2125e1.f16701i = c2125e1.c(this.f16681g, true);
            p02 = this.f16683i.f16701i;
            if (p02 == null) {
                str4 = this.f16683i.f16693a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a9 = DynamiteModule.a(this.f16681g, ModuleDescriptor.MODULE_ID);
            int c8 = DynamiteModule.c(this.f16681g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a9, c8);
            if (c8 < a9) {
                z8 = true;
            } else {
                z8 = false;
            }
            C2107c1 c2107c1 = new C2107c1(106000L, max, z8, str, str2, str3, this.f16682h, l0.n.a(this.f16681g));
            p03 = this.f16683i.f16701i;
            ((P0) AbstractC1396p.l(p03)).initialize(Y.b.s0(this.f16681g), c2107c1, this.f16702a);
        } catch (Exception e8) {
            this.f16683i.p(e8, true, false);
        }
    }
}
