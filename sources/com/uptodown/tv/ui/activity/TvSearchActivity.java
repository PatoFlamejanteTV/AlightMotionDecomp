package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import android.speech.SpeechRecognizer;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import m5.b;

/* loaded from: classes5.dex */
public final class TvSearchActivity extends b {

    /* renamed from: d, reason: collision with root package name */
    private SpeechRecognizer f31041d;

    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_search_activity);
        if (SpeechRecognizer.isRecognitionAvailable(this)) {
            this.f31041d = SpeechRecognizer.createSpeechRecognizer(this);
        }
    }

    @Override // m5.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        if (this.f31041d != null && SpeechRecognizer.isRecognitionAvailable(this)) {
            SpeechRecognizer speechRecognizer = this.f31041d;
            AbstractC3292y.f(speechRecognizer);
            speechRecognizer.stopListening();
            SpeechRecognizer speechRecognizer2 = this.f31041d;
            AbstractC3292y.f(speechRecognizer2);
            speechRecognizer2.cancel();
            SpeechRecognizer speechRecognizer3 = this.f31041d;
            AbstractC3292y.f(speechRecognizer3);
            speechRecognizer3.destroy();
        }
        this.f31041d = null;
        super.onPause();
    }
}
