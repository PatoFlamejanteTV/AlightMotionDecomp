package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.InternalComposeUiApi;

/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> LocalPlatformTextInputMethodOverride = CompositionLocalKt.staticCompositionLocalOf(PlatformTextInputModifierNodeKt$LocalPlatformTextInputMethodOverride$1.INSTANCE);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode r4, c6.InterfaceC2072n r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            Q5.t.b(r6)
            goto L5d
        L31:
            Q5.t.b(r6)
            androidx.compose.ui.Modifier$Node r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L63
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            androidx.compose.runtime.CompositionLocalMap r6 = r6.getCompositionLocalMap()
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.PlatformTextInputSessionHandler> r2 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.LocalPlatformTextInputMethodOverride
            java.lang.Object r6 = r6.get(r2)
            androidx.compose.ui.platform.PlatformTextInputSessionHandler r6 = (androidx.compose.ui.platform.PlatformTextInputSessionHandler) r6
            if (r6 != 0) goto L54
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r4)
        L54:
            r0.label = r3
            java.lang.Object r4 = r6.textInputSession(r5, r0)
            if (r4 != r1) goto L5d
            return r1
        L5d:
            Q5.h r4 = new Q5.h
            r4.<init>()
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode, c6.n, U5.d):java.lang.Object");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalComposeUiApi
    public static final ProvidableCompositionLocal<PlatformTextInputSessionHandler> getLocalPlatformTextInputMethodOverride() {
        return LocalPlatformTextInputMethodOverride;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getLocalPlatformTextInputMethodOverride$annotations() {
    }
}
