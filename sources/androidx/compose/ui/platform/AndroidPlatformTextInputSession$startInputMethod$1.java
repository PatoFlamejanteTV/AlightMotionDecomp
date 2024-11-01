package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {69}, m = "startInputMethod")
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, U5.d dVar) {
        super(dVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startInputMethod(null, this);
    }
}
