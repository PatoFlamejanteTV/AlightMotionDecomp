package j4;

import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3200q implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final C3200q f34241a = new C3200q();

    /* renamed from: j4.q$a */
    /* loaded from: classes4.dex */
    private static final class a implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34242a = new a();

        private a() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 == 0) {
                return 0;
            }
            int i9 = (i8 / 2) + i8;
            if (i8 % 2 == 0) {
                return i9 - 1;
            }
            return i9;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 == 0) {
                return 0;
            }
            return i8 - (i8 / 3);
        }
    }

    private C3200q() {
    }

    private final String a(String str) {
        return AbstractC1435t.w0(l6.n.O0(str, 2), "-", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        AbstractC3292y.i(text, "text");
        return new TransformedText(new AnnotatedString(a(text.getText()), null, null, 6, null), a.f34242a);
    }
}
