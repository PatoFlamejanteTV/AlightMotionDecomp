package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {101}, m = "establishTextInputSession")
/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
    }
}
