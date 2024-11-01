package androidx.compose.ui.text;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MultiParagraphIntrinsics$maxIntrinsicWidth$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MultiParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraphIntrinsics$maxIntrinsicWidth$2(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        super(0);
        this.this$0 = multiParagraphIntrinsics;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
        if (infoList$ui_text_release.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
            float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
            int o8 = AbstractC1435t.o(infoList$ui_text_release);
            int i8 = 1;
            if (1 <= o8) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i8);
                    float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                    if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        maxIntrinsicWidth = maxIntrinsicWidth2;
                    }
                    if (i8 == o8) {
                        break;
                    }
                    i8++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
    }
}
