package androidx.compose.runtime.changelist;

import Q5.C1413h;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FixupList implements OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(Function0 function0, int i8, Anchor anchor) {
        int i9;
        Operations operations;
        Operations operations2 = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations2.pushOp(insertNodeFixup);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations2);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), function0);
        Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl, Operation.IntParameter.m2511constructorimpl(0), i8);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(1), anchor);
        if (operations2.pushedIntMask == operations2.createExpectedArgMask(insertNodeFixup.getInts()) && operations2.pushedObjectMask == operations2.createExpectedArgMask(insertNodeFixup.getObjects())) {
            Operations operations3 = this.pendingOperations;
            Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
            operations3.pushOp(postInsertNodeFixup);
            Operations m2550constructorimpl2 = Operations.WriteScope.m2550constructorimpl(operations3);
            Operations.WriteScope.m2555setIntA6tL2VI(m2550constructorimpl2, Operation.IntParameter.m2511constructorimpl(0), i8);
            Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl2, Operation.ObjectParameter.m2522constructorimpl(0), anchor);
            if (operations3.pushedIntMask == operations3.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations3.pushedObjectMask == operations3.createExpectedArgMask(postInsertNodeFixup.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = postInsertNodeFixup.getInts();
            int i10 = 0;
            for (int i11 = 0; i11 < ints; i11++) {
                if (((1 << i11) & operations3.pushedIntMask) != 0) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(postInsertNodeFixup.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i11)));
                    i10++;
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int objects = postInsertNodeFixup.getObjects();
            int i12 = 0;
            int i13 = 0;
            while (i13 < objects) {
                if (((1 << i13) & operations3.pushedObjectMask) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    operations = operations3;
                    sb3.append(postInsertNodeFixup.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i13)));
                    i12++;
                } else {
                    operations = operations3;
                }
                i13++;
                operations3 = operations;
            }
            String sb4 = sb3.toString();
            AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb2 + ") and " + i12 + " object arguments (" + sb4 + ").").toString());
        }
        StringBuilder sb5 = new StringBuilder();
        int ints2 = insertNodeFixup.getInts();
        int i14 = 0;
        for (int i15 = 0; i15 < ints2; i15++) {
            if ((operations2.pushedIntMask & (1 << i15)) != 0) {
                if (i14 > 0) {
                    sb5.append(", ");
                }
                sb5.append(insertNodeFixup.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i15)));
                i14++;
            }
        }
        String sb6 = sb5.toString();
        AbstractC3292y.h(sb6, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb7 = new StringBuilder();
        int objects2 = insertNodeFixup.getObjects();
        int i16 = 0;
        int i17 = 0;
        while (i16 < objects2) {
            if (((1 << i16) & operations2.pushedObjectMask) != 0) {
                if (i14 > 0) {
                    sb7.append(", ");
                }
                i9 = objects2;
                sb7.append(insertNodeFixup.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i16)));
                i17++;
            } else {
                i9 = objects2;
            }
            i16++;
            objects2 = i9;
        }
        String sb8 = sb7.toString();
        AbstractC3292y.h(sb8, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i14 + " int arguments (" + sb6 + ") and " + i17 + " object arguments (" + sb8 + ").").toString());
    }

    public final void endNodeInsert() {
        if (this.pendingOperations.isNotEmpty()) {
            this.pendingOperations.popInto(this.operations);
        } else {
            ComposerKt.composeRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new C1413h();
        }
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (this.pendingOperations.isEmpty()) {
            this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
        } else {
            ComposerKt.composeRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new C1413h();
        }
    }

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(str));
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final <V, T> void updateNode(V v8, InterfaceC2072n interfaceC2072n) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m2550constructorimpl = Operations.WriteScope.m2550constructorimpl(operations);
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, Operation.ObjectParameter.m2522constructorimpl(0), v8);
        int m2522constructorimpl = Operation.ObjectParameter.m2522constructorimpl(1);
        AbstractC3292y.g(interfaceC2072n, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2556setObjectDKhxnng(m2550constructorimpl, m2522constructorimpl, (InterfaceC2072n) Z.d(interfaceC2072n, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & operations.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & operations.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateNode.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }
}
