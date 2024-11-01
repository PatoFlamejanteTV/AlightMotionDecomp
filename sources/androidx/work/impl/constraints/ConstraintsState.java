package androidx.work.impl.constraints;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes3.dex */
public abstract class ConstraintsState {

    /* loaded from: classes3.dex */
    public static final class ConstraintsMet extends ConstraintsState {
        public static final ConstraintsMet INSTANCE = new ConstraintsMet();

        private ConstraintsMet() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ConstraintsNotMet extends ConstraintsState {
        private final int reason;

        public ConstraintsNotMet(int i8) {
            super(null);
            this.reason = i8;
        }

        public static /* synthetic */ ConstraintsNotMet copy$default(ConstraintsNotMet constraintsNotMet, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i8 = constraintsNotMet.reason;
            }
            return constraintsNotMet.copy(i8);
        }

        public final int component1() {
            return this.reason;
        }

        public final ConstraintsNotMet copy(int i8) {
            return new ConstraintsNotMet(i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.reason == ((ConstraintsNotMet) obj).reason;
        }

        public final int getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason;
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.reason + ')';
        }
    }

    private ConstraintsState() {
    }

    public /* synthetic */ ConstraintsState(AbstractC3284p abstractC3284p) {
        this();
    }
}
