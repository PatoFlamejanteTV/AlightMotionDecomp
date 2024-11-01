package androidx.compose.runtime.changelist;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Operations implements OperationsDebugStringFormattable {
    public static final int InitialCapacity = 16;
    private static final int MaxResizeAmount = 1024;
    private int intArgsSize;
    private int objectArgsSize;
    private int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Operation[] opCodes = new Operation[16];
    private int[] intArgs = new int[16];
    private Object[] objectArgs = new Object[16];

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getInt-w8GmfQM */
        public int mo2543getIntw8GmfQM(int i8) {
            return Operations.this.intArgs[this.intIdx + i8];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo2544getObject31yXWZQ(int i8) {
            return (T) Operations.this.objectArgs[this.objIdx + i8];
        }

        public final Operation getOperation() {
            Operation operation = Operations.this.opCodes[this.opIdx];
            AbstractC3292y.f(operation);
            return operation;
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i8 = this.opIdx + 1;
            this.opIdx = i8;
            if (i8 >= Operations.this.opCodesSize) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class WriteScope {
        private final Operations stack;

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m2549boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m2550constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2551equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && AbstractC3292y.d(operations, ((WriteScope) obj).m2558unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2552equalsimpl0(Operations operations, Operations operations2) {
            return AbstractC3292y.d(operations, operations2);
        }

        /* renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m2553getOperationimpl(Operations operations) {
            return operations.peekOperation();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2554hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: setInt-A6tL2VI, reason: not valid java name */
        public static final void m2555setIntA6tL2VI(Operations operations, int i8, int i9) {
            int i10 = 1 << i8;
            if ((operations.pushedIntMask & i10) == 0) {
                operations.pushedIntMask = i10 | operations.pushedIntMask;
                operations.intArgs[operations.m2547topIntIndexOfw8GmfQM(i8)] = i9;
            } else {
                throw new IllegalStateException(("Already pushed argument " + m2553getOperationimpl(operations).mo2485intParamNamew8GmfQM(i8)).toString());
            }
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m2556setObjectDKhxnng(Operations operations, int i8, T t8) {
            int i9 = 1 << i8;
            if ((operations.pushedObjectMask & i9) == 0) {
                operations.pushedObjectMask = i9 | operations.pushedObjectMask;
                operations.objectArgs[operations.m2548topObjectIndexOf31yXWZQ(i8)] = t8;
            } else {
                throw new IllegalStateException(("Already pushed argument " + m2553getOperationimpl(operations).mo2486objectParamName31yXWZQ(i8)).toString());
            }
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2557toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m2551equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m2554hashCodeimpl(this.stack);
        }

        public String toString() {
            return m2557toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m2558unboximpl() {
            return this.stack;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int createExpectedArgMask(int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i8);
    }

    private final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String indent = indent(str);
        int ints = operation.getInts();
        boolean z8 = true;
        for (int i8 = 0; i8 < ints; i8++) {
            int m2511constructorimpl = Operation.IntParameter.m2511constructorimpl(i8);
            String mo2485intParamNamew8GmfQM = operation.mo2485intParamNamew8GmfQM(m2511constructorimpl);
            if (!z8) {
                sb.append(", ");
            } else {
                z8 = false;
            }
            sb.append('\n');
            AbstractC3292y.h(sb, "append('\\n')");
            sb.append(indent);
            sb.append(mo2485intParamNamew8GmfQM);
            sb.append(" = ");
            sb.append(opIterator.mo2543getIntw8GmfQM(m2511constructorimpl));
        }
        int objects = operation.getObjects();
        for (int i9 = 0; i9 < objects; i9++) {
            int m2522constructorimpl = Operation.ObjectParameter.m2522constructorimpl(i9);
            String mo2486objectParamName31yXWZQ = operation.mo2486objectParamName31yXWZQ(m2522constructorimpl);
            if (!z8) {
                sb.append(", ");
            } else {
                z8 = false;
            }
            sb.append('\n');
            AbstractC3292y.h(sb, "append('\\n')");
            sb.append(indent);
            sb.append(mo2486objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo2544getObject31yXWZQ(m2522constructorimpl), indent));
        }
        sb.append('\n');
        AbstractC3292y.h(sb, "append('\\n')");
        sb.append(str);
        sb.append(")");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final int determineNewSize(int i8, int i9) {
        return m.d(i8 + m.g(i8, 1024), i9);
    }

    private final void ensureIntArgsSizeAtLeast(int i8) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (i8 > length) {
            int[] copyOf = Arrays.copyOf(iArr, determineNewSize(length, i8));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.intArgs = copyOf;
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i8) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (i8 > length) {
            Object[] copyOf = Arrays.copyOf(objArr, determineNewSize(length, i8));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.objectArgs = copyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return toCollectionString(AbstractC1428l.Q((Object[]) obj), str);
        }
        if (obj instanceof int[]) {
            return toCollectionString(AbstractC1428l.O((int[]) obj), str);
        }
        if (obj instanceof long[]) {
            return toCollectionString(AbstractC1428l.P((long[]) obj), str);
        }
        if (obj instanceof float[]) {
            return toCollectionString(AbstractC1428l.N((float[]) obj), str);
        }
        if (obj instanceof double[]) {
            return toCollectionString(AbstractC1428l.M((double[]) obj), str);
        }
        if (obj instanceof Iterable) {
            return toCollectionString((Iterable) obj, str);
        }
        if (obj instanceof OperationsDebugStringFormattable) {
            return ((OperationsDebugStringFormattable) obj).toDebugString(str);
        }
        return obj.toString();
    }

    private final String indent(String str) {
        return str + "    ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Operation peekOperation() {
        Operation operation = this.opCodes[this.opCodesSize - 1];
        AbstractC3292y.f(operation);
        return operation;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, String str) {
        return AbstractC1435t.w0(iterable, ", ", "[", "]", 0, null, new Operations$toCollectionString$1(this, str), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: topIntIndexOf-w8GmfQM, reason: not valid java name */
    public final int m2547topIntIndexOfw8GmfQM(int i8) {
        return (this.intArgsSize - peekOperation().getInts()) + i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    public final int m2548topObjectIndexOf31yXWZQ(int i8) {
        return (this.objectArgsSize - peekOperation().getObjects()) + i8;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        AbstractC1428l.t(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void drain(Function1 function1) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                function1.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    public final void forEach(Function1 function1) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                function1.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        if (getSize() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (getSize() != 0) {
            return true;
        }
        return false;
    }

    public final void pop() {
        if (!isEmpty()) {
            Operation[] operationArr = this.opCodes;
            int i8 = this.opCodesSize - 1;
            this.opCodesSize = i8;
            Operation operation = operationArr[i8];
            AbstractC3292y.f(operation);
            this.opCodes[this.opCodesSize] = null;
            int objects = operation.getObjects();
            for (int i9 = 0; i9 < objects; i9++) {
                Object[] objArr = this.objectArgs;
                int i10 = this.objectArgsSize - 1;
                this.objectArgsSize = i10;
                objArr[i10] = null;
            }
            int ints = operation.getInts();
            for (int i11 = 0; i11 < ints; i11++) {
                int[] iArr = this.intArgs;
                int i12 = this.intArgsSize - 1;
                this.intArgsSize = i12;
                iArr[i12] = 0;
            }
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void popInto(Operations operations) {
        if (!isEmpty()) {
            Operation[] operationArr = this.opCodes;
            int i8 = this.opCodesSize - 1;
            this.opCodesSize = i8;
            Operation operation = operationArr[i8];
            AbstractC3292y.f(operation);
            this.opCodes[this.opCodesSize] = null;
            operations.pushOp(operation);
            int i9 = this.objectArgsSize;
            int i10 = operations.objectArgsSize;
            int objects = operation.getObjects();
            for (int i11 = 0; i11 < objects; i11++) {
                i10--;
                i9--;
                Object[] objArr = operations.objectArgs;
                Object[] objArr2 = this.objectArgs;
                objArr[i10] = objArr2[i9];
                objArr2[i9] = null;
            }
            int i12 = this.intArgsSize;
            int i13 = operations.intArgsSize;
            int ints = operation.getInts();
            for (int i14 = 0; i14 < ints; i14++) {
                i13--;
                i12--;
                int[] iArr = operations.intArgs;
                int[] iArr2 = this.intArgs;
                iArr[i13] = iArr2[i12];
                iArr2[i12] = 0;
            }
            this.objectArgsSize -= operation.getObjects();
            this.intArgsSize -= operation.getInts();
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void push(Operation operation) {
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            pushOp(operation);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.").toString());
    }

    @InternalComposeApi
    public final void pushOp(Operation operation) {
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i8 = this.opCodesSize;
        if (i8 == this.opCodes.length) {
            Object[] copyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + m.g(i8, 1024));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.opCodes = (Operation[]) copyOf;
        }
        ensureIntArgsSizeAtLeast(this.intArgsSize + operation.getInts());
        ensureObjectArgsSizeAtLeast(this.objectArgsSize + operation.getObjects());
        Operation[] operationArr = this.opCodes;
        int i9 = this.opCodesSize;
        this.opCodesSize = i9 + 1;
        operationArr[i9] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i8 = 1;
            while (true) {
                sb.append(str);
                int i9 = i8 + 1;
                sb.append(i8);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, str));
                AbstractC3292y.h(sb, "append(value)");
                sb.append('\n');
                AbstractC3292y.h(sb, "append('\\n')");
                if (!opIterator.next()) {
                    break;
                }
                i8 = i9;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String toString() {
        return super.toString();
    }

    public final void push(Operation operation, Function1 function1) {
        pushOp(operation);
        function1.invoke(WriteScope.m2549boximpl(WriteScope.m2550constructorimpl(this)));
        if (this.pushedIntMask == createExpectedArgMask(operation.getInts()) && this.pushedObjectMask == createExpectedArgMask(operation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i8 = 0;
        for (int i9 = 0; i9 < ints; i9++) {
            if (((1 << i9) & this.pushedIntMask) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.mo2485intParamNamew8GmfQM(Operation.IntParameter.m2511constructorimpl(i9)));
                i8++;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int objects = operation.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & this.pushedObjectMask) != 0) {
                if (i8 > 0) {
                    sb3.append(", ");
                }
                sb3.append(operation.mo2486objectParamName31yXWZQ(Operation.ObjectParameter.m2522constructorimpl(i11)));
                i10++;
            }
        }
        String sb4 = sb3.toString();
        AbstractC3292y.h(sb4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + operation + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + sb2 + ") and " + i10 + " object arguments (" + sb4 + ").").toString());
    }
}
