package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PlatformTextInputMethodRequest $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ n6.M $coroutineScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n6.M m8) {
            super(0);
            this.$coroutineScope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4418invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4418invoke() {
            n6.N.d(this.$coroutineScope, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$2(PlatformTextInputMethodRequest platformTextInputMethodRequest) {
        super(1);
        this.$request = platformTextInputMethodRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InputMethodSession invoke(n6.M m8) {
        return new InputMethodSession(this.$request, new AnonymousClass1(m8));
    }
}
