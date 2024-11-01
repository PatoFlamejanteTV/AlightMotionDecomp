package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public Syntax findValueByNumber(int i8) {
            return Syntax.forNumber(i8);
        }
    };
    private final int value;

    /* loaded from: classes3.dex */
    private static final class SyntaxVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i8) {
            if (Syntax.forNumber(i8) != null) {
                return true;
            }
            return false;
        }
    }

    Syntax(int i8) {
        this.value = i8;
    }

    public static Syntax forNumber(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i8) {
        return forNumber(i8);
    }
}
