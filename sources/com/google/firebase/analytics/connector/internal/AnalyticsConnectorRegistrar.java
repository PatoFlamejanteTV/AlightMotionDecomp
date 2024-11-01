package com.google.firebase.analytics.connector.internal;

import D0.C1038c;
import D0.InterfaceC1040e;
import D0.h;
import D0.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1038c> getComponents() {
        return Arrays.asList(C1038c.e(B0.a.class).b(r.l(A0.f.class)).b(r.l(Context.class)).b(r.l(Z0.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                B0.a d8;
                d8 = B0.b.d((A0.f) interfaceC1040e.a(A0.f.class), (Context) interfaceC1040e.a(Context.class), (Z0.d) interfaceC1040e.a(Z0.d.class));
                return d8;
            }
        }).e().d(), k1.h.b("fire-analytics", "22.1.2"));
    }
}
