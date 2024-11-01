package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    @ExperimentalComposeUiApi
    public static final Modifier focusRestorer(Modifier modifier, Function0 function0) {
        return modifier.then(new FocusRestorerElement(function0));
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        return focusRestorer(modifier, function0);
    }

    private static /* synthetic */ void getPrevFocusedChild$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0059, code lost:            continue;     */
    @androidx.compose.ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x003a, code lost:            continue;     */
    @androidx.compose.ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.getFocusState()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4320constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getNode()
            boolean r2 = r2.isAttached()
            if (r2 == 0) goto Lde
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4, r1)
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L37
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4)
            goto L3a
        L37:
            r2.add(r4)
        L3a:
            boolean r4 = r2.isNotEmpty()
            if (r4 == 0) goto Ldd
            int r4 = r2.getSize()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r2.removeAt(r4)
            androidx.compose.ui.Modifier$Node r4 = (androidx.compose.ui.Modifier.Node) r4
            int r6 = r4.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L57
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4)
            goto L3a
        L57:
            if (r4 == 0) goto L3a
            int r6 = r4.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld7
            r6 = 0
            r7 = r6
        L62:
            if (r4 == 0) goto L3a
            boolean r8 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L96
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            androidx.compose.ui.focus.FocusStateImpl r8 = r4.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 == 0) goto Ld2
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            int r0 = r0.getCompositeKeyHash()
            r11.setPreviouslyFocusedChildHash(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L95
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>(r11)
            java.lang.String r11 = "previouslyFocusedChildHash"
            r0.registerProvider(r11, r1)
        L95:
            return r5
        L96:
            int r8 = r4.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto Ld2
            boolean r8 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Ld2
            r8 = r4
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = 0
        La9:
            if (r8 == 0) goto Lcf
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Lca
            int r9 = r9 + 1
            if (r9 != r5) goto Lb8
            r4 = r8
            goto Lca
        Lb8:
            if (r7 != 0) goto Lc1
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r3]
            r7.<init>(r10, r1)
        Lc1:
            if (r4 == 0) goto Lc7
            r7.add(r4)
            r4 = r6
        Lc7:
            r7.add(r8)
        Lca:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto La9
        Lcf:
            if (r9 != r5) goto Ld2
            goto L62
        Ld2:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L62
        Ld7:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L57
        Ldd:
            return r1
        Lde:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
