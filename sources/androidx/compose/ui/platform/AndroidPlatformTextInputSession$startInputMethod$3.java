package androidx.compose.ui.platform;

import Q5.C1413h;
import androidx.compose.ui.text.input.TextInputService;
import c6.InterfaceC2072n;
import n6.C3472p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, U5.d dVar) {
        super(2, dVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, dVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(InputMethodSession inputMethodSession, U5.d dVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, dVar)).invokeSuspend(Q5.I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextInputService textInputService;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q5.t.b(obj);
        } else {
            Q5.t.b(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            C3472p c3472p = new C3472p(V5.b.c(this), 1);
            c3472p.B();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            c3472p.f(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            if (y8 == e8) {
                return e8;
            }
        }
        throw new C1413h();
    }
}
