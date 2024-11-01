package j4;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class M implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    private final char f33890a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f33891b;

    /* loaded from: classes4.dex */
    public static final class a implements OffsetMapping {
        a() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 <= 3) {
                return i8;
            }
            if (i8 <= 9) {
                return i8 + 1;
            }
            return i8 + 2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 <= 4) {
                return i8;
            }
            if (i8 <= 11) {
                return i8 - 1;
            }
            return i8 - 2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements OffsetMapping {
        b() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 <= 3) {
                return i8;
            }
            if (i8 <= 7) {
                return i8 + 1;
            }
            if (i8 <= 11) {
                return i8 + 2;
            }
            return i8 + 3;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 <= 4) {
                return i8;
            }
            if (i8 <= 9) {
                return i8 - 1;
            }
            if (i8 <= 14) {
                return i8 - 2;
            }
            return i8 - 3;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements OffsetMapping {
        c() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 <= 3) {
                return i8;
            }
            if (i8 <= 7) {
                return i8 + 1;
            }
            if (i8 <= 11) {
                return i8 + 2;
            }
            if (i8 <= 15) {
                return i8 + 3;
            }
            return i8 + 4;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 <= 4) {
                return i8;
            }
            if (i8 <= 9) {
                return i8 - 1;
            }
            if (i8 <= 14) {
                return i8 - 2;
            }
            if (i8 <= 19) {
                return i8 - 3;
            }
            return i8 - 4;
        }
    }

    public M(char c8) {
        this.f33890a = c8;
    }

    private final TransformedText b(AnnotatedString annotatedString) {
        int length = annotatedString.length();
        String str = "";
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = str + annotatedString.charAt(i8);
            if (i8 == 3 || i8 == 9) {
                str2 = str2 + this.f33890a;
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), new a());
    }

    private final TransformedText c(AnnotatedString annotatedString) {
        int length = annotatedString.length();
        String str = "";
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = str + annotatedString.charAt(i8);
            if (i8 % 4 == 3 && i8 < 15) {
                str2 = str2 + this.f33890a;
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), new b());
    }

    private final TransformedText d(AnnotatedString annotatedString) {
        int length = annotatedString.length();
        String str = "";
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = str + annotatedString.charAt(i8);
            if (i8 % 4 == 3 && i8 < 19) {
                str2 = str2 + this.f33890a;
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), new c());
    }

    public final void a(Integer num) {
        this.f33891b = num;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        int n8;
        AbstractC3292y.i(text, "text");
        EnumC2906e a9 = EnumC2906e.f32115m.a(text.getText());
        Integer num = this.f33891b;
        if (num != null) {
            n8 = num.intValue();
        } else {
            n8 = a9.n(text.getText());
        }
        if (n8 != 19) {
            switch (n8) {
                case 14:
                case 15:
                    return b(text);
                case 16:
                    return c(text);
                default:
                    return c(text);
            }
        }
        return d(text);
    }
}
