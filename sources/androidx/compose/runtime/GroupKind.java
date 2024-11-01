package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m2447constructorimpl(0);
    private static final int Node = m2447constructorimpl(1);
    private static final int ReusableNode = m2447constructorimpl(2);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m2455getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m2456getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m2457getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ GroupKind(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m2446boximpl(int i8) {
        return new GroupKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2447constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2448equalsimpl(int i8, Object obj) {
        return (obj instanceof GroupKind) && i8 == ((GroupKind) obj).m2454unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2449equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2450hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m2451isNodeimpl(int i8) {
        if (i8 != Companion.m2455getGroupULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m2452isReusableimpl(int i8) {
        if (i8 != Companion.m2456getNodeULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2453toStringimpl(int i8) {
        return "GroupKind(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m2448equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2450hashCodeimpl(this.value);
    }

    public String toString() {
        return m2453toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2454unboximpl() {
        return this.value;
    }
}
