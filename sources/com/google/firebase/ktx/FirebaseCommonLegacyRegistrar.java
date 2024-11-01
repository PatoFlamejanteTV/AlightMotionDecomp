package com.google.firebase.ktx;

import D0.C1038c;
import R5.AbstractC1435t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import k1.h;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1038c> getComponents() {
        return AbstractC1435t.e(h.b("fire-core-ktx", "21.0.0"));
    }
}
