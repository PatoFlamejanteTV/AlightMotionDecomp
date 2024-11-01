package androidx.activity;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C3289v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCallback$1 extends C3289v implements Function0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OnBackPressedDispatcher$addCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m73invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m73invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
