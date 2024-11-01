package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public interface OffsetMapping {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i8) {
                return i8;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i8) {
                return i8;
            }
        };

        private Companion() {
        }

        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i8);

    int transformedToOriginal(int i8);
}
