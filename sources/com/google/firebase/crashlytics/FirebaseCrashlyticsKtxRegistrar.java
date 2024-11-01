package com.google.firebase.crashlytics;

import D0.C1038c;
import R5.AbstractC1435t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1038c> getComponents() {
        return AbstractC1435t.m();
    }
}
