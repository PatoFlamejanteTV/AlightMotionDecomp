package W6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes5.dex */
public class r0 extends AbstractC1493t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(boolean z8, int i8, byte[] bArr) {
        super(z8, i8, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int i8;
        if (this.f10872a) {
            i8 = 224;
        } else {
            i8 = PsExtractor.AUDIO_STREAM;
        }
        c1491q.m(z8, i8, this.f10873b, this.f10874c);
    }
}
